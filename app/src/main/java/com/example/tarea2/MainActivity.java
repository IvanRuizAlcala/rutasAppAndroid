package com.example.tarea2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    String enteredUserName = " ";
    String enteredPassword = " ";
    String userName = " ";
    String userPassword = " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView login = findViewById(R.id.loginButton);
        setContentView(R.layout.activity_main);

        findViewById(R.id.loginButton).setOnClickListener(view -> {
                    Intent intentAdmin = new Intent(view.getContext(), Loggin.class);
                    startActivity(intentAdmin);
                    finish();
            });
    }
}