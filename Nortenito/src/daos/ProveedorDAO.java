/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.EProveedor;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface ProveedorDAO {
    public List<EProveedor> read();
    public EProveedor read(int id);
    public void insert(EProveedor item);
    public void update(EProveedor item);
    public void delete(EProveedor item);
}
