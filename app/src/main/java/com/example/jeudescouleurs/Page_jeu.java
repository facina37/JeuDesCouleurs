package com.example.jeudescouleurs;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Page_jeu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_jeu);
        final Button monButton = findViewById(R.id.button1);
        monButton.setBackgroundColor(Color.WHITE);
    }
}
