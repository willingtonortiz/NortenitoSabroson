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
        return null;
    }

    @Override
    public DTOPlatillo read(int id) {
        return null;
    }

    @Override
    public void insert(DTOPlatillo item) {
        
    }

    @Override
    public void update(DTOPlatillo item) {
        
    }

    @Override
    public void delete(DTOPlatillo item) {
        
    }
    
}
