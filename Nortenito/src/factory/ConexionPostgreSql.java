package factory;

import interfaces.IConexion;
import java.sql.Connection;

public class ConexionPostgreSql implements IConexion {
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    public ConexionPostgreSql() {
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