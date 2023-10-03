
package resto_80.Entidades;


public class Mesero {
    private int idMesero;
    private String nombre;
    private String apellido;
    private String usuario;
    private int contraseña;
    private boolean estado;

    public Mesero() {
    }

    public Mesero(int idMesero, String nombre, String apellido, String usuario, int contraseña, boolean esatdo) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = esatdo;
    }

    public Mesero(String nombre, String apellido, boolean esatdo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = esatdo;
    }

    public Mesero(String nombre, String apellido, String usuario, int contraseña, boolean esatdo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = esatdo;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idMesero + " - " + nombre + " - " + apellido + " - " + usuario + " - " + contraseña + " - " + estado;
    }
    
}
