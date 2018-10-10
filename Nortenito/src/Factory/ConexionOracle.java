package Factory;

import Interfaces.IConexion;
import java.sql.Connection;

public class ConexionOracle implements IConexion {
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    public ConexionOracle() {
        this.host = "";
        this.puerto = "";
        this.usuario = "";
        this.contrasenia = "";
    }

    @Override
    public Connection conectar() {
        return null;
    }

    @Override
    public void desconectar() {
        
    }

}
