package com.example.marvi.student_recipes;

/**
 * Created by Marvi on 13.05.2017.
 */

public class Recipe {
    private String recipeName;
    private double price;
    private String recipeDescription;
    private int recipeImageId;

    public Recipe(String mRecipeName, String mRecipeDescription){
        recipeDescription = mRecipeDescription;
        recipeName = mRecipeName;

    }


    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public int getRecipeImageId() {
        return recipeImageId;
    }
}
