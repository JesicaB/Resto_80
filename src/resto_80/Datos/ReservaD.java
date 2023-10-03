
package resto_80.Datos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import resto_80.Entidades.Reserva;


public class ReservaD {
    private Connection con = null;
    
    public ReservaD(){
        con = Conexión.getConnection();
    }
    
    public void agregarReserva(Reserva reserva){
        
        String sql= "INSERT INTO reservas(nombreCliente, DNI, Fecha, Hora, Estado) "
                + "VALUES (?,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, reserva.getNombreCliente());
            ps.setInt(2, reserva.getDni());
            ps.setDate(3, Date.valueOf(reserva.getFecha()));
            ps.setTime(4, Time.valueOf(reserva.getHora()));
            ps.setBoolean(5, reserva.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                reserva.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva creada con éxito.");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Hubo un error al cargar la Reserva."
                   + "Verifique que el DNI ingresado no tenga una reserva ya realizada");
        }
    }
    
    public void cancelarReserva(int idReserva){
        String sql = "UPDATE reservas SET Estado=0 WHERE idReserva=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idReserva);
            
            int x = ps.executeUpdate();
            
            if(x == 1){
                JOptionPane.showMessageDialog(null, "Reserva cancelada");
            }
            
             ps.close();
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo cancelar la reserva seleccionada.");
        }
        
    }
    
    public void eliminarReserva(int idReserva){
        String sql = "DELETE FROM reservas WHERE idReserva=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idReserva);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo eliminar la reserva seleccionada.");
        }
        
    }
}
