package factory;

import interfaces.IConexion;
import java.sql.Connection;

public class ConexionVacia implements IConexion{

    public ConexionVacia() { }

    @Override
    public Connection conectar() {
        return null;
    }
    
    @Override
    public void desconectar() {
        
    }   
}
