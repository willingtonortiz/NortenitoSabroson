package entidades;

import java.util.ArrayList;

// Se aplica el patrón Singleton
public class ListaInsumos {
    
    // Patron Singleton
    private static ListaInsumos instancia;
    private ArrayList<Insumo> lista;
    
    private ListaInsumos(){
        lista = new ArrayList<Insumo>();
    }
    
    public static ListaInsumos getInstancia(){
        if(instancia == null){
            instancia = new ListaInsumos();
        }
        return instancia;
    }
    
    public ArrayList<Insumo> getLista(){
        return this.lista;
    }
}
