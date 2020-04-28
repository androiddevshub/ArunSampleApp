package com.example.arunsampeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textViewReceived;
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewReceived = findViewById(R.id.textRecevied);
        btnExit = findViewById(R.id.btnExit);

        Intent intent = getIntent();

        String textReceived = intent.getStringExtra("sumOfMarks");
        textViewReceived.setText(textReceived);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
