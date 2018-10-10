package Factory;

import Interfaces.IConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMySql implements IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

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
        catch (SQLException ex) {
            Logger.getLogger(ConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de MySql");
    }    
}
