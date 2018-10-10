package factory;

import interfaces.IConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySql implements IConexion{
    private final String host;
    private final String puerto;
    private final String usuario;
    private final String contrasenia;

    public ConexionMySql() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "usuario";
        this.contrasenia = "123";
    }

    @Override
    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.puerto + "/prueba?useLegacyDatetimeCode=false&serverTimezone=UTC", this.usuario, this.contrasenia);
            return conexion;
        }
        catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public void desconectar() {
        
    }    
}
