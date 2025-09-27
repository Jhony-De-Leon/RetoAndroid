package com.example.retoandroid2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TheMealDBApi api;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Configurar Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.themealdb.com/api/json/v1/1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(TheMealDBApi.class);

        Button btnRecomendar = findViewById(R.id.btn_recomendar);
        progressBar = findViewById(R.id.progressBar);
        btnRecomendar.setOnClickListener(v -> obtenerRecetaAleatoria());
    }

    private void obtenerRecetaAleatoria() {
        progressBar.setVisibility(View.VISIBLE);
        Call<MealResponse> call = api.getRandomMeal();
        call.enqueue(new Callback<MealResponse>() {
            @Override
            public void onResponse(Call<MealResponse> call, Response<MealResponse> response) {
                progressBar.setVisibility(View.GONE);
                if (response.isSuccessful() && response.body() != null && response.body().meals != null && !response.body().meals.isEmpty()) {
                    Meal meal = response.body().meals.get(0);
                    Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
                    intent.putExtra("nombre", meal.strMeal);
                    intent.putExtra("categoria", meal.strCategory);
                    intent.putExtra("pais", meal.strArea);
                    intent.putExtra("imagen", meal.strMealThumb);
                    intent.putExtra("instrucciones", meal.strInstructions);
                    intent.putStringArrayListExtra("ingredientes", new ArrayList<>(meal.getIngredientesConMedidas()));
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "No se pudo obtener la receta. Intenta de nuevo.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<MealResponse> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Error de red: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}