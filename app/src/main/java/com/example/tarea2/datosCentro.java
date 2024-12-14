package com.example.tarea2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class datosCentro extends AppCompatActivity {
ImageView facebook;
ImageView web;
ImageButton atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_centro);
        facebook = findViewById(R.id.facebook);
        facebook.setOnClickListener(view -> {
            Intent face = new Intent(view.getContext(), facebook.class);
            startActivity(face);
        });
        web = findViewById(R.id.web);
        web.setOnClickListener(view -> {
            Intent weblink = new Intent(view.getContext(), centroWeb.class);
            startActivity(weblink);
        });
        atras = findViewById(R.id.atras);
        atras.setOnClickListener(view -> {
            Intent atrasLink = new Intent(view.getContext(), MainActivity2.class);
            startActivity(atrasLink);
        });
    }
}