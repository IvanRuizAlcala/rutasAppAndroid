package com.example.tarea2;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class facebook extends AppCompatActivity {
WebView face;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        face = findViewById(R.id.face);
        face.loadUrl("https://www.facebook.com/iesocuatrodeabril.zahinos.9");
    }
}