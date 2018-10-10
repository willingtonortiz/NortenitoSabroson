package vista;

import Factory.ConexionFactory;
import Interfaces.IConexion;
import java.sql.Connection;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConexionFactory fabrica = new ConexionFactory();
        
        IConexion conecSqlServer = fabrica.getConexion("mysql");
        
        Connection con =  conecSqlServer.conectar();
        
        
    }    
}
