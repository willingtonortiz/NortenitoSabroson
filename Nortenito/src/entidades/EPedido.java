package entidades;

import java.util.Date;

public class EPedido {
    private int idPedido;
    private int idCliente;
    private int idMesero;
    private int idMesa;
    private Date fecha;

    public EPedido() { }

    public EPedido(int idPedido, int idCliente, int idMesero, int idMesa, Date fecha) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.idMesero = idMesero;
        this.idMesa = idMesa;
        this.fecha = fecha;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
