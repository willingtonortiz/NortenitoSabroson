package Factory;

import Interfaces.IConexion;

public class ConexionSqlServer implements IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    public ConexionSqlServer() {
        this.host = "";
        this.puerto = "";
        this.usuario = "";
        this.contrasenia = "";
    }

    @Override
    public void conectar() {
        System.out.println("Se conectó a SqlServer");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de SqlServer");
    }    
}
