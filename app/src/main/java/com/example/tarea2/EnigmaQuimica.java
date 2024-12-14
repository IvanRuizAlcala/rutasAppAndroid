package com.example.tarea2;

import java.util.ArrayList;

public class EnigmaQuimica implements MenuSelector {
    @Override
    public ArrayList<String> getMenuOptionA() {
        ArrayList<String> listaPrimera = new ArrayList<>();
        listaPrimera.add("Enigma 1: Una reacción química\n" +
                "ocurre cuando se combinan 2 moles de hidrógeno con 1 mol de oxígeno para formar agua. " +
                "¿Cuántos moles de agua se producen?");
        listaPrimera.add("Aplica la ley de conservación de la masa.");
        listaPrimera.add("2 moles");
        listaPrimera.add("1 mol");
        listaPrimera.add("3 moles");
        listaPrimera.add("4 moles");
        listaPrimera.add("2 moles");
        return listaPrimera;
    }

    @Override
    public ArrayList<String> getMenuOptionB() {
        ArrayList<String> listaB = new ArrayList<>();
        listaB.add("Enigma 2: La tabla periódica\n" +
                "es una herramienta fundamental en la química. " +
                "Si sumas los números atómicos del oxígeno (8) y el carbono (6), ¿cuál es el resultado?");
        listaB.add("Suma los números atómicos.");
        listaB.add("12");
        listaB.add("14");
        listaB.add("16");
        listaB.add("18");
        listaB.add("14");
        return listaB;
    }

    @Override
    public ArrayList<String> getMenuOptionC() {
        ArrayList<String> listaC = new ArrayList<>();
        listaC.add("Enigma 3: Un gas ocupa\n" +
                "un volumen de 22.4 litros a condiciones normales de presión y temperatura (CNPT). " +
                "¿Cuántos moles de gas hay en 44.8 litros en CNPT?");
        listaC.add("Utiliza la ley de los gases ideales.");
        listaC.add("1 mol");
        listaC.add("2 moles");
        listaC.add("3 moles");
        listaC.add("4 moles");
        listaC.add("2 moles");
        return listaC;
    }

    @Override
    public ArrayList<String> getMenuOptionD() {
        ArrayList<String> listaD = new ArrayList<>();
        listaD.add("Enigma 4: Una solución\n" +
                "se prepara disolviendo 5 gramos de sal en 100 ml de agua. " +
                "¿Cuál es la concentración de la solución en porcentaje de masa?");
        listaD.add("Calcula la concentración usando la fórmula de porcentaje de masa.");
        listaD.add("5%");
        listaD.add("4.5%");
        listaD.add("5.5%");
        listaD.add("6%");
        listaD.add("5%");
        return listaD;
    }
}
