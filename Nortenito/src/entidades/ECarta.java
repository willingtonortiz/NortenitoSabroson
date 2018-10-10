package entidades;

import java.util.ArrayList;

public class ECarta {
    
    private static ECarta instancia;
    
    private ArrayList<EPlatillo> lista;

    private ECarta() {
        lista = new ArrayList<EPlatillo>();
    }
    
    public static ECarta getInstancia(){
        if(instancia == null){
            instancia = new ECarta();
        }
        return instancia;
    }
    
    public ArrayList<EPlatillo> getLista(){
        return this.lista;
    }
}
