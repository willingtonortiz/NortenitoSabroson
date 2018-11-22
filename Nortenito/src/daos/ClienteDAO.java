/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.ECliente;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface ClienteDAO {
    public List<ECliente> read();
    public ECliente read(int id);
    public void insert(ECliente item);
    public void update(ECliente item);
    public void delete(ECliente item);
}
