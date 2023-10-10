
package resto_80.Entidades;


public class Empleado {
    
    private int idEmpleado;
    private String Nombre_apellido;
    private int dni;
    private boolean estado;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String Nombre_apellido, int dni, boolean estado) {
        this.idEmpleado = idEmpleado;
        this.Nombre_apellido = Nombre_apellido;
        this.dni = dni;
        this.estado = estado;
    }

    public Empleado(String Nombre_apellido, int dni, boolean estado) {
        this.Nombre_apellido = Nombre_apellido;
        this.dni = dni;
        this.estado = estado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre_apellido() {
        return Nombre_apellido;
    }

    public void setNombre_apellido(String Nombre_apellido) {
        this.Nombre_apellido = Nombre_apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Empleados{" + "idEmpleado=" + idEmpleado + ", Nombre_apellido=" + Nombre_apellido + ", dni=" + dni + ", estado=" + estado + '}';
    }

}