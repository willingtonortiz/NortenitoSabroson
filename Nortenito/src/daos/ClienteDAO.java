/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.DTOCliente;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface ClienteDAO {
    public List<DTOCliente> read();
    public DTOCliente read(int id);
    public void insert(DTOCliente item);
    public void update(DTOCliente item);
    public void delete(DTOCliente item);
}
