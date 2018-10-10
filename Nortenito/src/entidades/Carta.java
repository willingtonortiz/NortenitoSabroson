package entidades;

import java.util.ArrayList;

public class Carta {
    
    private static Carta instancia;
    
    private ArrayList<Platillo> lista;

    private Carta() {
        lista = new ArrayList<Platillo>();
    }
    
    public static Carta getInstancia(){
        if(instancia == null){
            instancia = new Carta();
        }
        return instancia;
    }
    
    public ArrayList<Platillo> getLista(){
        return this.lista;
    }
}
