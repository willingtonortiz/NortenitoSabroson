package dao;

import factory.ConexionFactory;
import interfaces.IConexion;
import entidades.Platillo;
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
    public List<Platillo> ListAll() {
        
        
        if(this.base.equalsIgnoreCase("MYSQL")){
            Connection conexion = this.conexion.conectar();
            
            try {
                String query = "SELECT * FROM platillo";
                Statement sentencia = conexion.createStatement();
                ResultSet resultado = sentencia.executeQuery(query);
                
                // Creación de la lista de platillos
                List<Platillo> platillos = new ArrayList<Platillo>();
                
                // Asisnando cada platillo
                while(resultado.next()){
                    int id = resultado.getInt("idplatillo");
                    String nombre = resultado.getString("nombre");
                    int precio = resultado.getInt("precio");
                    
                    Platillo item = new Platillo(id, precio, nombre);
                    
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
    public Platillo getId(int id) {
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
