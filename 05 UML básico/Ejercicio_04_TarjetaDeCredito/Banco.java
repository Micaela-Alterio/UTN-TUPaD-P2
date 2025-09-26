package Ejercicio_04_TarjetaDeCredito;

public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return ("\nBanco: "+ nombre + "\nCuit del banco: " 
                + cuit+"\n");
    }
    
    
}
