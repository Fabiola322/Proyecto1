package com.upn;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
  private final List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    //Metodo 1: solo nombre
    public void agregarProducto(String nombre){
        validarNombre(nombre);
        productos.add(new Producto((nombre), 0.0, 0));
        System.out.println("Producto agregado: " + nombre + " (precio y cantidad por defecto )");
    }

    //Metodo 2: nombre y precio
    public void agregarProducto(String nombre, double precio){
        validarNombre(nombre);
        validarPrecio(precio);
        productos.add(new Producto((nombre), precio, 0));
        System.out.println("Producto agregado: " + nombre + " | Precio: " + precio + " | Cantidad por defecto");
    }

    //Metodo 3: nombre, precio y cantidad
    public void agregarProducto(String nombre, double precio, int cantidad){
        validarNombre(nombre);
        validarPrecio(precio);
        validarCantidad(cantidad);
        productos.add(new Producto((nombre), precio, cantidad));
        System.out.println("Producto agregado: " + nombre + " | Precio: " + precio + " | Cantidad: " + cantidad);
    }
    // Metodo para listar los productos
    public List<Producto> obtenerProductos(){
        return new ArrayList<>(productos);
    }

    // Mostrar inventario por consola
    public void mostrarInventario(){
        System.out.println("\\n--- Inventario Actual ---");
        if (productos.isEmpty()) {
            System.out.println("(Inventario vacío)");
            return;
        }
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    // Validaciones
    private void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
    }

    private void validarPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio del producto no puede ser negativo.");
        }
    }

    private void validarCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad del producto no puede ser negativa.");
        }
    }

}
