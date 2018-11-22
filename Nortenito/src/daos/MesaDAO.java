/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.DTOMesa;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface MesaDAO {
    public List<DTOMesa> read();
    public DTOMesa read(int id);
    public void insert(DTOMesa item);
    public void update(DTOMesa item);
    public void delete(DTOMesa item);
}
