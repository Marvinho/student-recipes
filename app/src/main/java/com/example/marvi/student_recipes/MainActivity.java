package com.example.marvi.student_recipes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView recipesView;
    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.recipe_recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        ArrayList<Recipe> mRecipesList = new ArrayList<Recipe>();
        Recipe mPitta = new Recipe("Pizza", "fhwiefhwui");
        Recipe mKuchen = new Recipe("Kuchen", "fhwiefhwui");
        Recipe mToast = new Recipe("Toast", "fhwiefhwui");
        Recipe mSojapflaume = new Recipe("Sojapflaume", "fhwiefhwui");
        mRecipesList.add(mPitta);
        mRecipesList.add(mKuchen);
        mRecipesList.add(mToast);
        mRecipesList.add(mSojapflaume);
        mAdapter = new MyAdapter(mRecipesList);
        mRecyclerView.setAdapter(mAdapter);
    }
}
