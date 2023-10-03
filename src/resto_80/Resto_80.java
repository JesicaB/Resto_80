package resto_80;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import resto_80.Datos.Conexión;
import resto_80.Datos.MeseroD;
import resto_80.Datos.ReservaD;
import resto_80.Entidades.Mesa;
import resto_80.Entidades.Mesero;
import resto_80.Entidades.Reserva;

public class Resto_80 {

    public static void main(String[] args) {
        Connection conex = Conexión.getConnection();

        MeseroD md = new MeseroD();

//    Mesero m= new Mesero("Nicolas","Peciña","nicopeci",1234,true);
//    md.agregarMesero(m);
//    Mesero m= new Mesero (4,"Nicolas","Peciña","nicopeci",987654,true);
//    md.modificarMesero(m);
//    md.eliminarMesero(4);
//    System.out.println(md.buscarMesero(4));
//    System.out.println(md.listarMesero());
    }

}
