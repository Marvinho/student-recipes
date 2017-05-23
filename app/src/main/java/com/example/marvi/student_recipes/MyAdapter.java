package com.example.marvi.student_recipes;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Marvi on 20.05.2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<Recipe> mRecipes;

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mRecipeTitle;
        private Recipe mRecipe;


        public ViewHolder(View v){
            super(v);
            mRecipeTitle = (TextView) v.findViewById(R.id.mRecipeName);
            v.setOnClickListener(this);
        }

        public void bindRecipe(Recipe recipe){
            mRecipe = recipe;
            mRecipeTitle.setText(mRecipe.getRecipeName());
        }

        @Override
        public void onClick(View v) {
            Log.d("RecyclerView","HFEWFHEWJ");
        }
    }

    public MyAdapter(ArrayList<Recipe> recipes){
        mRecipes = recipes;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recipe_list, parent, false);
        return new ViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        Recipe itemRecipe = mRecipes.get(position);
        holder.bindRecipe(itemRecipe);
    }

    @Override
    public int getItemCount() {
        return mRecipes.size();
    }
}