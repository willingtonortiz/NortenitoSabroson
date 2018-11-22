/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import daomysql.MySqlClienteDAO;
import daomysql.MySqlInsumoDAO;
import daomysql.MySqlMesaDAO;
import daomysql.MySqlMeseroDAO;
import daomysql.MySqlPedidoDAO;
import daomysql.MySqlPlatilloDAO;
import daomysql.MySqlProveedorDAO;
import daos.ClienteDAO;
import daos.InsumoDAO;
import daos.MesaDAO;
import daos.MeseroDAO;
import daos.PedidoDAO;
import daos.PlatilloDAO;
import daos.ProveedorDAO;

/**
 *
 * @author WillingtonOrtiz
 */
public class MySqlDAOFactory extends DAOFactory{

    @Override
    public ClienteDAO getClienteDAO() {
        return new MySqlClienteDAO();
    }

    @Override
    public InsumoDAO getInsumoDAO() {
        return new MySqlInsumoDAO();
    }

    @Override
    public MesaDAO getMesaDAO() {
        return new MySqlMesaDAO();
    }

    @Override
    public MeseroDAO getMeseroDAO() {
        return new MySqlMeseroDAO();
    }

    @Override
    public PedidoDAO getPedidoDAO() {
        return new MySqlPedidoDAO();
    }

    @Override
    public PlatilloDAO getPlatilloDAO() {
        return new MySqlPlatilloDAO();
    }

    @Override
    public ProveedorDAO getProveedorDAO() {
        return new MySqlProveedorDAO();
    }
    
}
