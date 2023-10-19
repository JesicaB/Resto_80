package resto_80.Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import resto_80.Entidades.Producto;

public class ProductoD {

    private Connection con = null;

    public ProductoD() {
        con = Conexión.getConnection();
    }

    public void agregarProducto(Producto producto) {

        String sql = "INSERT INTO productos(nombre, precio, stock, estado) "
                + "VALUES (?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setBoolean(4, producto.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido con éxito.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al cargar el Producto."
                    + "Verifique que el producto no haya sido cargado anteriormente");
        }
    }

    public void modificarProducto(Producto producto) {
        String sql = "UPDATE productos SET Nombre=?,Precio=?,Stock=? WHERE idProducto=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setInt(4, producto.getIdProducto());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla productos.");
        }

    }

    public void eliminarProducto(int idProducto) {
        String sql = "DELETE FROM productos WHERE idProducto=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idProducto);

            int bp = ps.executeUpdate();

            if (bp == 1) {
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo eliminar el producto seleccionado");
        }

    }

    public void bajaProducto(int idProducto) {
        String sql = "UPDATE productos SET Estado=0 WHERE idProducto=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);

            int bp = ps.executeUpdate();

            if (bp == 1) {
                JOptionPane.showMessageDialog(null, "Producto dado de Baja");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo Dar de Baja el producto seleccionado");
        }

    }

    public ArrayList<Producto> listarProductos() {
        String sql = "SELECT * FROM productos";
        ArrayList<Producto> productos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("Nombre"));
                producto.setPrecio(rs.getDouble("Precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("Estado"));

                productos.add(producto);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla productos.");
        }

        return productos;

    }

    public Producto buscarProducto(int id) {
        String sql = "SELECT * FROM productos WHERE idProducto = ?";
        Producto producto = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("Nombre"));
                producto.setPrecio(rs.getDouble("Precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("Estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El producto no existe o fue eliminado");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }

        return producto;

    }
}
