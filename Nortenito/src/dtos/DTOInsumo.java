package dtos;

public class DTOInsumo {
    private int idInsumo;
    private int idProveedor;
    private String nombre;
    private int stock;
    private float precio;
    
    public DTOInsumo(){ }

    public DTOInsumo(int idInsumo, int idProveedor, String nombre, int stock, float precio) {
        this.idInsumo = idInsumo;
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("Insumo{ IdInsumo: %d, IdProveedor: %d, Nombre: '%s', Stock: %d, Precio: %f }",
                idInsumo,
                idProveedor,
                nombre,
                stock,
                precio
        );
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
