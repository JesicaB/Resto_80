/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import resto_80.Entidades.Producto;
/**
 *
 * @author MANUEL
 */
public class ProductoD {
    private Connection con = null;
    
    public ProductoD(){
        con = Conexión.getConnection();
    }
    
    public void agregarProducto(Producto producto){
        
        String sql= "INSERT INTO productos (Nombre, Cantidad, Precio) "
                + "VALUES (,?,?,?,?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido con éxito.");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Hubo un error al cargar el Producto."
                   + "Verifique que el producto no haya sido cargado anteriormente");
        }
    }
    
    public void modificarProducto(Producto producto){
        String sql = "UPDATE productos SET Nombre=?,Cantidad=?,Precio=? WHERE idProducto=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
                        
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Producto modificado.");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla productos.");
        }
       
        
    }
    
    public void eliminarProducto(int idProducto){
        String sql = "DELETE FROM productos WHERE idProducto=?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idProducto);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error y no se pudo eliminar el producto seleccionado");
        }
        
    }
    
    public List<Producto> listarProductos()
     {
         String sql= "SELECT * FROM productos";
         ArrayList<Producto> productos= new ArrayList<>();
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
                
                Producto producto =new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("Nombre"));
                producto.setCantidad(rs.getInt("Cantidad"));
                producto.setPrecio(rs.getDouble("Precio"));
                                
                productos.add(producto);
            }
            
             ps.close();
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla productos.");
        }
        
        return productos;
    
    }
    
    public Producto buscarProducto(int id)
     {
         String sql= "SELECT * FROM productos WHERE idProducto = ?";
         Producto producto=null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            
            if (rs.next()){
                
                producto=new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("Nombre"));
                producto.setCantidad(rs.getInt("Cantidad"));
                producto.setPrecio(rs.getDouble("Precio"));
                
            }else{
                JOptionPane.showMessageDialog(null, "El producto no existe o fue eliminado");
            }
            
             ps.close();
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }
        
        return producto;
         
     }
}
