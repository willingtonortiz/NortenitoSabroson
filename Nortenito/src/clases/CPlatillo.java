package clases;

public class CPlatillo {
    private int idPlatillo;
    private double costo;
    private String descripcion;

    public CPlatillo() {}

    public CPlatillo(int idPlatillo, double costo, String descripcion) {
        this.idPlatillo = idPlatillo;
        this.costo = costo;
        this.descripcion = descripcion;
    }
    
    public int getIdPlatillo() {
        return idPlatillo;
    }
    public void setIdPlatillo(int idPlatillo) {
        this.idPlatillo = idPlatillo;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
