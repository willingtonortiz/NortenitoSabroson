package InsumoDAO;

import entidades.EPlatillo;
import java.util.List;

public interface PlatilloDAO {
    public List<EPlatillo> ListAll();
    public EPlatillo getId(int id);
    public void Update();
    public void Insert();
    public void Delete();
}
