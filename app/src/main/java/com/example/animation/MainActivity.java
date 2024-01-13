package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button blink = findViewById(R.id.blink);
        Button fade = findViewById(R.id.fade);
        Button move = findViewById(R.id.move);
        Button slide_down = findViewById(R.id.slide_down);
        Button slide_up = findViewById(R.id.slide_up);
        Button zoom_in = findViewById(R.id.zoom_in);

        slide_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(".MainActivity2");
                startActivity(intent);
                overridePendingTransition(R.anim.slide_up,R.anim.slide_up);
            }
        });
        slide_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(".MainActivity2");
                startActivity(intent);
                overridePendingTransition(R.anim.slide_down,R.anim.slide_down);
            }
        });
        zoom_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(".MainActivity2");
                startActivity(intent);
                overridePendingTransition(R.anim.zoom_in,R.anim.zoom_in);
            }
        });
        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(".MainActivity2");
                startActivity(intent);
                overridePendingTransition(R.anim.fade,R.anim.fade);
            }
        });
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(".MainActivity2");
                startActivity(intent);
                overridePendingTransition(R.anim.move,R.anim.move);
            }
        });
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(".MainActivity2");
                startActivity(intent);
                overridePendingTransition(R.anim.blink,R.anim.blink);
            }
        });

    }
}