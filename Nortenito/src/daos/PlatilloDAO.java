/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.DTOPlatillo;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface PlatilloDAO {
    public List<DTOPlatillo> read();
    public DTOPlatillo read(int id);
    public void insert(DTOPlatillo item);
    public void update(DTOPlatillo item);
    public void delete(DTOPlatillo item);
}
