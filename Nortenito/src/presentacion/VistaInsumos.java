package presentacion;

import InsumoDAO.PlatilloDAO;
import InsumoDAO.PlatilloDAOImplements;
import entidades.EPlatillo;
import java.util.List;
import java.util.Scanner;

public class VistaInsumos implements IMostrar{

    @Override
    public void mostrar() {
        
        int opcion = -1;
        Scanner lector = new Scanner(System.in);
        
        while(opcion != 0){
            
            for(int i = 0; i < 1; ++i) System.out.println("\n");
            
            System.out.println("/* ======== GESTIONAR INSUMOS ======== */");
            System.out.println("/*   1. Atender pedido      */");
            System.out.println("/*   2. Gestionar insumos */");
            System.out.println("/*   0. Regresar          */");
            System.out.println("/* ====================== */");
            
            opcion = lector.nextInt();
            
            if(opcion == 0) return;
            switch(opcion){
                case 1: {
                    
                    System.out.println("Ingrese platillos ");
                    
                } break;
                case 2: {
                    
                    PlatilloDAO platillo = new PlatilloDAOImplements("mysql");
        
                    List<EPlatillo> items =  platillo.ListAll();
        
                    System.out.println("Mostrando platillos");
        
                    items.forEach(item -> { System.out.println(item); });
                    
                    opcion = lector.nextInt();
                    
                } break;
            }
            
        }
        
    }    
    
}
