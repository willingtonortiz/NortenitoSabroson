package factory;

import interfaces.IConexion;

public class ConexionFactory {
    public IConexion getConexion(String nombre){
        if(nombre == null){
            return new ConexionVacia();
        }
        else if(nombre.equalsIgnoreCase("SQLSERVER")){
            return new ConexionSqlServer();
        }
        else if(nombre.equalsIgnoreCase("MYSQL")){
            return new ConexionMySql();
        }
        else if(nombre.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
        }
        else if(nombre.equalsIgnoreCase("POSTGRE")){
            return new ConexionPostgreSql();
        }
        else{
            return new ConexionVacia();
        }
    }
}
