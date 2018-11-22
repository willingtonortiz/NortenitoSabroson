/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.DTOMesero;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface MeseroDAO {
    public List<DTOMesero> read();
    public DTOMesero read(int id);
    public void insert(DTOMesero item);
    public void update(DTOMesero item);
    public void delete(DTOMesero item);
}
