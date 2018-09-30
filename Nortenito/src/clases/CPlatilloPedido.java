package clases;

public class CPlatilloPedido {
    private int idPlatillo;
    private int idPedido;

    public CPlatilloPedido() {}
    
    public CPlatilloPedido(int idPlatillo, int idPedido) {
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
