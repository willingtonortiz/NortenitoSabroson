package clases;

public class CPedido {
    private int idPedido;
    private String descripcion;
    private int idCliente;

    public CPedido() { }

    public CPedido(int idPedido, String descripcion, int idCliente) {
        this.idPedido = idPedido;
        this.descripcion = descripcion;
        this.idCliente = idCliente;
    }

    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
