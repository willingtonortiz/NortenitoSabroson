/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.EMesero;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface MeseroDAO {
    public List<EMesero> read();
    public EMesero read(int id);
    public void insert(EMesero item);
    public void update(EMesero item);
    public void delete(EMesero item);
}
