package interfaces;

import java.sql.Connection;

public interface IConexion {
    public Connection conectar();
    public void desconectar();
}
