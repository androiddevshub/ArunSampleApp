package com.example.arunsampeapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main4Activity extends AppCompatActivity {

    private ListView listViewSimple;
    private ArrayAdapter arrayAdapter;
    private String[] languages = new String[]{"Java", "Ruby", "C", "C++", "Go" };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        listViewSimple = findViewById(R.id.listViewSimple);

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, languages);

        listViewSimple.setAdapter(arrayAdapter);


    }
}
