package nortenito;

import Factory.ConexionFactory;
import Interfaces.IConexion;


public class Nortenito {

    public static void main(String[] args) {
        ConexionFactory fabrica = new ConexionFactory();
        
        IConexion conecSqlServer = fabrica.getConexion("sQlSeRvEr");
        
        conecSqlServer.conectar();
        
        conecSqlServer.desconectar();
        
    }
    
}
