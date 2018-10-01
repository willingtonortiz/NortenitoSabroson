package Entidades;

public class EMesero {
    private int idMesero;
    private String nombre;

    public EMesero() { }

    public EMesero(int idMesero, String nombre) {
        this.idMesero = idMesero;
        this.nombre = nombre;
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
}
