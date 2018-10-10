package entidades;

public class Platillo {
    private int idPlatillo;
    private double precio;
    private String nombre;

    public Platillo() {}

    public Platillo(int idPlatillo, double precio, String nombre) {
        this.idPlatillo = idPlatillo;
        this.precio = precio;
        this.nombre = nombre;
    }
    
    public int getIdPlatillo() {
        return idPlatillo;
    }
    public void setIdPlatillo(int idPlatillo) {
        this.idPlatillo = idPlatillo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDescripcion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "{" + "idPlatillo: " + this.idPlatillo + ", nombre: " + this.nombre + ", precio: " + this.precio + "}";
    }
    
    
}
