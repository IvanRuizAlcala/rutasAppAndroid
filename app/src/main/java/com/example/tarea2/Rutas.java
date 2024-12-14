package com.example.tarea2;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class Rutas extends AppCompatActivity {
    HashMap<Integer, MenuSelector> menuOpciones = new HashMap<>();
    ImageView rutaA;
    ImageView rutaB;
    ImageView rutaC;
    ImageView rutaD;
    ImageView finalTrayecto;
    Spinner spinner;
    ArrayList<String> rutas = new ArrayList<>();
    menuCreator creador;
    MenuItem menuItem;
    String imageViewTag;
    Intent intentEnigmaA;
    Intent intentEnigmaB;
    Intent intentEnigmaC;
    Intent intentEnigmaD;
    int contadorFinal;
    ArrayList<String> frases;
    TextView cajaTexto;
    boolean unlockedA;
    boolean unlockedB;
    boolean unlockedC;
    boolean unlockedD;
    int contadorA;
    int contadorB;
    int contadorC;
    int contadorD;
    int selector;
    ImageView avatarUsuario;
    TextView nombreUsuario;
    ImageView corazonUno;
    ImageView corazonDos;
    ImageView corazonTres;
    String apellido, nombre, avatar;
    ImageView aventurero1, aventurero2, aventurero3, aventurero4, aventurero5;
    static int contadorStatico = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutas);
        rutas.add("ruta matematica");
        rutas.add("ruta literaria");
        rutas.add("ruta fisica");
        rutas.add("ruta quimica");
        rutas.add("ruta artistica");
        rutas.add("ruta tecnologia");
        spinner = findViewById(R.id.spinner3);
        miAdaptador adap = new miAdaptador(this, R.layout.elemento, rutas);
        spinner.setAdapter(adap);
        menuOpciones.put(0, new EnigmaMatematicas());
        menuOpciones.put(1, new EnigmaLiteratura());
        menuOpciones.put(2, new EnigmaFisica());
        menuOpciones.put(3, new EnigmaQuimica());
        menuOpciones.put(4, new EnigmaArtistica());
        menuOpciones.put(5, new EnigmaMatematicas());

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selector = spinner.getSelectedItemPosition();
                creador = new menuCreator(menuOpciones.get(selector));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        rutaA = findViewById(R.id.ruta1);
        rutaA.setTag("rutaA");
        rutaB = findViewById(R.id.ruta2);
        rutaB.setTag("rutaB");
        rutaC = findViewById(R.id.ruta3);
        rutaC.setTag("rutaC");
        rutaD = findViewById(R.id.ruta4);
        rutaD.setTag("rutaD");
        finalTrayecto = findViewById(R.id.finaltrayecto);
        registerForContextMenu(rutaA);
        registerForContextMenu(rutaB);
        registerForContextMenu(rutaC);
        registerForContextMenu(rutaD);
        aventurero1 = findViewById(R.id.aventurero1);
        aventurero2 = findViewById(R.id.aventurero2);
        aventurero3 = findViewById(R.id.aventurero3);
        aventurero4 = findViewById(R.id.aventurero4);
        aventurero5 = findViewById(R.id.aventurero5);
        intentEnigmaA = getIntent();
        intentEnigmaB = getIntent();
        intentEnigmaC = getIntent();
        intentEnigmaD = getIntent();
        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        nombre = prefs.getString("Nombre", "Usuario");
        apellido = prefs.getString("Apellido", "apellidos");
        avatar = prefs.getString("Avatar", "default_avatar");
        corazonUno = findViewById(R.id.corazonUno);
        corazonDos = findViewById(R.id.corazonDos);
        corazonTres = findViewById(R.id.corazonTres);
        nombreUsuario = findViewById(R.id.usuario);
        avatarUsuario = findViewById(R.id.avataruser);
        nombreUsuario.setText("Bienvenido " + nombre + " " + apellido);
        if (avatar != null) {
            switch (avatar) {
                case "Genaro":
                    avatarUsuario.setImageResource(R.drawable.avataruno);
                    break;
                case "Anastasia":
                    avatarUsuario.setImageResource(R.drawable.avatardos);
                    break;
                case "Grinch":
                    avatarUsuario.setImageResource(R.drawable.avatartres);
                    break;
                case "Rodolfo":
                    avatarUsuario.setImageResource(R.drawable.avatarcuatro);
                    break;
            }
        }
        ArrayList<String> frases = new ArrayList<>();
        frases.add("¡Enigma resuelto y cerebros salvados! Sherlock Holmes estaría orgulloso.");
        frases.add("¡Bravo! Has descifrado el misterio. Alguien merece un aplauso... y una siesta.");
        frases.add("¡Impresionante! Otro enigma descifrado, otro día más siendo una leyenda viviente.");
        cajaTexto = findViewById(R.id.cajaTexto);

        finalTrayecto.post(new Runnable() {
            @Override
            public void run() {
                float targetX = rutaA.getX();
                float targetY = rutaA.getY();
                ObjectAnimator animX = ObjectAnimator.ofFloat(aventurero1, "x", targetX);
                ObjectAnimator animY = ObjectAnimator.ofFloat(aventurero1, "y", targetY);
                animX.setDuration(4000);
                animY.setDuration(4000);
                animX.start();
                animY.start();
            }
        });

        unlockedA = intentEnigmaA.getBooleanExtra("unlocked", false);
        contadorA = intentEnigmaA.getIntExtra("contadorA", 0);
        unlockedB = intentEnigmaB.getBooleanExtra("unlockedB", false);
        contadorB = intentEnigmaB.getIntExtra("contadorB", 0);
        unlockedC = intentEnigmaC.getBooleanExtra("unlockedC", false);
        contadorC = intentEnigmaB.getIntExtra("contadorC", 0);
        unlockedD = intentEnigmaD.getBooleanExtra("unlockedD", false);
        contadorD = intentEnigmaB.getIntExtra("contadorD", 0);
        contadorFinal = contadorA+contadorB+contadorC+contadorD;
        if(contadorFinal == 1){
            corazonUno.setVisibility(View.INVISIBLE);
        }
        if(contadorFinal == 2){
            corazonUno.setVisibility(View.INVISIBLE);
            corazonDos.setVisibility(View.INVISIBLE);
        }
        if(contadorFinal == 3){
            unlockedA = false;
            unlockedB = false;
            unlockedC = false;
            unlockedD = true;
            corazonUno.setVisibility(View.VISIBLE);
            corazonDos.setVisibility(View.VISIBLE);
            corazonTres.setVisibility(View.VISIBLE);
            contadorFinal = 0;
        }

        if (unlockedA) {
            spinner.setVisibility(View.INVISIBLE);
            aventurero1.setVisibility(View.INVISIBLE);
            aventurero2.setVisibility(View.VISIBLE);
            rutaB.post(new Runnable() {
                @Override
                public void run() {
                    float targetX = rutaB.getX();
                    float targetY = rutaB.getY();
                    ObjectAnimator animX = ObjectAnimator.ofFloat(aventurero2, "x", targetX);
                    ObjectAnimator animY = ObjectAnimator.ofFloat(aventurero2, "y", targetY);
                    animX.setDuration(4000);
                    animY.setDuration(4000);
                    animX.start();
                    animY.start();
                }
            });
            cajaTexto.setText(frases.get(0));
            rutaB.setVisibility(View.VISIBLE);
        }
        if (unlockedB) {
            spinner.setVisibility(View.INVISIBLE);
            aventurero1.setVisibility(View.INVISIBLE);
            aventurero2.setVisibility(View.INVISIBLE);
            aventurero5.setVisibility(View.VISIBLE);
            if(contadorFinal == 2){
                corazonUno.setVisibility(View.INVISIBLE);
                corazonDos.setVisibility(View.INVISIBLE);
            }
            rutaB.post(new Runnable() {
                @Override
                public void run() {
                    float targetX = rutaC.getX();
                    float targetY = rutaC.getY();
                    ObjectAnimator animX = ObjectAnimator.ofFloat(aventurero5, "x", targetX);
                    ObjectAnimator animY = ObjectAnimator.ofFloat(aventurero5, "y", targetY);
                    animX.setDuration(4000);
                    animY.setDuration(4000);
                    animX.start();
                    animY.start();
                }
            });
            cajaTexto.setText(frases.get(1));
            rutaB.setVisibility(View.VISIBLE);
            rutaC.setVisibility(View.VISIBLE);

        }
        if (unlockedC) {
            spinner.setVisibility(View.INVISIBLE);
            aventurero1.setVisibility(View.INVISIBLE);
            aventurero2.setVisibility(View.INVISIBLE);
            aventurero5.setVisibility(View.INVISIBLE);
            aventurero3.setVisibility(View.VISIBLE);
            rutaB.post(new Runnable() {
                @Override
                public void run() {
                    float targetX = rutaD.getX();
                    float targetY = rutaD.getY();
                    ObjectAnimator animX = ObjectAnimator.ofFloat(aventurero3, "x", targetX);
                    ObjectAnimator animY = ObjectAnimator.ofFloat(aventurero3, "y", targetY);
                    animX.setDuration(4000);
                    animY.setDuration(4000);
                    animX.start();
                    animY.start();
                }
            });
            rutaB.setVisibility(View.VISIBLE);
            rutaC.setVisibility(View.VISIBLE);
            rutaD.setVisibility(View.VISIBLE);
            cajaTexto.setText(frases.get(2));
        }
        if (unlockedD) {
            spinner.setVisibility(View.INVISIBLE);
            aventurero1.setVisibility(View.INVISIBLE);
            aventurero3.setVisibility(View.INVISIBLE);
            aventurero4.setVisibility(View.VISIBLE);
            rutaB.post(new Runnable() {
                @Override
                public void run() {
                    float targetX = finalTrayecto.getX();
                    float targetY = finalTrayecto.getY();
                    ObjectAnimator animX = ObjectAnimator.ofFloat(aventurero4, "x", targetX);
                    ObjectAnimator animY = ObjectAnimator.ofFloat(aventurero4, "y", targetY);
                    animX.setDuration(4000);
                    animY.setDuration(4000);
                    animX.start();
                    animY.start();
                }
            });
            rutaB.setVisibility(View.VISIBLE);
            rutaC.setVisibility(View.VISIBLE);
            rutaD.setVisibility(View.VISIBLE);
            rutaA.setVisibility(View.VISIBLE);
            rutaB.setVisibility(View.INVISIBLE);
            rutaC.setVisibility(View.INVISIBLE);
            rutaD.setVisibility(View.INVISIBLE);
            finalTrayecto.setVisibility(View.INVISIBLE);
            aventurero1.setVisibility(View.VISIBLE);
            aventurero2.setVisibility(View.INVISIBLE);
            aventurero3.setVisibility(View.INVISIBLE);
            aventurero4.setVisibility(View.INVISIBLE);
            aventurero5.setVisibility(View.INVISIBLE);
            unlockedA = false;
            unlockedB = false;
            unlockedC = false;
            unlockedD = false;
            contadorFinal = 0;
            corazonUno.setVisibility(View.VISIBLE);
            corazonDos.setVisibility(View.VISIBLE);
            corazonTres.setVisibility(View.VISIBLE);
            rutas.remove(selector);
            spinner.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo
            menuInfo) {
        menu.setHeaderTitle("ENIGMAS");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        menuItem = menu.findItem(R.id.itemA);
        imageViewTag = v.getTag().toString();

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.itemA) {
            if (imageViewTag.equals("rutaA")) {
                Toast.makeText(this, "RUTA A", Toast.LENGTH_SHORT).show();
                Intent intentA = new Intent(this, RutaEnigmaA.class);
                intentA.putExtra("rutaA", creador.getMenuOptionA());
                startActivity(intentA);
                return true;
            }

            if (imageViewTag.equals("rutaB")) {
                Toast.makeText(this, "RUTA B", Toast.LENGTH_SHORT).show();
                intentEnigmaB = new Intent(this, RutaEnigmaB.class);
                intentEnigmaB.putExtra("rutaB", creador.getMenuOptionB());
                intentEnigmaB.putExtra("pasoContadorA",contadorFinal );
                startActivity(intentEnigmaB);
                return true;
            }
            if (imageViewTag.equals("rutaC")) {
                Toast.makeText(this, "RUTA C", Toast.LENGTH_SHORT).show();
                intentEnigmaC = new Intent(this, RutaEnigmaC.class);
                intentEnigmaC.putExtra("rutaC", creador.getMenuOptionC());
                intentEnigmaC.putExtra("pasoContadorB",contadorFinal );
                startActivity(intentEnigmaC);
                return true;
            }
            if (imageViewTag.equals("rutaD")) {
                Toast.makeText(this, "RUTA D", Toast.LENGTH_SHORT).show();
                intentEnigmaD = new Intent(this, RutaEnigmaD.class);
                intentEnigmaD.putExtra("rutaD", creador.getMenuOptionD());
                intentEnigmaD.putExtra("pasoContadorC",contadorFinal );
                startActivity(intentEnigmaD);
                return true;
            }

        }
        return false;
    }

}
