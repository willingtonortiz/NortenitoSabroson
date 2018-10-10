package entidades;

public class Insumo {
    private int idInsumo;
    private String nombre;
    private int cantidad;   
    private double precio;
    
    public Insumo(){ }
    
    public Insumo(int idInsumo, String nombre, int cantidad, double precio) {
        this.idInsumo = idInsumo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getIdInsumo() {
        return idInsumo;
    }
    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }    
    
    @Override
    public String toString(){
        return "Id: " + idInsumo + ", Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio: " + precio;
    }
}
