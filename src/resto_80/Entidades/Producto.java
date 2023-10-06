/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto_80.Entidades;

/**
 *
 * @author Jesica
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private boolean estado;
    private int stock;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, double precio, boolean estado, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
        this.stock = stock;
    }

    public Producto(String nombre, double precio, boolean estado, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
        this. stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  idProducto + " - " + nombre + " - " + precio + " - " + estado;
    }

    
}
