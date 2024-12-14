package com.example.tarea2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class Loggin extends AppCompatActivity {
    RepoBBDD db;
    Button logarse;
    Button registrarse;
    EditText jugador;
    EditText contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggin);

        db = new RepoBBDD(this);
        jugador = findViewById(R.id.userMail);
        contraseña = findViewById(R.id.userPassword);
        logarse = findViewById(R.id.loginButton);

        List<Jugador> jugadores = db.leerArchivo("jugadores.txt");
        if (jugadores.isEmpty()) {
            db.crearArchivo("jugadores.txt");
        }

        registrarse = findViewById(R.id.loginButton2);
        registrarse.setOnClickListener(v -> {
            Intent intent = new Intent(this, AltaJugador.class);
            startActivity(intent);
        });

        logarse.setOnClickListener(v -> {
            boolean usuarioEncontrado = false;

            for (Jugador jugador : jugadores) {
                if (jugador.getNombreUsuario().equals(this.jugador.getText().toString()) &&
                        jugador.getPassword().equals(this.contraseña.getText().toString())) {
                    usuarioEncontrado = true;
                    Toast.makeText(this, "Bienvenido " + jugador.getNombreUsuario(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, MainActivity2.class);
                    intent.putExtra("Nombre", jugador.getNombre());
                    intent.putExtra("Apellido", jugador.getPrimerApellido());
                    intent.putExtra("Password", jugador.getPassword());
                    intent.putExtra("Avatar", jugador.getAvatar());
                    startActivity(intent);
                    break;
                }
            }

            if (!usuarioEncontrado) {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


