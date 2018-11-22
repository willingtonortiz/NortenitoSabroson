package entities;

public class ECliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String distrito;
    private int telefono;
    
    
    public ECliente() {}

    public ECliente(int idCliente, String nombre, String apellido, String distrito, int telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.distrito = distrito;
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return String.format("ECliente{idCliente: %d, Nombre: %s, Apellido: %s, Distrito: %s, Telefono: %d}", 
                idCliente,
                nombre,
                apellido,
                distrito,
                telefono
        );
    }
}
