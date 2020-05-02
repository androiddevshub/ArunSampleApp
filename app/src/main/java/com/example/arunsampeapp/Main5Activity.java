package com.example.arunsampeapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    private ListView listViewCustom;

    private CustomAdapter customAdapter;

    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        listViewCustom = findViewById(R.id.listViewCustom);

        arrayList.add("Java");
        arrayList.add("Ruby");
        arrayList.add("C++");
        arrayList.add("Go");


        customAdapter = new CustomAdapter(arrayList, this);

        listViewCustom.setAdapter(customAdapter);


    }
}
