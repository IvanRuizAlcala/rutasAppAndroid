package com.example.tarea2;

import java.util.ArrayList;

public class EnigmaTecnologia implements MenuSelector {
    @Override
    public ArrayList<String> getMenuOptionA() {
        ArrayList<String> listaPrimera = new ArrayList<>();
        listaPrimera.add("Enigma 1: En el mundo de la informática,\n" +
                "existe un dispositivo que almacena datos de manera permanente mediante el uso de discos magnéticos. " +
                "¿Qué dispositivo es?");
        listaPrimera.add("Identifica el dispositivo de almacenamiento.");
        listaPrimera.add("Memoria RAM");
        listaPrimera.add("Disco Duro");
        listaPrimera.add("Tarjeta Gráfica");
        listaPrimera.add("CPU");
        listaPrimera.add("Disco Duro");
        return listaPrimera;
    }

    @Override
    public ArrayList<String> getMenuOptionB() {
        ArrayList<String> listaB = new ArrayList<>();
        listaB.add("Enigma 2: En las redes de comunicación,\n" +
                "existe un protocolo fundamental que divide los datos en paquetes y los reensambla en el destino. " +
                "Este protocolo se llama TCP/IP. ¿Qué significan las siglas TCP?");
        listaB.add("Desglosa las siglas TCP.");
        listaB.add("Transmission Control Protocol");
        listaB.add("Transport Communication Protocol");
        listaB.add("Transfer Connection Protocol");
        listaB.add("Transmitting Code Protocol");
        listaB.add("Transmission Control Protocol");
        return listaB;
    }

    @Override
    public ArrayList<String> getMenuOptionC() {
        ArrayList<String> listaC = new ArrayList<>();
        listaC.add("Enigma 3: En el campo de la inteligencia artificial,\n" +
                "hay un algoritmo que simula el funcionamiento del cerebro humano mediante redes de neuronas. " +
                "¿Cómo se llama este algoritmo?");
        listaC.add("Identifica el algoritmo de inteligencia artificial.");
        listaC.add("Algoritmo Genético");
        listaC.add("Árbol de Decisión");
        listaC.add("Red Neuronal");
        listaC.add("Algoritmo de Ordenamiento");
        listaC.add("Red Neuronal");
        return listaC;
    }

    @Override
    public ArrayList<String> getMenuOptionD() {
        ArrayList<String> listaD = new ArrayList<>();
        listaD.add("Enigma 4: En el ámbito de la programación,\n" +
                "existe un lenguaje que es conocido por su simplicidad y versatilidad, utilizado tanto en desarrollo web como en inteligencia artificial. " +
                "¿Qué lenguaje es?");
        listaD.add("Identifica el lenguaje de programación.");
        listaD.add("Java");
        listaD.add("Python");
        listaD.add("C++");
        listaD.add("JavaScript");
        listaD.add("Python");
        return listaD;
    }
}

