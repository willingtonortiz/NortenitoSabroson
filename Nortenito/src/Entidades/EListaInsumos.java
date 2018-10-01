package Entidades;

import java.util.ArrayList;

// Se aplica el patrón Singleton
public class EListaInsumos {
    
    // Patron Singleton
    private static EListaInsumos instancia;
    private ArrayList<EInsumo> lista;
    
    private EListaInsumos(){
        lista = new ArrayList<EInsumo>();
    }
    
    public static EListaInsumos getInstancia(){
        if(instancia == null){
            instancia = new EListaInsumos();
        }
        return instancia;
    }
    
    public ArrayList<EInsumo> getLista(){
        return this.lista;
    }
}
