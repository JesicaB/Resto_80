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
    private boolean estado;

    public Pedido() {
    }

    public Pedido(int idPedido, Mesa mesa, boolean estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.estado = estado;
    }

    public Pedido(Mesa mesa, boolean estado) {
        this.mesa = mesa;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  idPedido + " - " + mesa + " - " + estado;
    }

   
    
}
