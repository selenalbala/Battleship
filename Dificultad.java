package com.example.recyhlf;

public class Dificultad {
    public String nombre;
    public int cantidad;            //CANTIDAD DE BARCOS//

    public Dificultad(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Dificultad(String nombre){
        this.nombre=nombre;
    }
}
