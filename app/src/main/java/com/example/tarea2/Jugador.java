package com.example.tarea2;

public class Jugador {
    String nombre;
    String primerApellido;
    int vidas;
    String password;
    int completados;
    String avatar;
    String nombreUsuario;

    public Jugador(String nombre, String primerApellido, String password,String avatar,String nombreUsuario) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.vidas = 3;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.completados = 0;
        this.avatar = avatar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCompletados() {
        return completados;
    }

    public void setCompletados(int completados) {
        this.completados = completados;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
