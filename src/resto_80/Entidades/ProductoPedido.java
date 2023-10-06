package resto_80.Entidades;

public class ProductoPedido {

    private int idPP;
    private Producto producto;
    private Pedido pedido;
    private int Cantidad;

    public ProductoPedido() {
    }

    public ProductoPedido(int idPP, Producto producto, Pedido pedido, int Cantidad) {
        this.idPP = idPP;
        this.producto = producto;
        this.pedido = pedido;
        this.Cantidad = Cantidad;
    }

    public ProductoPedido(Producto producto, Pedido pedido, int Cantidad) {
        this.producto = producto;
        this.pedido = pedido;
        this.Cantidad = Cantidad;
    }

    public int getIdPP() {
        return idPP;
    }

    public void setIdPP(int idPP) {
        this.idPP = idPP;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public String toString() {
        return idPP + " - " + producto + " - " + pedido + " - " + Cantidad;
    }

}
