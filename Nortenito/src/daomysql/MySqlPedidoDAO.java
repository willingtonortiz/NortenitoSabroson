/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daomysql;

import connections.MySqlConnection;
import daos.PedidoDAO;
import dtos.DTOPedido;
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
public class MySqlPedidoDAO implements PedidoDAO{

    private Connection getConnection(){
        MySqlConnection conexion = new MySqlConnection();
        return conexion.connect();
    }
    
    @Override
    public List<DTOPedido> read() {
        String sql = String.format(
                "SELECT * FROM pedidos"
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
        
            List<DTOPedido> items = new ArrayList<DTOPedido>();
            
            while(result.next()){
                DTOPedido nuevo = new DTOPedido(
                        result.getInt("idPedido"),
                        result.getInt("idCliente"),
                        result.getInt("idMesero"),
                        result.getInt("idMesa"),
                        result.getDate("fecha")
                );
                items.add(nuevo);
            }
        
            System.out.println("Se obtuvieron los pedidos");
        
            stm.close();
            con.close();
        
            return items;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlPedidoDAO -> read(ALL)");
            
        }
        
        return null;
    }

    @Override
    public DTOPedido read(int id) {
        String sql = String.format(
                "SELECT * FROM pedidos WHERE idPedido = %d",
                id
        );
        
        try{
            Connection con = getConnection();
            
            Statement stm = con.createStatement();
            
            ResultSet result = stm.executeQuery(sql);
            
            DTOPedido item = new DTOPedido(
                    result.getInt("idPedido"),
                    result.getInt("idCliente"),
                    result.getInt("idMesero"),
                    result.getInt("idMesa"),
                    result.getDate("fecha")
                );
        
            System.out.println("Se obtuvo el pedido");
        
            stm.close();
            con.close();
        
            return item;
        }
        catch(SQLException e){
            
            System.out.println("Fallo en MySqlPedidoDAO -> read(one)");
            
        }
        
        return null;
    }

    @Override
    public void insert(DTOPedido item) {
        String query = String.format(
                "INSERT INTO pedidos(idCliente, idMesero, idMesa, fecha) VALUES (%d, %d, %d, '%s')",
                item.getIdCliente(),
                item.getIdMesero(),
                item.getIdMesa(),
                item.getFecha()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se insertó el pedido");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlPedidoDAO -> Insert");
            
        }
    }

    @Override
    public void update(DTOPedido item) {
        String query = String.format(
                "UPDATE pedidos SET idCliente = %d, idMesero = %d, idMesa = %d, fecha = '%s' WHERE idPedido = %d",
                item.getIdCliente(),
                item.getIdMesero(),
                item.getIdMesa(),
                item.getFecha(),
                item.getIdPedido()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se modificó el pedido");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlPedidoDAO -> update");
            
        }
    }

    @Override
    public void delete(DTOPedido item) {
        String query = String.format(
                "DELETE FROM pedidos WHERE idPedido = %d",
                item.getIdPedido()
        );
        
        try {
            Connection con = getConnection();
        
            Statement stm = con.createStatement();
            
            stm.executeUpdate(query);
            
            System.out.println("Se eliminó el pedido");
        
            stm.close();
            con.close();
            
        } catch (SQLException ex) {
            
            System.out.println("Fallo en MySqlPedidoDAO -> delete");
            
        }
    }
    
}
