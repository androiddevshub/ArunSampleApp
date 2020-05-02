package com.example.arunsampeapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageView = findViewById(R.id.imageView);

        Bitmap logo = BitmapFactory.decodeResource(getResources(), R.drawable.orange_color).copy(Bitmap.Config.ARGB_8888, true);

        Canvas canvas = new Canvas(logo);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(android.R.color.black)); // Text Color
        paint.setTextSize(getResources().getDimension(R.dimen.text_size)); //Text Size

        canvas.drawText("Created by AndroidClarified", 0, logo.getHeight() - 20, paint);

        imageView.setImageBitmap(logo);

    }
}
