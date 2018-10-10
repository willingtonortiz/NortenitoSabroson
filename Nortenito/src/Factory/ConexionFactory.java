package Factory;

import Interfaces.IConexion;
import java.sql.SQLException;

public class ConexionFactory {
    public IConexion getConexion(String nombre) throws SQLException, ClassNotFoundException{
        if(nombre == null){
            return new ConexionVacia();
        }
        else if(nombre.equalsIgnoreCase("SqlServer")){
            return new ConexionSqlServer();
        }
        else if(nombre.equalsIgnoreCase("MySql")){
            return new ConexionMySql();
        }
        else if(nombre.equalsIgnoreCase("Oracle")){
            return new ConexionOracle();
        }
        else if(nombre.equalsIgnoreCase("Postgre")){
            return new ConexionPostgreSql();
        }
        else{
            return new ConexionVacia();
        }
    }
}
