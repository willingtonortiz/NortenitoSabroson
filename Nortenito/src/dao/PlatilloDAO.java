package dao;

import entidades.Platillo;
import java.util.List;

public interface PlatilloDAO {
    public List<Platillo> ListAll();
    public Platillo getId(int id);
    public void Update();
    public void Insert();
    public void Delete();
}
