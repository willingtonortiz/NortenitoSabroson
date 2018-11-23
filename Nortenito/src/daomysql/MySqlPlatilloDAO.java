/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomysql;

import connections.MySqlConnection;
import daos.PlatilloDAO;
import dtos.DTOPlatillo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public class MySqlPlatilloDAO implements PlatilloDAO{

    private Connection getConnection(){
        MySqlConnection conexion = new MySqlConnection();
        return conexion.connect();
    }
    
    @Override
    public List<DTOPlatillo> read() {
        String sql = String.format(
                "SELECT * FROM platillos"
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
        
            List<DTOPlatillo> items = new ArrayList<DTOPlatillo>();
            
            while(result.next()){
                DTOPlatillo nuevo = new DTOPlatillo(
                        result.getInt("idPlatillo"),
                        result.getString("nombre"),
                        result.getFloat("precio")
                );
                items.add(nuevo);
            }
        
            System.out.println("Se obtuvieron los platillos");
        
            stm.close();
            con.close();
        
            return items;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlPlatilloDAO -> read(ALL)");
            
        }
        
        return null;
    }

    @Override
    public DTOPlatillo read(int id) {
        String sql = String.format(
                "SELECT * FROM clientes WHERE idCliente = %d",
                id
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
            
            DTOPlatillo item = new DTOPlatillo(
                    result.getInt("idPlatillo"),
                    result.getString("nombre"),
                    result.getFloat("precio")
            );
        
            System.out.println("Se obtuvo el platillo");
        
            stm.close();
            con.close();
        
            return item;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlPlatilloDAO -> read(one)");
            
        }
        
        return null;
    }

    @Override
    public void insert(DTOPlatillo item) {
        String query = String.format(
                "INSERT INTO platillos(nombre, precio) VALUES ('%s', %f)",
                item.getNombre(),
                item.getPrecio()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se insertó el platillo");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlPlatilloDAO -> Insert");
            
        }
    }

    @Override
    public void update(DTOPlatillo item) {
        String query = String.format(
                "UPDATE platillos SET nombre = '%s', precio = %f WHERE idPlatillo = %d",
                item.getNombre(),
                item.getPrecio(),
                item.getIdPlatillo()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se modificó el platillo");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlPlatilloDAO -> update");
            
        }
    }

    @Override
    public void delete(DTOPlatillo item) {
        String query = String.format(
                "DELETE FROM platillos WHERE idPlatillo = %d",
                item.getIdPlatillo()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se eliminó el platillo");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlPlatilloDAO -> delete");
            
        }
    }
    
}
