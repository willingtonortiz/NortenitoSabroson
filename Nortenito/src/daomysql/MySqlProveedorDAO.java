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
        return null;
    }

    @Override
    public DTOProveedor read(int id) {
        return null;
    }

    @Override
    public void insert(DTOProveedor item) {
        
    }

    @Override
    public void update(DTOProveedor item) {
        
    }

    @Override
    public void delete(DTOProveedor item) {
        
    }
    
}
