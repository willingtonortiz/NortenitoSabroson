/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomysql;

import dtos.DTOCliente;
import connections.MySqlConnection;
import daos.ClienteDAO;
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
public class MySqlClienteDAO implements ClienteDAO {
    
    private Connection getConnection(){
        MySqlConnection conexion = new MySqlConnection();
        return conexion.connect();
    }
    
    @Override
    public List<DTOCliente> read() {
        String sql = String.format(
                "SELECT * FROM clientes"
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
        
            List<DTOCliente> items = new ArrayList<DTOCliente>();
            
            while(result.next()){
                DTOCliente nuevo = new DTOCliente(
                        result.getInt("idCliente"),
                        result.getString("nombre"),
                        result.getString("apellido"),
                        result.getString("distrito"),
                        result.getInt("telefono")
                );
                items.add(nuevo);
            }
        
            System.out.println("Se obtuvieron los usuarios");
        
            stm.close();
            con.close();
        
            return items;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlClienteDAO -> read(ALL)");
            
        }
        
        return null;
    }

    @Override
    public DTOCliente read(int id) {
        String sql = String.format(
                "SELECT * FROM clientes WHERE idCliente = %d",
                id
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
            
            DTOCliente item = new DTOCliente(
                    result.getInt("idCliente"),
                    result.getString("nombre"),
                    result.getString("apellido"),
                    result.getString("distrito"),
                    result.getInt("telefono")
            );
        
            System.out.println("Se obtuvo al usuario");
        
            stm.close();
            con.close();
        
            return item;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlClienteDAO -> read(one)");
            
        }
        
        return null;
    }

    @Override
    public void insert(DTOCliente item) {
        String query = String.format(
                "INSERT INTO clientes(nombre, apellido, distrito, telefono) VALUES ('%s', '%s', '%s', %d)",
                item.getNombre(),
                item.getApellido(),
                item.getDistrito(),
                item.getTelefono()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se insertó el cliente");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlClienteDAO -> Insert");
            
        }
    }

    @Override
    public void update(DTOCliente item) {
        String query = String.format(
                "UPDATE clientes SET nombre = '%s', apellido = '%s', distrito = '%s', telefono = %d WHERE idCliente = %d",
                item.getNombre(),
                item.getApellido(),
                item.getDistrito(),
                item.getTelefono(),
                item.getIdCliente()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se modificó el cliente");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlClienteDAO -> update");
            
        }
    }

    @Override
    public void delete(DTOCliente item) {
        String query = String.format(
                "DELETE FROM clientes WHERE idCliente = %d",
                item.getIdCliente()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se eliminó el cliente");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlClienteDAO -> delete");
            
        }
    }
    
}
