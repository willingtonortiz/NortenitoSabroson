package clases;

import java.util.ArrayList;

public class CCarta {
    
    private static CCarta instancia;
    
    private ArrayList<CPlatillo> lista;

    private CCarta() {
        lista = new ArrayList<CPlatillo>();
    }
    
    public static CCarta getInstancia(){
        if(instancia == null){
            instancia = new CCarta();
        }
        return instancia;
    }
    
    public ArrayList<CPlatillo> getLista(){
        return this.lista;
    }
}
