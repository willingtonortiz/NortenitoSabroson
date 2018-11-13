package presentacion;

import InsumoDAO.PlatilloDAO;
import InsumoDAO.PlatilloDAOImplements;
import entidades.EPlatillo;
import java.util.List;
import java.util.Scanner;

public class VistaMesero implements IMostrar{

    @Override
    public void mostrar() {
        
        int opcion = -1;
        Scanner lector = new Scanner(System.in);
        
        while(opcion != 0){
            
            System.out.println("/* ======== ATENDER CLIENTES ======== */");
            System.out.println("/*                                    */");
            System.out.println("/*        1. Mostrar platillos        */");
            System.out.println("/*        2. Atender cliente          */");
            System.out.println("/*        0. Regresar                 */");
            System.out.println("/*                                    */");
            System.out.println("/* ================================== */");
            
            opcion = lector.nextInt();
            
            if(opcion == 0) return;
            switch(opcion){
                case 1: {
                    
                    PlatilloDAO platillo = new PlatilloDAOImplements("mysql");
        
                    List<EPlatillo> items =  platillo.ListAll();
        
                    System.out.println("Mostrando platillos");
        
                    items.forEach(item -> { System.out.println(item); });
                    
                    opcion = lector.nextInt();

                    
                } break;
                case 2: {
                    
                    
                    
                } break;
            }
            
        }
        
    }    
    
}
