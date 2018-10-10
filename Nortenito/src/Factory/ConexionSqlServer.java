package Factory;

import Interfaces.IConexion;
import java.sql.Connection;

public class ConexionSqlServer implements IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    public ConexionSqlServer() {
        this.host = "";
        this.puerto = "jdbc:sqlserver://localhost/pruebas";
        this.usuario = "usuario";
        this.contrasenia = "321";        
    }

    @Override
    public Connection conectar() {
        return null;
    }

    @Override
    public void desconectar() {
        
    }


}
