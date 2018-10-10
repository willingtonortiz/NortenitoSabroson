package vista;

import dao.PlatilloDAO;
import dao.PlatilloDAOImplements;
import entidades.Platillo;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        PlatilloDAO platillo = new PlatilloDAOImplements("mysql");
        
        List<Platillo> items =  platillo.ListAll();
        
        System.out.println("Mostrando platillos");
        
        items.forEach(item -> {
            System.out.println(item);
        });
        
    }    
}
