package resto_80.Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexión {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "restaurante_80";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection con;

    private Conexión() {
    }

    public static Connection getConnection() {

        if (con == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                con = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);

            } catch (ClassNotFoundException ex) {

                JOptionPane.showMessageDialog(null, "Error al cargar el driver.");

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos.");
            }
        }

        return con;

    }
}
