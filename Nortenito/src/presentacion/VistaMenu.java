package presentacion;

import InsumoDAO.PlatilloDAO;
import InsumoDAO.PlatilloDAOImplements;
import entidades.EPlatillo;
import java.util.List;
import java.util.Scanner;

public class VistaMenu implements IMostrar{
    
    
    public void mostrar() {
        VistaMesero atenderClientes = new VistaMesero();
        VistaInsumos gestionarInsumos = new VistaInsumos();
        
        int opcion = -1;
        Scanner lector = new Scanner(System.in);
        
        while(opcion != 0){
            
            System.out.println("/* ========== MENU ========== */");
            System.out.println("/*                            */");
            System.out.println("/*    1. Atender clientes     */");
            System.out.println("/*    2. Gestionar insumos    */");
            System.out.println("/*    0. Salir                */");
            System.out.println("/*                            */");
            System.out.println("/* ========================== */");
            
            opcion = lector.nextInt();
            
            if(opcion == 0) return;
            switch(opcion){
                case 1: {
                    
                    atenderClientes.mostrar();
                    
                } break;
                case 2: {
                    
                    gestionarInsumos.mostrar();
                    
                } break;
            }
            
        }
        
    }
    
}
