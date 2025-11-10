package com.upn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        //  Agregar solo nombre (precio y cantidad por defecto)
        try {
            inv.agregarProducto("Lapicero");
        } catch (IllegalArgumentException ex) {
            System.out.println("Error al agregar Lapicero: " + ex.getMessage());
        }

        //  Agregar nombre y precio (precio válido)
        try {
            inv.agregarProducto("Cuaderno", 5.50);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error al agregar Cuaderno: " + ex.getMessage());
        }

        // Agregar nombre, precio y cantidad (todo válido)
        try {
            inv.agregarProducto("Mochila", 30.0, 10);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error al agregar Mochila: " + ex.getMessage());
        }

        // Intento de agregar con precio negativo -> se captura la excepción
        try {
            inv.agregarProducto("Borrador", -2.0, 5);
        } catch (IllegalArgumentException ex) {
            System.out.println("No se agregó Borrador: " + ex.getMessage());
        }

        //  Intento de agregar con cantidad negativa -> se captura la excepción
        try {
            inv.agregarProducto("Goma", 1.0, -3);
        } catch (IllegalArgumentException ex) {
            System.out.println("No se agregó Goma: " + ex.getMessage());
        }

        // Mostrar inventario final
        inv.mostrarInventario();
    }
}