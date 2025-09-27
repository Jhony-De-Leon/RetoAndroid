package com.example.retoandroid2;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class Meal {
    @SerializedName("idMeal")
    public String idMeal;
    @SerializedName("strMeal")
    public String strMeal;
    @SerializedName("strCategory")
    public String strCategory;
    @SerializedName("strArea")
    public String strArea;
    @SerializedName("strInstructions")
    public String strInstructions;
    @SerializedName("strMealThumb")
    public String strMealThumb;

    // Ingredientes y medidas (hasta 20)
    @SerializedName("strIngredient1") public String strIngredient1;
    @SerializedName("strIngredient2") public String strIngredient2;
    @SerializedName("strIngredient3") public String strIngredient3;
    @SerializedName("strIngredient4") public String strIngredient4;
    @SerializedName("strIngredient5") public String strIngredient5;
    @SerializedName("strIngredient6") public String strIngredient6;
    @SerializedName("strIngredient7") public String strIngredient7;
    @SerializedName("strIngredient8") public String strIngredient8;
    @SerializedName("strIngredient9") public String strIngredient9;
    @SerializedName("strIngredient10") public String strIngredient10;
    @SerializedName("strIngredient11") public String strIngredient11;
    @SerializedName("strIngredient12") public String strIngredient12;
    @SerializedName("strIngredient13") public String strIngredient13;
    @SerializedName("strIngredient14") public String strIngredient14;
    @SerializedName("strIngredient15") public String strIngredient15;
    @SerializedName("strIngredient16") public String strIngredient16;
    @SerializedName("strIngredient17") public String strIngredient17;
    @SerializedName("strIngredient18") public String strIngredient18;
    @SerializedName("strIngredient19") public String strIngredient19;
    @SerializedName("strIngredient20") public String strIngredient20;

    @SerializedName("strMeasure1") public String strMeasure1;
    @SerializedName("strMeasure2") public String strMeasure2;
    @SerializedName("strMeasure3") public String strMeasure3;
    @SerializedName("strMeasure4") public String strMeasure4;
    @SerializedName("strMeasure5") public String strMeasure5;
    @SerializedName("strMeasure6") public String strMeasure6;
    @SerializedName("strMeasure7") public String strMeasure7;
    @SerializedName("strMeasure8") public String strMeasure8;
    @SerializedName("strMeasure9") public String strMeasure9;
    @SerializedName("strMeasure10") public String strMeasure10;
    @SerializedName("strMeasure11") public String strMeasure11;
    @SerializedName("strMeasure12") public String strMeasure12;
    @SerializedName("strMeasure13") public String strMeasure13;
    @SerializedName("strMeasure14") public String strMeasure14;
    @SerializedName("strMeasure15") public String strMeasure15;
    @SerializedName("strMeasure16") public String strMeasure16;
    @SerializedName("strMeasure17") public String strMeasure17;
    @SerializedName("strMeasure18") public String strMeasure18;
    @SerializedName("strMeasure19") public String strMeasure19;
    @SerializedName("strMeasure20") public String strMeasure20;

    // Método para obtener lista de ingredientes con medidas
    public List<String> getIngredientesConMedidas() {
        List<String> lista = new ArrayList<>();
        String[] ingredientes = {strIngredient1, strIngredient2, strIngredient3, strIngredient4, strIngredient5, strIngredient6, strIngredient7, strIngredient8, strIngredient9, strIngredient10, strIngredient11, strIngredient12, strIngredient13, strIngredient14, strIngredient15, strIngredient16, strIngredient17, strIngredient18, strIngredient19, strIngredient20};
        String[] medidas = {strMeasure1, strMeasure2, strMeasure3, strMeasure4, strMeasure5, strMeasure6, strMeasure7, strMeasure8, strMeasure9, strMeasure10, strMeasure11, strMeasure12, strMeasure13, strMeasure14, strMeasure15, strMeasure16, strMeasure17, strMeasure18, strMeasure19, strMeasure20};
        for (int i = 0; i < ingredientes.length; i++) {
            if (ingredientes[i] != null && !ingredientes[i].trim().isEmpty()) {
                String medida = (medidas[i] != null) ? medidas[i].trim() : "";
                lista.add("- " + ingredientes[i].trim() + (medida.isEmpty() ? "" : (" (" + medida + ")")));
            }
        }
        return lista;
    }
}

