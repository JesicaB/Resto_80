
package resto_80;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import resto_80.Datos.Conexión;
import resto_80.Datos.MesaD;
import resto_80.Datos.PedidoD;
import resto_80.Datos.ProductoD;
import resto_80.Entidades.Empleado;
import resto_80.Entidades.Mesa;
import resto_80.Entidades.Pedido;
import resto_80.Entidades.Producto;
import resto_80.Entidades.ProductoPedido;


public class Resto_80 {

    
    public static void main(String[] args) {
      Connection conex = Conexión.getConnection();
      
      Mesa m = new Mesa(2, 2, 2, true);
      Empleado e= new Empleado(1,"Jesica Berg", 36355207, true);
      Pedido p = new Pedido(4, m, true, e, LocalDateTime.of(LocalDate.of(2023, Month.FEBRUARY, 7), LocalTime.now()), 500);
      PedidoD pd = new PedidoD();
      
//      pd.agregarPedido(p);
//      pd.modificarPedido(p);
//      pd.eliminarPedido(2);
//        System.out.println(pd.listarPedidos());
//        System.out.println(pd.buscarPedido(2));
        
//      Producto prod = new Producto("Pizza", 2000, true, 20);
//      Mesa mes = new Mesa(5,2, 4, true);
//      Pedido ped = new Pedido(mes, true, e, LocalDate.now(), 30);
//      ProductoPedido pp = new ProductoPedido(prod, ped, 3);
//      
//      ProductoD prodD = new ProductoD();
//      
//      prodD.agregarProducto(prod);
//      
//      MesaD mesaD = new MesaD();
//      
//      mesaD.agregarMesa(mes);
//      

//      
//      pedD.agregarPedido(ped);
      
//      Pedido ped1 = new Pedido(6, mes, true, "Pablo", LocalDate.now(), 30);
//      
//      pedD.modificarPedido(ped1);
//      
//      pedD.bajaPedido(6);
//      
//      System.out.println(pedD.listarPedidos());
//      
//      System.out.println(pedD.buscarPedido(6));
//        
//      pedD.eliminarPedido(6);
              
//        prodD.bajaProducto(1);

//           System.out.println(prodD.buscarProducto(3));
//           
//           System.out.println(prodD.listarProductos());
           
           
//          prodD.eliminarProducto(5);
//           
//           prod=new Producto(2, "Lomo", 2800, true, 1);
//           
//           prodD.modificarProducto(prod);
      
      
    }
}
