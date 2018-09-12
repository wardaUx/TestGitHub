package com.example.sb.warda.languageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView numbers, colors, family, phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers = findViewById(R.id.numbers);
        colors = findViewById(R.id.colors);
        family = findViewById(R.id.family);
        phrases = findViewById(R.id.phrases);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Numbers.class);
                startActivity(intent);
            }
        });
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Colors.class);
                startActivity(intent);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Family.class);
                startActivity(intent);
            }
        });
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Phrases.class);
                startActivity(intent);
            }
        });



}
}