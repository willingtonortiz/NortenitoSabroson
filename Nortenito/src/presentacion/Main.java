package presentacion;

import daos.ClienteDAO;
import dtos.DTOCliente;
import factories.DAOFactory;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DAOFactory fact = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        
        ClienteDAO dao = fact.getClienteDAO();
        
        //dao.insert(new ECliente(0,"Juan", "Ortiz", "asdasd", 78964132));
        //dao.update(new ECliente(2,"Andrea", "Ortiz", "Chorrillos", 991223344));
        //dao.delete(new ECliente(3,"Andrea", "Ortiz", "Surco", 991223344));
        
        List<DTOCliente> items = dao.read();
        
        for(int i = 0; i < items.size(); ++i){
            System.out.println(items.get(i));
        }
    }    
}
