package com.example.retoandroid2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        ImageView imgPlatillo = findViewById(R.id.img_platillo);
        TextView txtNombre = findViewById(R.id.txt_nombre);
        TextView txtCategoria = findViewById(R.id.txt_categoria);
        TextView txtPais = findViewById(R.id.txt_pais);
        TextView txtListaIngredientes = findViewById(R.id.txt_lista_ingredientes);
        TextView txtPasos = findViewById(R.id.txt_pasos);

        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String categoria = intent.getStringExtra("categoria");
        String pais = intent.getStringExtra("pais");
        String imagen = intent.getStringExtra("imagen");
        String instrucciones = intent.getStringExtra("instrucciones");
        ArrayList<String> ingredientes = intent.getStringArrayListExtra("ingredientes");

        txtNombre.setText(nombre);
        txtCategoria.setText(categoria);
        txtPais.setText(pais);
        txtPasos.setText(instrucciones);
        if (ingredientes != null) {
            StringBuilder sb = new StringBuilder();
            for (String ing : ingredientes) {
                sb.append(ing).append("\n");
            }
            txtListaIngredientes.setText(sb.toString());
        }
        Glide.with(this).load(imagen).into(imgPlatillo);

        // Botón para volver a la pantalla principal
        findViewById(R.id.btn_volver).setOnClickListener(v -> finish());
    }
}
