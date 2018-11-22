/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import daos.ClienteDAO;
import daos.MySqlClienteDAO;

/**
 *
 * @author WillingtonOrtiz
 */
public class MySqlDAOFactory extends DAOFactory{

    @Override
    public ClienteDAO getClienteDAO() {
        return new MySqlClienteDAO();
    }
    
}
