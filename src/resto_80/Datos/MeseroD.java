
package resto_80.Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
//import org.mariadb.jdbc.Statement;
import resto_80.Entidades.Mesero;

public class MeseroD {
    
    private Connection con = null;
    
    public MeseroD(){
        con = Conexión.getConnection();
    }
    
    public void agregarMesero (Mesero mesero){
        
        String sql= "INSERT INTO meseros (nombre, apellido, usuario, contraseña, estado) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getApellido());
            ps.setString(3, mesero.getUsuario());
            ps.setInt(4,mesero.getContraseña());
            ps.setBoolean(5, mesero.isEstado());
            
            ps.execute();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                mesero.setIdMesero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesero creado con éxito.");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al crear el mesero."
                   + "Verifique los datos ingresados e intentelo nuevamente");
        }       
    }
     
    public void modificarMesero (Mesero mesero){
        
        String sql= "UPDATE meseros SET nombre=?,apellido=?,usuario=?,contraseña=?,estado=? WHERE idMesero=?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getApellido());
            ps.setString(3, mesero.getUsuario());
            ps.setInt(4,mesero.getContraseña());
            ps.setBoolean(5, mesero.isEstado());
            ps.setInt(6, mesero.getIdMesero());
            
            int mod=ps.executeUpdate();
            
                     
            if(mod!=0){
                
                JOptionPane.showMessageDialog(null, "Mesero modificado con éxito.");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al modificar el mesero."
                   + "Verifique los datos ingresados e intentelo nuevamente");
        }
    }
    
    public void eliminarMesero (int idMesero){
               
    String sql = "UPDATE meseros SET estado=0 WHERE idMesero= ?";
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Mesero eliminado con exito");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar al mesero.");
        }
         
     }
    
    public Mesero buscarMesero (int idMesero){
        
        String sql= "SELECT * FROM meseros WHERE idMesero = ?";
         Mesero mesero=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,idMesero);
            ResultSet rs= ps.executeQuery();
            
            if (rs.next()){
                
                mesero=new Mesero();
                
                mesero.setIdMesero(idMesero);
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setUsuario(rs.getString("usuario"));
                mesero.setContraseña(rs.getInt("contraseña"));
                mesero.setEstado(rs.getBoolean("estado"));
                
            }else{
                JOptionPane.showMessageDialog(null, "El mesero no existe");
            }
            
             ps.close();
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        
        return mesero;
                   
    }
    
    public List<Mesero> listarMesero(){
        
         String sql= "SELECT * FROM meseros";
         
         ArrayList<Mesero> meseros= new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
                
                Mesero mesero=new Mesero();
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setApellido(rs.getString("apellido"));
                mesero.setUsuario(rs.getString("usuario"));
                mesero.setContraseña(rs.getInt("contraseña"));
                mesero.setEstado(rs.getBoolean("estado"));
                
                meseros.add(mesero);
            }
            
             ps.close();
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        
        return meseros;
         
     }
    
    
    
    
    
    
    
    
    
    
    
}

