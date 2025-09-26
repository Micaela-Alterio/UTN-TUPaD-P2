package Ejercicio_07_Vehiculo;

public class Motor {
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return ("\nTipo de motor: " + tipo + 
                "\nNumero de serie: " + numeroSerie+"\n");
    }
    
    
}
