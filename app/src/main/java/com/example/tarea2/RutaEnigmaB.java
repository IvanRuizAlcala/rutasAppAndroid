package com.example.tarea2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class RutaEnigmaB extends AppCompatActivity {
    MyReciclerViewAdapter adapter;
    TextView cabecera;
    TextView texto1;
    TextView texto2;
    TextView texto3;
    TextView texto4;
    TextView texto5;
    String solucion;
    RadioGroup radio;
    RadioButton radioButton;
    Button buton;
    int contadorB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ruta_enigma_b);
        Intent intent = getIntent();
        ArrayList<String> ruta = intent.getStringArrayListExtra("rutaB");
        contadorB = intent.getIntExtra("pasoContadorA", 0);
        cabecera = findViewById(R.id.head);
        cabecera.setText(ruta.get(0));
        texto1 = findViewById(R.id.contextOption);
        texto1.setText(ruta.get(1));
        texto2 = findViewById(R.id.otption1);
        texto2.setText(ruta.get(2));
        texto3 = findViewById(R.id.option2);
        texto3.setText(ruta.get(3));
        texto4 = findViewById(R.id.option3);
        texto4.setText(ruta.get(4));
        texto5 = findViewById(R.id.option4);
        texto5.setText(ruta.get(5));
        solucion = ruta.get(6);

        radio = findViewById(R.id.radioGroup);
        buton = findViewById(R.id.button2);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedRadioButtonId = radio.getCheckedRadioButtonId();
                radioButton = findViewById(checkedRadioButtonId);
                if (radioButton != null) {
                    String selectedText = radioButton.getText().toString();
                    if (solucion.equals(selectedText)) {
                        Intent intentEnigmaA = new Intent(RutaEnigmaB.this, Rutas.class);
                        intentEnigmaA.putExtra("unlockedB", true);
                        intentEnigmaA.putExtra("contadorB", contadorB);
                        startActivity(intentEnigmaA);

                    } else {
                        Toast.makeText(RutaEnigmaB.this, "Respuesta Incorrecta", Toast.LENGTH_SHORT).show();
                        contadorB++;
                    }
                } else {
                    Toast.makeText(RutaEnigmaB.this, "Por favor, selecciona una opción", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
            editor.apply();
        }
    }