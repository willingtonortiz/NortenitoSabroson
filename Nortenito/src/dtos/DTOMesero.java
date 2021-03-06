package dtos;

public class DTOMesero {
    private int idMesero;
    private String nombre;
    private String apellido;

    public DTOMesero() { }

    public DTOMesero(int idMesero, String nombre, String apellido) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
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

    
}
