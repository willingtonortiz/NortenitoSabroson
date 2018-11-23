package dtos;

public class DTOProveedor {
    private int idProveedor;
    private String nombre;
    private String direccion;
    private String distrito;
    private int telefono;

    public DTOProveedor() { }

    public DTOProveedor(int idProveedor, String nombre, String direccion, String distrito, int telefono) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.distrito = distrito;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return String.format("DTOProveedor{ IdProveedor: %d, Nombre: %s, Direccion: %s, Distrito: %s, Telefono: %d }",
                idProveedor,
                nombre,
                direccion,
                distrito,
                telefono);
    }    

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
    
}
