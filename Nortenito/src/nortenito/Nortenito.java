package nortenito;

import clases.CInsumo;
import clases.CListaInsumos;


public class Nortenito {

    public static void main(String[] args) {
        CListaInsumos lista = CListaInsumos.getInstancia();
        CInsumo ins1 = new CInsumo(1, "Papa", 10, 12.5);
        CInsumo ins2 = new CInsumo(2, "Tomate", 20, 10.5);
        
        lista.getLista().add(ins1);
        lista.getLista().add(ins2);
        
        lista.getLista().forEach((item) -> {
            System.out.println(item);
        });
        
        
    }
    
}
