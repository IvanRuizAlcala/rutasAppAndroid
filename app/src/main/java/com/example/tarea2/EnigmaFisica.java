package com.example.tarea2;

import java.util.ArrayList;

public class EnigmaFisica implements MenuSelector {
    @Override
    public ArrayList<String> getMenuOptionA() {
        ArrayList<String> listaPrimera = new ArrayList<>();
        listaPrimera.add("Enigma 1: Un péndulo\n" +
                "se balancea de un lado a otro completando una oscilación cada 2 segundos. " +
                "Si el péndulo completa 15 oscilaciones, ¿cuánto tiempo ha pasado?");
        listaPrimera.add("Calcula el tiempo multiplicando el número de oscilaciones por el periodo.");
        listaPrimera.add("30 segundos");
        listaPrimera.add("45 segundos");
        listaPrimera.add("20 segundos");
        listaPrimera.add("25 segundos");
        listaPrimera.add("30 segundos");
        return listaPrimera;
    }

    @Override
    public ArrayList<String> getMenuOptionB() {
        ArrayList<String> listaB = new ArrayList<>();
        listaB.add("Enigma 2: Un objeto se deja caer\n" +
                "desde una altura de 20 metros. Ignorando la resistencia del aire, " +
                "¿cuánto tiempo tarda en llegar al suelo? Usa la fórmula de la caída libre: h = 1/2 * g * t^2");
        listaB.add("Calcula el tiempo usando la fórmula de caída libre.");
        listaB.add("2 segundos");
        listaB.add("3 segundos");
        listaB.add("2.5 segundos");
        listaB.add("4 segundos");
        listaB.add("2 segundos");
        return listaB;
    }

    @Override
    public ArrayList<String> getMenuOptionC() {
        ArrayList<String> listaC = new ArrayList<>();
        listaC.add("Enigma 3: Un automóvil viaja\n" +
                "a una velocidad constante de 60 km/h. Si aumenta su velocidad a 90 km/h, " +
                "¿qué fracción de tiempo ahorrará en un viaje de 180 km?");
        listaC.add("Compara los tiempos de viaje a ambas velocidades.");
        listaC.add("Un quinto del tiempo");
        listaC.add("Una cuarta parte del tiempo");
        listaC.add("Una mitad del tiempo");
        listaC.add("Una tercera parte del tiempo");
        listaC.add("Una tercera parte del tiempo");
        return listaC;
    }

    @Override
    public ArrayList<String> getMenuOptionD() {
        ArrayList<String> listaD = new ArrayList<>();
        listaD.add("Enigma 4: Un cubo de hielo\n" +
                "se derrite completamente en un vaso de agua caliente. " +
                "Si el cubo tenía un volumen de 100 cm³, ¿cuánto volumen de agua se añade al vaso?");
        listaD.add("El volumen del cubo se convierte en volumen de agua.");
        listaD.add("100 cm³");
        listaD.add("90 cm³");
        listaD.add("110 cm³");
        listaD.add("95 cm³");
        listaD.add("100 cm³");
        return listaD;
    }
}