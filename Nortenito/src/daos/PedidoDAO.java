/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.DTOPedido;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface PedidoDAO {
    public List<DTOPedido> read();
    public DTOPedido read(int id);
    public void insert(DTOPedido item);
    public void update(DTOPedido item);
    public void delete(DTOPedido item);
}
