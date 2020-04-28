package com.example.arunsampeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextA, editTextB;
    private Button btnSum, btnNext;
    private TextView textSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity", "On Create");

        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        btnSum = findViewById(R.id.btnSum);
        btnNext = findViewById(R.id.btnNextAcitvity);
        textSum = findViewById(R.id.textSum);


        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int a = Integer.valueOf(editTextA.getText().toString());
                final int b = Integer.valueOf(editTextB.getText().toString());

                textSum.setText(String.valueOf(doSum(a,b)));

            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("sumOfMarks", textSum.getText().toString());
                startActivity(intent);
                finish();
            }
        });



    }


    private Integer doSum(int a , int b){
        return a+b;
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.v("MainActivity", "On start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("MainActivity", "On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("MainActivity", "On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("MainActivity", "On Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("MainActivity", "On Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("MainActivity", "On Restart");
    }
}
