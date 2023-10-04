/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resto_80.Entidades;

/**
 *
 * @author lacim
 */
public class ProductoPedido {
    private int idPP;
    private Producto idProducto;
    private Pedido idPedido;
    private int Cantidad;

    public ProductoPedido() {
    }

    public ProductoPedido(int idPP, Producto idProducto, Pedido idPedido, int Cantidad) {
        this.idPP = idPP;
        this.idProducto = idProducto;
        this.idPedido = idPedido;
        this.Cantidad = Cantidad;
    }

    public ProductoPedido(Producto idProducto, Pedido idPedido, int Cantidad) {
        this.idProducto = idProducto;
        this.idPedido = idPedido;
        this.Cantidad = Cantidad;
    }

    public int getIdPP() {
        return idPP;
    }

    public void setIdPP(int idPP) {
        this.idPP = idPP;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return  idPP + " - " + idProducto + " - " + idPedido + " - " + Cantidad ;
    }
    
    
}
