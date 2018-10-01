package Factory;

import Interfaces.IConexion;

public class ConexionMySql implements IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    public ConexionMySql() {
        this.host = "";
        this.puerto = "";
        this.usuario = "";
        this.contrasenia = "";
    }

    @Override
    public void conectar() {
        System.out.println("Se conectó a MySql");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de MySql");
    }    
}
