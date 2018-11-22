/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomysql;
import connections.MySqlConnection;
import daos.MesaDAO;
import dtos.DTOMesa;
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
public class MySqlMesaDAO implements MesaDAO{

    private Connection getConnection(){
        MySqlConnection conexion = new MySqlConnection();
        return conexion.connect();
    }
    
    @Override
    public List<DTOMesa> read() {
        String sql = String.format(
                "SELECT * FROM mesas"
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
        
            List<DTOMesa> items = new ArrayList<DTOMesa>();
            
            while(result.next()){
                DTOMesa nuevo = new DTOMesa(
                        result.getInt("idMesa")
                );
                items.add(nuevo);
            }
        
            System.out.println("Se obtuvieron las mesas");
        
            stm.close();
            con.close();
        
            return items;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlMesaDAO -> read(ALL)");
            
        }
        
        return null;
    }

    @Override
    public DTOMesa read(int id) {
        String sql = String.format(
                "SELECT * FROM mesas WHERE idMesa = %d",
                id
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
            
            DTOMesa item = new DTOMesa(
                    result.getInt("idMesa")
            );
        
            System.out.println("Se obtuvo la mesa");
        
            stm.close();
            con.close();
        
            return item;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlMesaDAO -> read(one)");
            
        }
        
        return null;
    }

    @Override
    public void insert(DTOMesa item) {
        String query = String.format(
                "INSERT INTO mesas VALUES ()"
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se insertó la mesa");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlMesaDAO -> Insert");
            
        }
    }

    @Override
    public void update(DTOMesa item) {
        System.out.println("No se puede mofificar una mesa");
    }

    @Override
    public void delete(DTOMesa item) {
        String query = String.format(
                "DELETE FROM mesas WHERE idMesa = %d",
                item.getIdMesa()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se eliminó la mesa");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlMesaDAO -> delete");
            
        }
    }
    
}
