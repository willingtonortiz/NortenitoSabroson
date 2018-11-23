/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomysql;

import connections.MySqlConnection;
import daos.ProveedorDAO;
import dtos.DTOProveedor;
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
public class MySqlProveedorDAO implements ProveedorDAO{

    private Connection getConnection(){
        MySqlConnection conexion = new MySqlConnection();
        return conexion.connect();
    }
    
    @Override
    public List<DTOProveedor> read() {
        String sql = String.format(
                "SELECT * FROM proveedores"
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
        
            List<DTOProveedor> items = new ArrayList<DTOProveedor>();
            
            while(result.next()){
                DTOProveedor nuevo = new DTOProveedor(
                        result.getInt("idProveedor"),
                        result.getString("nombre"),
                        result.getString("direccion"),
                        result.getString("distrito"),
                        result.getInt("telefono")
                );
                items.add(nuevo);
            }
        
            System.out.println("Se obtuvieron los proveedores");
        
            stm.close();
            con.close();
        
            return items;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlProveedoresDAO -> read(ALL)");
            
        }
        
        return null;
    }

    @Override
    public DTOProveedor read(int id) {
        String sql = String.format(
                "SELECT * FROM proveedores WHERE idProveedores = %d",
                id
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
            
            DTOProveedor item = new DTOProveedor(
                    result.getInt("idProveedor"),
                    result.getString("nombre"),
                    result.getString("direccion"),
                    result.getString("distrito"),
                    result.getInt("telefono")
            );
        
            System.out.println("Se obtuvo el proveedor");
        
            stm.close();
            con.close();
        
            return item;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlProveedorDAO -> read(one)");
            
        }
        
        return null;
    }

    @Override
    public void insert(DTOProveedor item) {
        String query = String.format(
                "INSERT INTO proveedores(nombre, direccion, distrito, telefono) VALUES ('%s', '%s', '%s', %d)",
                item.getNombre(),
                item.getDireccion(),
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
    public void update(DTOProveedor item) {
        String query = String.format(
                "UPDATE proveedores SET nombre = '%s', direccion = '%s', distrito = '%s', telefono = %d WHERE idProveedor = %d",
                item.getNombre(),
                item.getDireccion(),
                item.getDistrito(),
                item.getTelefono(),
                item.getIdProveedor()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se modificó el proveedor");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlProveedorDAO -> update");
            
        }
    }

    @Override
    public void delete(DTOProveedor item) {
        String query = String.format(
                "DELETE FROM proveedores WHERE idProveedor = %d",
                item.getIdProveedor()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se eliminó el proveedor");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlProveedorDAO -> delete");
            
        }
    }
    
}
