package com.example.tarea2;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class miAdaptador extends ArrayAdapter {
    private Context contexto;
    private int miLayout;
    private List<String> misOpciones;


    public miAdaptador(@NonNull Context contexto, int miLayout, List<String> misOpciones) {
        super(contexto, miLayout,misOpciones);
        this.contexto = contexto;
        this.misOpciones = misOpciones;
        this.miLayout = miLayout;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(contexto).inflate(R.layout.elemento,parent,false);
        String elementoActual = misOpciones.get(position);
        TextView accion = v.findViewById(R.id.texto);
        accion.setText(elementoActual);
        return v;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(contexto).inflate(R.layout.elemento,parent,false);
        String elementoActual = misOpciones.get(position);
        TextView nombre = v.findViewById(R.id.texto);
        nombre.setTextSize(30);
        nombre.setText(elementoActual);
        return v;
    }
}

