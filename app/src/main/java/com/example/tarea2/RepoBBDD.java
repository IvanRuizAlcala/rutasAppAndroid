package com.example.tarea2;

import android.content.Context;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepoBBDD {
    private String nombreArchivo;
    private Context context;
    private File archivo;

    public RepoBBDD(Context context) {
        this.context = context;
    }

    private void ensureFileInitialized(String nombreArchivo) {
        if (archivo == null || !archivo.getName().equals(nombreArchivo)) {
            this.nombreArchivo = nombreArchivo;
            archivo = new File(context.getFilesDir(), nombreArchivo);
        }
    }

    public boolean crearArchivo(String nombreArchivo) {
        ensureFileInitialized(nombreArchivo);
        if (!archivo.exists()) {
            try {
                return archivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public List<Jugador> leerArchivo(String nombreArchivo) {
        ensureFileInitialized(nombreArchivo);
        List<Jugador> jugadores = new ArrayList<>();
        if (archivo.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    String[] datos = linea.split(",");
                    if (datos.length == 5) {
                        Jugador jugador = new Jugador(datos[0], datos[1], datos[2], datos[3],datos[4]);
                        jugadores.add(jugador);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return jugadores;
    }

    public boolean guardarJugador(Jugador jugador) {
        ensureFileInitialized("jugadores.txt");
        List<Jugador> jugadores = leerArchivo("jugadores.txt");

        for (Jugador j : jugadores) {
            if (j.nombreUsuario.equals(jugador.getNombreUsuario())) {
                return false;
            }
        }

        jugadores.add(jugador);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Jugador j : jugadores) {
                writer.write(j.getNombre() + "," + j.getPrimerApellido() +
                        "," + j.getPassword() + "," + j.getAvatar() + "," + j.getNombreUsuario());
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean cerrarArchivo() {
        return true;
    }
}

