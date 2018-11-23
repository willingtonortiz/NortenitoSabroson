package presentacion;

import daos.InsumoDAO;
import dtos.DTOInsumo;
import factories.DAOFactory;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        DAOFactory fact = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
        
        InsumoDAO dao = fact.getInsumoDAO();        

        List<DTOInsumo> lista = dao.read();
        
        for(int i = 0; i < lista.size(); ++i){
            System.out.println(lista.get(i));
        }
        
    }    
}
