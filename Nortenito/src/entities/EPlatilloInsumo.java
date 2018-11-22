package entities;

public class EPlatilloInsumo {
    private int idPlatillo;
    private int idInsumo;

    public EPlatilloInsumo() {}

    public EPlatilloInsumo(int idPlatillo, int idInsumo) {
        this.idPlatillo = idPlatillo;
        this.idInsumo = idInsumo;
    }

    public int getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(int idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    
}
