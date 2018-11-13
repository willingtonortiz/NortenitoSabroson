package interfaces;

import java.util.List;

public interface IDAO<Tipo> {
    public List<Tipo> ListAll();
    public Tipo Select(int id);
    public void Update(Tipo item);
    public void Insert(Tipo item);
    public void Delete(int id);
}
