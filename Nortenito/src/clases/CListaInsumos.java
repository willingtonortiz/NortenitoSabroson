package clases;

import java.util.ArrayList;

// Se aplica el patrón Singleton
public class CListaInsumos {
    
    // Patron Singleton
    private static CListaInsumos instancia;
    private ArrayList<CInsumo> lista;
    
    private CListaInsumos(){
        lista = new ArrayList<CInsumo>();
    }
    
    public static CListaInsumos getInstancia(){
        if(instancia == null){
            instancia = new CListaInsumos();
        }
        return instancia;
    }
    
    public ArrayList<CInsumo> getLista(){
        return this.lista;
    }
}
