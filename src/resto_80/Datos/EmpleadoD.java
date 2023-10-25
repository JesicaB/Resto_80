package resto_80.Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import resto_80.Entidades.Empleado;


public class EmpleadoD {

    private Connection con = null;

    public EmpleadoD() {
        con = Conexión.getConnection();

    }

        public void agregarEmpleado(Empleado empleado) {

        String sql = "INSERT INTO `empleados`(nombre_Apellido, DNI, estado) "
                + "VALUES (?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, empleado.getNombre_apellido());
            ps.setInt(2, empleado.getDni());
            ps.setBoolean(3, empleado.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                empleado.setIdEmpleado(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Empelado creado con Exito");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al agregar el empleado."
                    + "Verifique que el empleado no haya sido agregado anteriormente");
        }
    }

    public void modificarEmpleado(Empleado empleado) {
        String sql = "UPDATE empleados SET nombre_Apellido=?,DNI=?, estado=? WHERE idEmpleado=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, empleado.getNombre_apellido());
            ps.setInt(2, empleado.getDni());
            ps.setBoolean(3,empleado.isEstado());
            ps.setInt(4, empleado.getIdEmpleado());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Empleado modificado.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Empleados.");
        }

    }

    public void eliminarEmpleado(int idEmpleado) {
        String sql = "DELETE FROM empleados WHERE idEmpleado=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idEmpleado);

            int bm = ps.executeUpdate();

            if (bm == 1) {
                JOptionPane.showMessageDialog(null, "Empleado eliminado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo eliminar el empleado seleccionado");
        }

    }

    public void bajaEmpleado(int idEmpleado) {
        String sql = "UPDATE empleados SET Estado=0 WHERE idEmpleados=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEmpleado);

            int bm = ps.executeUpdate();

            if (bm == 1) {
                JOptionPane.showMessageDialog(null, "Empleado dado de Baja");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo dar de baja al empleado seleccionado");
        }

    }

    public List<Empleado> listarEmpleados() {
        String sql = "SELECT * FROM empleados";
        ArrayList<Empleado> empleados = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Empleado empleado = new Empleado();
                empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                empleado.setNombre_apellido(rs.getString("nombre_Apellido"));
                empleado.setDni(rs.getInt("DNI"));
                empleado.setEstado(rs.getBoolean("Estado"));

                empleados.add(empleado);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empelados.");
        }

        return empleados;

    }

    public Empleado buscarEmpleado(int DNI) {
        String sql = "SELECT * FROM empleados WHERE DNI = ?";
        Empleado empleado = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, DNI);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                empleado = new Empleado();
                empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                empleado.setNombre_apellido(rs.getString("nombre_Apellido"));
                empleado.setDni(rs.getInt("DNI"));
                empleado.setEstado(rs.getBoolean("Estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El empleado no existe");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleados.");
        }

        return empleado;

    }
    
     public Empleado buscarEmpleadoId(int id) {
        String sql = "SELECT * FROM empleados WHERE idEmpleado = ?";
        Empleado empleado = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                empleado = new Empleado();
                empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                empleado.setNombre_apellido(rs.getString("nombre_Apellido"));
                empleado.setDni(rs.getInt("DNI"));
                empleado.setEstado(rs.getBoolean("Estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El empleado no existe");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleados.");
        }

        return empleado;
     }
     public Empleado buscarEmpleadoNombre(String nombre) {
        String sql = "SELECT * FROM empleados WHERE nombre_apellido = ?";
        Empleado empleado = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                empleado = new Empleado();
                empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                empleado.setNombre_apellido(rs.getString("nombre_Apellido"));
                empleado.setDni(rs.getInt("DNI"));
                empleado.setEstado(rs.getBoolean("Estado"));

            } else {
                JOptionPane.showMessageDialog(null, "El empleado no existe");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla empleados.");
        }

        return empleado;
     }
}
