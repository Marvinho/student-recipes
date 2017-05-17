package com.example.marvi.student_recipes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView recipesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recipesView = (TextView) findViewById(R.id.recipes);
        ArrayList<String> list = new ArrayList<String>();
        list.add("Pizza");
        list.add("Kuchen");
        list.add("hefkwhfkewfhwekfjhewfkwegfiewfhwefkgwfuwegfiwefgwi");
        for(String i : list){
            recipesView.append(i+"\n\n");
        }

    }
}
