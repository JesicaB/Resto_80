package resto_80.Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import resto_80.Entidades.Pedido;
import resto_80.Entidades.Producto;
import resto_80.Entidades.ProductoPedido;

public class ProductoPedidoD {

    private Connection con = null;
    private ProductoD pd = new ProductoD();
    private PedidoD pedidoD = new PedidoD();

    public ProductoPedidoD() {
        con = Conexión.getConnection();
    }

    public void cargarPP(ProductoPedido pp) {
        String sql = "INSERT INTO productospedidos(idProducto, idPedido, cantidad) "
                + "VALUES (?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, pp.getProducto().getIdProducto());
            ps.setInt(2, pp.getPedido().getIdPedido());
            ps.setInt(3, pp.getCantidad());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                pp.setIdPP(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto pedido cargado con éxito.");
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al cargar el producto pedido."
                    + "Es posible que este intentando cargar un producto pedido ya existente.");

        }

    }

    public void modificarPP(ProductoPedido pp) {
        String sql = "UPDATE productospedidos SET idProducto=?,idPedido=?,cantidad=? WHERE idPP=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, pp.getProducto().getIdProducto());
            ps.setInt(2, pp.getPedido().getIdPedido());
            ps.setInt(3, pp.getCantidad());

            ps.setInt(4, pp.getIdPP());

            int x = ps.executeUpdate();

            if (x == 1) {
                JOptionPane.showMessageDialog(null, "El producto pedido fue modificado"
                        + "exitosamente.");
            }

            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al modificar el producto pedido."
                    + "corrobore la conexión y que los datos ingresados sean correctos"
                    + " e intente nuevamente.");

        }

    }

    public void eliminarPP(int id) {
        String sql = "DELETE FROM productospedidos WHERE idPP=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int x = ps.executeUpdate();

            if (x == 1) {

                JOptionPane.showMessageDialog(null, "El producto pedido fue eliminado"
                        + "exitosamente.");

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al eliminar el producto pedido."
                    + "corrobore la conexión y que los datos ingresados sean correctos"
                    + " e intente nuevamente.");

        }
    }

    public List<ProductoPedido> listarPP() {

        String sql = "SELECT * FROM productospedidos";

        ArrayList<ProductoPedido> listaPP = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                ProductoPedido pp = new ProductoPedido();

                pp.setIdPP(rs.getInt("idPP"));
                Producto p = pd.buscarProducto(rs.getInt("idProducto"));

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto pedido.");

        }

        return listaPP;
    }
    
    public List<ProductoPedido> listarPPxPedido(int idPedido) {

        String sql = "SELECT * FROM productospedidos where idPedido=?";

        ArrayList<ProductoPedido> listaPP = new ArrayList<>();

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                ProductoPedido pp = new ProductoPedido();

                pp.setIdPP(rs.getInt("idPP"));
                Producto p = pd.buscarProducto(rs.getInt("idProducto"));
                pp.setProducto(p);
                Pedido pedido= pedidoD.buscarPedido(rs.getInt("idPedido"));
                pp.setPedido(pedido);
                pp.setCantidad(rs.getInt("cantidad"));
         
                listaPP.add(pp);
            }
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto pedido.");

        }

        return listaPP;
    }
}
