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
import resto_80.Datos.MesaD;
import resto_80.Datos.PedidoD;
import resto_80.Datos.ProductoD;
import resto_80.Entidades.Mesa;
import resto_80.Entidades.Pedido;
import resto_80.Entidades.Producto;


public class Resto_80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Connection conex = Conexión.getConnection();

            Mesa mes = new Mesa(1,1,4,true);
            MesaD mesd = new MesaD();
            
            //System.out.println(mesd.listarMesas());
            //mesd.eliminarMesa(4);
            //mesd.bajaMesa(2);
            //System.out.println(mesd.buscarMesa(3));
            //mesd.modificarMesa(mes);
            //mesd.agregarMesa(mes);
        
        Pedido ped = new Pedido(3, mes, true);
        PedidoD pedd = new PedidoD();
        
        //System.out.println(pedd.listarPedidos());
        
        System.out.println(pedd.buscarPedido(3));
        
        //pedd.eliminarPedido(3);
        //pedd.bajaPedido(3);
        
       //pedd.agregarPedido(ped);

        //Producto prod = new Producto(4, "Tacos", 2000, true);
        //ProductoD prodd = new ProductoD();

//        prodd.agregarProducto(prod);
//        prodd.bajaProducto(4);
        
//        System.out.println(prodd.listarProductos());
//        prodd.modificarProducto(prod);
//        System.out.println( prodd.buscarProducto(3));
//        prodd.eliminarProducto(4);
    }

}
