package InsumoDAO;

import factory.ConexionFactory;
import interfaces.IConexion;
import entidades.EPlatillo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlatilloDAOImplements implements PlatilloDAO{

    public String base;
    public IConexion conexion;    
    
    public PlatilloDAOImplements(String base) {
        this.base = base;
        ConexionFactory factory = new ConexionFactory();
        this.conexion = factory.getConexion(base);
    }
    
    @Override
    public List<EPlatillo> ListAll() {
        
        if(this.base.equalsIgnoreCase("MYSQL")){
            Connection conexion = this.conexion.conectar();
            
            try {
                String query = "SELECT * FROM platillos";
                Statement sentencia = conexion.createStatement();
                ResultSet resultado = sentencia.executeQuery(query);
                
                // Creación de la lista de platillos
                List<EPlatillo> platillos = new ArrayList<EPlatillo>();
                
                // Asignando cada platillo
                while(resultado.next()){
                    int id = resultado.getInt("idPlatillo");
                    String nombre = resultado.getString("nombre");
                    float precio = resultado.getFloat("precio");
                    
                    EPlatillo item = new EPlatillo(id, nombre, precio);
                    
                    platillos.add(item);
                }
                
                // Cerrando conexiones
                sentencia.close();
                this.conexion.desconectar();
                
                // Retornando datos
                return platillos;
            }
            catch(SQLException e){
                System.out.println(e.getMessage());                
            }
        }
        else{
            return null;
        }
        return null;
    }

    @Override
    public EPlatillo getId(int id) {
        System.out.println("Id encontrado: " + id);
        return null;
    }

    @Override
    public void Update() {
        System.out.println("Se actualizó");
    }

    @Override
    public void Insert() {
        System.out.println("Se insertó");
    }

    @Override
    public void Delete() {
        System.out.println("Se borró");
    }
    
}
