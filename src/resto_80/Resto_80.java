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
import resto_80.Datos.ReservaD;
import resto_80.Entidades.Mesa;
import resto_80.Entidades.Reserva;

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
        
        Reserva r = new Reserva(1, "Perez Carlos", 36355207, LocalDate.now(), LocalTime.now(), true);
        ReservaD rd = new ReservaD();
        
//        rd.agregarReserva(r);
//        rd.cancelarReserva(1);
//        rd.eliminarReserva(1);
//        rd.modificarReserva(r);
//        System.out.println(rd.listarReservas());


    }
    
}
