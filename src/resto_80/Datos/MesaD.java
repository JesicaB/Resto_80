package resto_80.Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import resto_80.Entidades.Mesa;

public class MesaD {

    private Connection con = null;

    public MesaD() {
        con = Conexión.getConnection();

    }

    public void agregarMesa(Mesa mesa) {

        String sql = "INSERT INTO mesas (Numero, Capacidad, Estado) "
                + "VALUES (?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, mesa.getNumeroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesa Creada con Exito");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al agregar la Mesa."
                    + "Verifique que la Mesa no haya sido agregada anteriormente");
        }
    }

    public void modificarMesa(Mesa mesa) {
        String sql = "UPDATE mesas SET Numero=?, Capacidad=? WHERE idMesa=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, mesa.getNumeroMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setInt(3, mesa.getIdMesa());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesa modificada.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesas.");
        }

    }

    public void eliminarMesa(int idMesa) {
        String sql = "DELETE FROM mesas WHERE idMesa=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idMesa);

            int bm = ps.executeUpdate();

            if (bm == 1) {
                JOptionPane.showMessageDialog(null, "Mesa Eliminada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo eliminar la Mesa seleccionada");
        }

    }

    public void bajaMesa(int idMesa) {
        String sql = "UPDATE mesas SET Estado=0 WHERE idMesa=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);

            int bm = ps.executeUpdate();

            if (bm == 1) {
                JOptionPane.showMessageDialog(null, "Mesa dada de Baja");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo Dar de Baja la Mesa seleccionada");
        }

    }

    public List<Mesa> listarMesas() {
        String sql = "SELECT * FROM mesas";
        ArrayList<Mesa> mesas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumeroMesa(rs.getInt("Numero"));
                mesa.setCapacidad(rs.getInt("Capacidad"));
                mesa.setEstado(rs.getBoolean("Estado"));

                mesas.add(mesa);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesas.");
        }

        return mesas;

    }

    public Mesa buscarMesa(int id) {
        String sql = "SELECT * FROM mesas WHERE idMesa = ?";
        Mesa mesa = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumeroMesa(rs.getInt("Numero"));
                mesa.setCapacidad(rs.getInt("Capacidad"));
                mesa.setEstado(rs.getBoolean("Estado"));

            } else {
//                JOptionPane.showMessageDialog(null, "La mesa no existe o fue eliminado");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesas.");
        }

        return mesa;

    }
    public Mesa buscarMesaXNumero(int n) {
        String sql = "SELECT * FROM mesas WHERE numero= ?";
        Mesa mesa = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, n);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumeroMesa(rs.getInt("Numero"));
                mesa.setCapacidad(rs.getInt("Capacidad"));
                mesa.setEstado(rs.getBoolean("Estado"));

            } else {
                JOptionPane.showMessageDialog(null, "La mesa no existe o fue eliminado");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesas.");
        }

        return mesa;

    }
    
    public void modificarIdMesa(int id, int n) {
        String sql = "UPDATE mesas SET idMesa=? WHERE numero=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, n);

            int bm = ps.executeUpdate();
            
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo Dar de Baja la Mesa seleccionada");
        }

    }
}
