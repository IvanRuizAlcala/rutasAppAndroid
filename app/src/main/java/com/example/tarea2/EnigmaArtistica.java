package com.example.tarea2;

import java.util.ArrayList;

public class EnigmaArtistica implements MenuSelector {
    @Override
    public ArrayList<String> getMenuOptionA() {
        ArrayList<String> listaPrimera = new ArrayList<>();
        listaPrimera.add("Enigma 1: En una pintura renacentista\n" +
                "ves una figura central con una expresión de serenidad y misterio. " +
                "Es conocida por su enigmática sonrisa. ¿Qué obra es?");
        listaPrimera.add("Identifica la obra de arte a partir de la descripción.");
        listaPrimera.add("La Última Cena");
        listaPrimera.add("La Escuela de Atenas");
        listaPrimera.add("La Mona Lisa");
        listaPrimera.add("La Creación de Adán");
        listaPrimera.add("La Mona Lisa");
        return listaPrimera;
    }

    @Override
    public ArrayList<String> getMenuOptionB() {
        ArrayList<String> listaB = new ArrayList<>();
        listaB.add("Enigma 2: En un museo\n" +
                "encuentras una escultura de un hombre pensativo, con la cabeza inclinada sobre su puño cerrado. " +
                "Esta escultura se titula \"El Pensador\". ¿Quién es el autor de esta obra?");
        listaB.add("Identifica al escultor a partir de la descripción.");
        listaB.add("Michelangelo");
        listaB.add("Donatello");
        listaB.add("Auguste Rodin");
        listaB.add("Bernini");
        listaB.add("Auguste Rodin");
        return listaB;
    }

    @Override
    public ArrayList<String> getMenuOptionC() {
        ArrayList<String> listaC = new ArrayList<>();
        listaC.add("Enigma 3: En una obra musical\n" +
                "escuchas una famosa composición para piano, conocida por su título en alemán que significa \"Para Elisa\". " +
                "¿Quién compuso esta pieza?");
        listaC.add("Identifica al compositor a partir de la descripción.");
        listaC.add("Mozart");
        listaC.add("Beethoven");
        listaC.add("Bach");
        listaC.add("Chopin");
        listaC.add("Beethoven");
        return listaC;
    }

    @Override
    public ArrayList<String> getMenuOptionD() {
        ArrayList<String> listaD = new ArrayList<>();
        listaD.add("Enigma 4: En una galería de arte moderno\n" +
                "ves una serie de latas de sopa serigrafiadas en colores brillantes. " +
                "Esta obra es famosa por su estilo pop art. ¿Quién es el autor de esta obra?");
        listaD.add("Identifica al artista a partir de la descripción.");
        listaD.add("Andy Warhol");
        listaD.add("Jackson Pollock");
        listaD.add("Roy Lichtenstein");
        listaD.add("Keith Haring");
        listaD.add("Andy Warhol");
        return listaD;
    }
}

