/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomysql;

import connections.MySqlConnection;
import daos.MeseroDAO;
import dtos.DTOCliente;
import dtos.DTOMesero;
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
public class MySqlMeseroDAO implements MeseroDAO{

    private Connection getConnection(){
        MySqlConnection conexion = new MySqlConnection();
        return conexion.connect();
    }
    
    @Override
    public List<DTOMesero> read() {
        String sql = String.format(
                "SELECT * FROM meseros"
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
        
            List<DTOMesero> items = new ArrayList<DTOMesero>();
            
            while(result.next()){
                DTOMesero nuevo = new DTOMesero(
                        result.getInt("idMesero"),
                        result.getString("nombre"),
                        result.getString("apellido")
                );
                items.add(nuevo);
            }
        
            System.out.println("Se obtuvieron los meseros");
        
            stm.close();
            con.close();
        
            return items;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlMeseroDAO -> read(ALL)");
            
        }
        
        return null;
    }

    @Override
    public DTOMesero read(int id) {
        String sql = String.format(
                "SELECT * FROM meseros WHERE idMesero = %d",
                id
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
            
            DTOMesero item = new DTOMesero(
                    result.getInt("idMesero"),
                    result.getString("nombre"),
                    result.getString("apellido")
            );
        
            System.out.println("Se obtuvo el mesero");
        
            stm.close();
            con.close();
        
            return item;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlMeseroDAO -> read(one)");
            
        }
        
        return null;
    }

    @Override
    public void insert(DTOMesero item) {
        String query = String.format(
                "INSERT INTO meseros(nombre, apellido) VALUES ('%s', '%s')",
                item.getNombre(),
                item.getApellido()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se insertó el mesero");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlMeseroDAO -> Insert");
            
        }
    }

    @Override
    public void update(DTOMesero item) {
        String query = String.format(
                "UPDATE meseros SET nombre = '%s', apellido = '%s' WHERE idMesero = %d",
                item.getNombre(),
                item.getApellido(),
                item.getIdMesero()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se modificó el mesero");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlMeseroDAO -> update");
            
        }
    }

    @Override
    public void delete(DTOMesero item) {
        String query = String.format(
                "DELETE FROM meseros WHERE idMesero = %d",
                item.getIdMesero()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se eliminó el mesero");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlMeseroDAO -> delete");
            
        }
    }
    
}
