/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.DTOProveedor;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface ProveedorDAO {
    public List<DTOProveedor> read();
    public DTOProveedor read(int id);
    public void insert(DTOProveedor item);
    public void update(DTOProveedor item);
    public void delete(DTOProveedor item);
}
