package Entidades;

public class EPlatilloPedido {
    private int idPlatillo;
    private int idPedido;

    public EPlatilloPedido() {}
    
    public EPlatilloPedido(int idPlatillo, int idPedido) {
        this.idPlatillo = idPlatillo;
        this.idPedido = idPedido;
    }
    
    public int getIdPlatillo() {
        return idPlatillo;
    }
    public void setIdPlatillo(int idPlatillo) {
        this.idPlatillo = idPlatillo;
    }
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
}
