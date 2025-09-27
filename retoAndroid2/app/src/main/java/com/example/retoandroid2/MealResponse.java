package com.example.retoandroid2;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class MealResponse {
    @SerializedName("meals")
    public List<Meal> meals;
}

