package com.example.jeudescouleurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addText (View v){
        final TextView textView = findViewById(R.id.text1);
        final EditText edit = findViewById(R.id.nom);
        textView.setText(edit.getText());
    }

    public void accesScores (View view) {
        startActivity(new Intent(this, Page_scores.class));
    }

    public void accesJeu (View view) {
        startActivity(new Intent(this, Page_jeu.class));
    }
}
