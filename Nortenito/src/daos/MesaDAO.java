/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.EMesa;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface MesaDAO {
    public List<EMesa> read();
    public EMesa read(int id);
    public void insert(EMesa item);
    public void update(EMesa item);
    public void delete(EMesa item);
}
