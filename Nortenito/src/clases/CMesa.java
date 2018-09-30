package clases;

public class CMesa {
    private int idMesa;
    private int idCliente;
    private boolean disponible;

    public CMesa() { }

    public CMesa(int idMesa, int idCliente, boolean disponible) {
        this.idMesa = idMesa;
        this.idCliente = idCliente;
        this.disponible = disponible;
    }

    public int getIdMesa() {
        return idMesa;
    }
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public boolean getDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }    
}
