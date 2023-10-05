package resto_80.Datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import resto_80.Entidades.Mesa;
import resto_80.Entidades.Pedido;
import resto_80.Entidades.Producto;

/**
 *
 * @author MANUEL
 */
public class PedidoD {

    private Connection con = null;
    MesaD mesad = new MesaD();

    public PedidoD() {
        con = Conexión.getConnection();
    }
    
    public void agregarPedido(Pedido pedido){
        
        String sql = "INSERT INTO pedidos (idPedido, idMesa, Estado) "
                + "VALUES (?,?,?)";
        
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, pedido.getIdPedido());
            ps.setInt(2, pedido.getMesa().getIdMesa());
            ps.setBoolean(3, pedido.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido realizado con éxito.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al cargar el Pedido."
                    + "Verifique que el pedido no haya sido cargado anteriormente");
        }
    }
    
     public void modificarPedido(Pedido pedido) {
        String sql = "UPDATE pedidos SET idMesa=?,Estado=? WHERE idPedido=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, pedido.getMesa().getIdMesa());
            ps.setBoolean(2, pedido.isEstado());
            ps.setInt(3, pedido.getIdPedido());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Pedido modificado.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos.");
        }

    }
     
         public void eliminarPedido(int idPedido) {
        String sql = "DELETE FROM pedidos WHERE idPedido=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idPedido);

            int bp = ps.executeUpdate();

            if (bp == 1) {
                JOptionPane.showMessageDialog(null, "Pedido Eliminado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo eliminar el pedido seleccionado");
        }

    }
         
         public void bajaPedido(int idPedido) {
        String sql = "UPDATE pedidos SET Estado=0 WHERE idPedido=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);

            int bp = ps.executeUpdate();

            if (bp == 1) {
                JOptionPane.showMessageDialog(null, "Pedido Cancelado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo Cancelar el pedido seleccionado");
        }

    }
         
         public List<Pedido> listarPedidos() {
        String sql = "SELECT * FROM pedidos";
        ArrayList<Pedido> pedidos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Pedido pedido = new Pedido();
                                                                
                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa mesa = mesad.buscarMesa(rs.getInt("idMesa"));
                pedido.setEstado(rs.getBoolean("Estado"));

                pedido.setMesa(mesa);
                
                pedidos.add(pedido);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos.");
        }

        return pedidos;

    }
         
        public Pedido buscarPedido(int id) {
        String sql = "SELECT * FROM pedidos WHERE idPedido = ?";
        Pedido pedido = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();           
            

            if (rs.next()) {

                pedido = new Pedido();
                pedido.setIdPedido(rs.getInt("idPedido"));
                Mesa mesa = mesad.buscarMesa(rs.getInt("idMesa"));
                pedido.setEstado(rs.getBoolean("Estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El pedido no existe o fue eliminado");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos.");
        }

        return pedido;

    }
    
}