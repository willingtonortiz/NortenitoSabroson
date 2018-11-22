/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.EInsumo;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface InsumoDAO {
    public List<EInsumo> read();
    public EInsumo read(int id);
    public void insert(EInsumo item);
    public void update(EInsumo item);
    public void delete(EInsumo item);
}
