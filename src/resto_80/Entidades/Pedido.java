package resto_80.Entidades;

import java.time.LocalDate;

public class Pedido {

    private int idPedido;
    private Mesa mesa;
    private boolean estado;
    private String mesero;
    private LocalDate f_H;
    private double importe;

    public Pedido() {
    }

    public Pedido(int idPedido, Mesa mesa, boolean estado, String mesero, LocalDate f_H, double importe) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.estado = estado;
        this.mesero = mesero;
        this.f_H = f_H;
        this.importe = importe;
    }

    public Pedido(Mesa mesa, boolean estado, String mesero, LocalDate f_H, double importe) {
        this.mesa = mesa;
        this.estado = estado;
        this.mesero = mesero;
        this.f_H = f_H;
        this.importe = importe;
    }

    public String getMesero() {
        return mesero;
    }

    public void setMesero(String mesero) {
        this.mesero = mesero;
    }

    public LocalDate getF_H() {
        return f_H;
    }

    public void setF_H(LocalDate f_H) {
        this.f_H = f_H;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
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
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", estado=" + estado + ", mesero=" + mesero + ", f_H=" + f_H + ", importe=" + importe + '}';
    }

}
