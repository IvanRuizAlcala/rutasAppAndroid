package com.example.tarea2;

import java.util.ArrayList;

public class EnigmaMatematicas implements MenuSelector {
    @Override
    public ArrayList<String> getMenuOptionA() {
        ArrayList<String> listaPrimera = new ArrayList<>();
        listaPrimera.add("Enigma 1:El Reloj Misterioso,\n " +
                "El reloj de un campanario suena cada hora tantas veces como marca la hora. " +
                "Por ejemplo, a las 3 suena 3 campanadas. Si empieza a sonar a las 10:00 a.m., " +
                "¿cuántas campanadas habrá dado en total antes de que el reloj marque las 4:00 p.m.?");
        listaPrimera.add("Debes sumar las campanadas desde las 10:00 a.m. hasta las 4:00 p.m.");
        listaPrimera.add("80 campanadas");
        listaPrimera.add("32 campanadas");
        listaPrimera.add("43 campanadas");
        listaPrimera.add("47 campanadas");
        listaPrimera.add("43 campanadas");
        return listaPrimera;
    }

    @Override
    public ArrayList<String> getMenuOptionB() {
        ArrayList<String> listaB = new ArrayList<>();
        listaB.add("Enigma 2: El Camino Más Largo\n" +
                "Un excursionista camina una ruta cuadrada de 4 km por lado. " +
                "Decide tomar un atajo y recorrer la diagonal desde una esquina a la opuesta. ¿Cuántos kilómetros se ahorra?\n" +
                "Pista: Usa el teorema de Pitágoras para calcular la longitud de la diagonal.");
        listaB.add("Calcular la diagonal y restarla del recorrido completo (16 km menos dos lados).");
        listaB.add("2.99 km");
        listaB.add("2.34 km");
        listaB.add("1.69 km");
        listaB.add("2.59 km");
        listaB.add("2.34 km");

        return listaB;
    }

    @Override
    public ArrayList<String> getMenuOptionC() {
        ArrayList<String> listaC = new ArrayList<>();
        listaC.add("En una cueva, encuentras un grabado con los números: 3, 6, 9, 12, ?. " +
                        "El último número está borrado. ¿Cuál es y por qué?");
        listaC.add("Fíjate en el patrón de la sucesión.");
        listaC.add("18");
        listaC.add("13");
        listaC.add("11");
        listaC.add("15");
        listaC.add("15");
        return listaC;
    }

    @Override
    public ArrayList<String> getMenuOptionD() {
        ArrayList<String> listaD = new ArrayList<>();
        listaD.add("Un monolito tiene forma de cubo perfecto con una longitud de arista de 3 metros. " +
                "¿Cuál es su volumen en metros cúbicos?");
        listaD.add("Usa la fórmula del volumen de un cubo: V = a^3. donde a es la longitud de la arista.");
        listaD.add("29");
        listaD.add("22");
        listaD.add("27");
        listaD.add("25");
        listaD.add("27");
        return listaD;
    }
}
