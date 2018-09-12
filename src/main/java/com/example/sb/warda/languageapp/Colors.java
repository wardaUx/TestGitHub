package com.example.sb.warda.languageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.sb.warda.languageapp.R.drawable.after;

public class Colors extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    Button btnFeed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        textView = findViewById(R.id.textView);
        btnFeed = findViewById(R.id.btnFeed);
        imageView = findViewById(R.id.imageView);
        btnFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("O yes I am full :D ");
            imageView.setImageResource(R.drawable.after);
            }
        });
    }
}
