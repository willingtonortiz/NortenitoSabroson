package Factory;

import Interfaces.IConexion;

public class ConexionVacia implements IConexion{

    public ConexionVacia() { }

    @Override
    public void conectar() {
        System.out.println("No se especificó proveedor");
    }

    @Override
    public void desconectar() {
        System.out.println("No se especificó proveedor");
    }    
}
