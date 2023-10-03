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
public class Pedido {
    private int idPedido;
    private Mesa mesa;
    private Producto producto;
    private Mesero mesero;
    private int cantidad;
    private boolean estado;

    public Pedido() {
    }

    public Pedido(int idPedido, Mesa mesa, Producto producto, Mesero mesero, int cantidad, boolean estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.producto = producto;
        this.mesero = mesero;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public Pedido(Mesa mesa, Producto producto, Mesero mesero, int cantidad, boolean estado) {
        this.mesa = mesa;
        this.producto = producto;
        this.mesero = mesero;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    @Override
    public String toString() {
        return idPedido + " - " + mesa + " - " + producto + " - " + mesero + " - " + cantidad + " - "+ estado;
    }
    
}
