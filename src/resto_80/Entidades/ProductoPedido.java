package resto_80.Entidades;

public class ProductoPedido {

    private int idPP;
    private Producto producto;
    private Pedido pedido;
    private int Cantidad;
//    private double subtotal;

    public ProductoPedido() {
    }

    public ProductoPedido(Producto producto, Pedido pedido, int Cantidad, double subtotal) {
        this.producto = producto;
        this.pedido = pedido;
        this.Cantidad = Cantidad;
//        this.subtotal = subtotal;
    }

    public ProductoPedido(int idPP, Producto producto, Pedido pedido, int Cantidad, double subtotal) {
        this.idPP = idPP;
        this.producto = producto;
        this.pedido = pedido;
        this.Cantidad = Cantidad;
//        this.subtotal = subtotal;
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

//    public double getSubtotal() {
//        return subtotal;
//    }
//
//    public void setSubtotal(double subtotal) {
//        this.subtotal = subtotal;
//    }

    @Override
    public String toString() {
        return "ProductoPedido{" + "idPP=" + idPP + ", producto=" + producto + ", pedido=" + pedido + ", Cantidad=" + Cantidad + '}';
    }

    

    
   
    
}
