/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import dtos.DTOInsumo;
import java.util.List;

/**
 *
 * @author WillingtonOrtiz
 */
public interface InsumoDAO {
    public List<DTOInsumo> read();
    public DTOInsumo read(int id);
    public void insert(DTOInsumo item);
    public void update(DTOInsumo item);
    public void delete(DTOInsumo item);
}
