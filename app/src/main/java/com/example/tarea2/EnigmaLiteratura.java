package com.example.tarea2;

import java.util.ArrayList;

public class EnigmaLiteratura implements MenuSelector {
    @Override
    public ArrayList<String> getMenuOptionA() {
        ArrayList<String> listaPrimera = new ArrayList<>();
        listaPrimera.add("Enigma 1:Un famoso escritor,\n " +
                "dejó una nota en su escritorio antes de desaparecer. La nota decía: " +
                "Mis libros favoritos tienen un patrón.Los títulos de sus libros son:" +
                "El Aleph,Ficciones,El informe de Brodie,El libro de arena");
        listaPrimera.add("¿Cuál es la clave para encontrar al escritor?");
        listaPrimera.add("A");
        listaPrimera.add("I");
        listaPrimera.add("E");
        listaPrimera.add("A,E,I");
        listaPrimera.add("E");
        return listaPrimera;
    }

    @Override
    public ArrayList<String> getMenuOptionB() {
        ArrayList<String> listaB = new ArrayList<>();
        listaB.add("Enigma 2: En una antigua biblioteca\n" +
                "hay una estantería con cuatro libros, Los libros se titulan: " +
                "El Camino del Saber,El Portal del Misterio, La Senda de la Sabiduría y El Secreto del Aprendizaje.");
        listaB.add("¿Que Titulo no forma parte del enigma?");
        listaB.add("El Camino del Saber");
        listaB.add("El Portal del Misterio");
        listaB.add("La Senda de la Sabiduría");
        listaB.add("El Secreto del Aprendizaje");
        listaB.add("El Secreto del Aprendizaje");

        return listaB;
    }

    @Override
    public ArrayList<String> getMenuOptionC() {
        ArrayList<String> listaC = new ArrayList<>();
        listaC.add("Un trovador dejó un acertijo en el castillo\n"+
                "Entre las páginas de un cuento, donde dragones y princesas reinan, " +
                "se esconde una clave : Dragones vuelan alto, Reinas de gran valor,"+
                " Aventuras en el bosque, Guardan el tesoro.");
        listaC.add("Cuál es la clave oculta en el cuento?");
        listaC.add("trovador");
        listaC.add("princesas");
        listaC.add("DRAG");
        listaC.add("GARD");
        listaC.add("DRAG");
        return listaC;
    }

    @Override
    public ArrayList<String> getMenuOptionD() {
        ArrayList<String> listaD = new ArrayList<>();
        listaD.add("En un viejo manuscrito,\n" +
                "encuentras el siguiente acertijo: En el reino de los cuentos, donde los héroes siempre ganan,"+
                "Caballeros valientes luchan, Enfrentando dragones y sombras, "+
                "Siempre victoriosos y justos, Guardando secretos en su corazón.");
        listaD.add("Cuál es la clave oculta en el manuscrito");
        listaD.add("el reino de los cuentos");
        listaD.add("caballeros valientes luchan");
        listaD.add("victoriosos gruardando secretos");
        listaD.add("caballeros enfrentado siempre guardando");
        listaD.add("caballeros enfrentado siempre guardando");
        return listaD;
    }
}
