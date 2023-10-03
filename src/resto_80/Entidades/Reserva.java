/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resto_80.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Jesica
 */
public class Reserva {
    private int idReserva;
    private String nombreCliente;
    private int dni;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean estado;

    public Reserva() {
    }

    public Reserva(int idReserva, String nombreCliente, int dni, LocalDate fecha, LocalTime hora, boolean estado) {
        this.idReserva = idReserva;
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Reserva(String nombreCliente, int dni, LocalDate fecha, LocalTime hora, boolean estado) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return idReserva + " - " + nombreCliente + " - " + dni + " - " + fecha + " - " + hora + " - " + estado;
    }
    
}
