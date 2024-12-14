package com.example.tarea2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    ImageView avatar;
    TextView nombre;
    String avatarUsuario;
    String apellidoUsuario;
    String nombreUsuario;
    ImageView mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView centro = findViewById(R.id.centro);
        ImageView ruta = findViewById(R.id.rutas);
        avatar = findViewById(R.id.avatar);
        nombre = findViewById(R.id.nombre);
        Intent intent = getIntent();
        nombreUsuario = intent.getStringExtra("Nombre");
        apellidoUsuario = intent.getStringExtra("Apellido");
        nombre.setText("Bienvenido " + nombreUsuario + " " + apellidoUsuario);
        avatarUsuario = intent.getStringExtra("Avatar");
        if (avatarUsuario.equals("Genaro")) {
            avatar.setImageResource(R.drawable.avataruno);
        }
        if (avatarUsuario.equals("Anastasia")) {
            avatar.setImageResource(R.drawable.avatardos);
        }
        if (avatarUsuario.equals("Grinch")) {
            avatar.setImageResource(R.drawable.avatartres);
        }
        if (avatarUsuario.equals("Rodolfo")) {
            avatar.setImageResource(R.drawable.avatarcuatro);
        }

        centro.setOnClickListener(view -> {
            Intent centroInt = new Intent(view.getContext(), datosCentro.class);
            startActivity(centroInt);
            finish();
        });
        ruta.setOnClickListener(view -> {
            Intent rutaInt = new Intent(view.getContext(), Rutas.class);
            startActivity(rutaInt);
            finish();
        });
        mapa = findViewById(R.id.mapa);
        mapa.setOnClickListener(view -> {
            Intent mapaInt = new Intent(view.getContext(), Mapa.class);
            startActivity(mapaInt);
            finish();

        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        int contadorFinal = 0;
        editor.putString("Nombre", nombreUsuario);
        editor.putString("Apellido", apellidoUsuario);
        editor.putString("Avatar", avatarUsuario);
        editor.clear();
        editor.apply();
    }
}
