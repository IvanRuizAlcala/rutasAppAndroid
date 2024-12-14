package com.example.tarea2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class AltaJugador extends AppCompatActivity {
    Jugador jugador;
    EditText nombreJugador;
    EditText primerApellido;
    EditText password;
    EditText nombreUsuario;
    RepoBBDD archivo;
    Button registro;
    RadioGroup radio;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta_usuario);
        nombreJugador = findViewById(R.id.nombreJugador);
        primerApellido = findViewById(R.id.apellidosJugador);
        nombreUsuario = findViewById(R.id.userBox);
        password = findViewById(R.id.password);
        registro = findViewById(R.id.registro);
        radio = findViewById(R.id.radioGroup2);

        registro.setOnClickListener(v -> {
            int checkedRadioButtonId = radio.getCheckedRadioButtonId();
            radioButton = findViewById(checkedRadioButtonId);
            jugador = new Jugador(
                    nombreJugador.getText().toString(),
                    primerApellido.getText().toString(),
                    password.getText().toString(),
                    radioButton.getText().toString(),
                    nombreUsuario.getText().toString()
                    );

            archivo = new RepoBBDD(this);
            List<Jugador> jugadores = archivo.leerArchivo("Jugadores.txt");

            boolean jugadorExiste = false;
            for (Jugador j : jugadores) {
                if (j.getNombre().equals(nombreJugador.getText().toString()) &&
                        j.getPrimerApellido().equals(primerApellido.getText().toString())&&
                        j.nombreUsuario.equals(nombreUsuario.getText().toString())
                ) {
                    jugadorExiste = true;
                    break;
                }
            }

            if (jugadorExiste) {
                Toast.makeText(this, "El usuario ya existe", Toast.LENGTH_SHORT).show();
            } else {
                archivo.crearArchivo("Jugadores.txt");
                archivo.guardarJugador(jugador);
                Toast.makeText(this, "Usuario registrado con éxito", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Loggin.class);
                startActivity(intent);
            }

            archivo.cerrarArchivo();
        });
    }
}
