package Entidades;

import java.util.Date;

public class EComprobantePago {
    private int idComprobantePago;
    private String descripcion;
    private double monto;
    private int idMesero;
    private int idMesa;
    private Date fecha;

    public EComprobantePago() { }

    public EComprobantePago(int idComprobantePago, String descripcion, double monto, int idMesero, int idMesa, Date fecha) {
        this.idComprobantePago = idComprobantePago;
        this.descripcion = descripcion;
        this.monto = monto;
        this.idMesero = idMesero;
        this.idMesa = idMesa;
        this.fecha = fecha;
    }

    public int getIdComprobantePago() {
        return idComprobantePago;
    }
    public void setIdComprobantePago(int idComprobantePago) {
        this.idComprobantePago = idComprobantePago;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public int getIdMesero() {
        return idMesero;
    }
    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }
    public int getIdMesa() {
        return idMesa;
    }
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
