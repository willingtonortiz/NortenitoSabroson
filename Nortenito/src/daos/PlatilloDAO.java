/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.EPlatillo;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface PlatilloDAO {
    public List<EPlatillo> read();
    public EPlatillo read(int id);
    public void insert(EPlatillo item);
    public void update(EPlatillo item);
    public void delete(EPlatillo item);
}
