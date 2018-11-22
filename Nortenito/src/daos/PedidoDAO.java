/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.EPedido;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface PedidoDAO {
    public List<EPedido> read();
    public EPedido read(int id);
    public void insert(EPedido item);
    public void update(EPedido item);
    public void delete(EPedido item);
}
