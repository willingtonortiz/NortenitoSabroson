package entidades;

public class EPlatillo {
    private int idPlatillo;
    private String nombre;
    private float precio;

    public EPlatillo() {}

    public EPlatillo(int idPlatillo, String nombre, float precio) {
        this.idPlatillo = idPlatillo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(int idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("Platillo { IdPlatillo: %d, Nombre: %s, Precio: %f }", idPlatillo, nombre, precio);
    }
    
    
}
