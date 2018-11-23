/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomysql;

import connections.MySqlConnection;
import daos.InsumoDAO;
import dtos.DTOInsumo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author WillingtonOrtiz
 */
public class MySqlInsumoDAO implements InsumoDAO {

    private Connection getConnection(){
        MySqlConnection conexion = new MySqlConnection();
        return conexion.connect();
    }
    
    @Override
    public List<DTOInsumo> read() {
        String sql = String.format(
                "SELECT * FROM insumos"
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
        
            List<DTOInsumo> items = new ArrayList<DTOInsumo>();
            
            while(result.next()){
                DTOInsumo nuevo = new DTOInsumo(
                        result.getInt("idInsumo"),
                        result.getInt("idProveedor"),
                        result.getString("nombre"),
                        result.getInt("stock"),
                        result.getFloat("precio")
                );
                items.add(nuevo);
            }
        
            System.out.println("Se obtuvieron los insumos");
        
            stm.close();
            con.close();
        
            return items;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlInsumoDAO -> read(ALL)");
            
        }
        
        return null;
    }

    @Override
    public DTOInsumo read(int id) {
        String sql = String.format(
                "SELECT * FROM insumos WHERE idInsumo = %d",
                id
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
            
            DTOInsumo item = new DTOInsumo(
                        result.getInt("idInsumo"),
                        result.getInt("idProveedor"),
                        result.getString("nombre"),
                        result.getInt("stock"),
                        result.getFloat("precio")
                );
        
            System.out.println("Se obtuvo el insumo");
        
            stm.close();
            con.close();
        
            return item;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlInsumoDAO -> read(one)");
            
        }
        
        return null;
    }

    @Override
    public void insert(DTOInsumo item) {
        String query = String.format(Locale.US,
                "INSERT INTO insumos (idProveedor, nombre, stock, precio) VALUES (%d, '%s', %d, %s)",
                item.getIdProveedor(),
                item.getNombre(),
                item.getStock(),
                item.getPrecio()
        );
        
        System.out.println(query);
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se insertó el insumo");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlInsumoDAO -> Insert");
            System.out.println(ex);
            
        }
    }

    @Override
    public void update(DTOInsumo item) {
        String query = String.format(
                "UPDATE insumos SET idProveedor = %d, nombre = '%s', stock = %d, precio = %f WHERE idInsumo = %d",
                item.getIdProveedor(),
                item.getNombre(),
                item.getStock(),
                item.getPrecio(),
                item.getIdInsumo()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se modificó el insumo");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlInsumoDAO -> update");
            
        }
    }

    @Override
    public void delete(DTOInsumo item) {
        String query = String.format(
                "DELETE FROM insumos WHERE idInsumo = %d",
                item.getIdInsumo()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se eliminó el insumo");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlInsumoDAO -> delete");
            
        }
    }    
}
