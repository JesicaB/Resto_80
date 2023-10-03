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
    private int idMesa;
    private int idProducto;
    private int idMesero;
    private int cantidad;
    private boolean estado;

    public Pedido() {
    }

    public Pedido(int idPedido, int idMesa, int idProducto, int idMesero, int cantidad, boolean estado) {
        this.idPedido = idPedido;
        this.idMesa = idMesa;
        this.idProducto = idProducto;
        this.idMesero = idMesero;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public Pedido(int idMesa, int idProducto, int idMesero, int cantidad, boolean estado) {
        this.idMesa = idMesa;
        this.idProducto = idProducto;
        this.idMesero = idMesero;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
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
        return idPedido + " - " + idMesa + " - " + idProducto + " - " + idMesero + " - " + cantidad + " - "+ estado;
    }
    
}
