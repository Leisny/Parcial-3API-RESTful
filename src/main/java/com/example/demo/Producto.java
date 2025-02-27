package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Producto {
    private String id;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
}

