package entidades;

public class EPedido {
    private int idPedido;
    private String descripcion;
    private int idCliente;

    public EPedido() { }

    public EPedido(int idPedido, String descripcion, int idCliente) {
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
