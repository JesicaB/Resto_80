/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto_80;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import resto_80.Datos.Conexión;
import resto_80.Datos.ProductoD;
import resto_80.Entidades.Mesa;
import resto_80.Entidades.Producto;

/**
 *
 * @author Jesica
 */
public class Resto_80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conex = Conexión.getConnection();

        Producto prod = new Producto(4, "Tacos", 2000, true);
        ProductoD prodd = new ProductoD();

//        prodd.agregarProducto(prod);
//        prodd.bajaProducto(4);
        
//        System.out.println(prodd.listarProductos());
//        prodd.modificarProducto(prod);
//        System.out.println( prodd.buscarProducto(3));
//          prodd.eliminarProducto(4);
    }

}
