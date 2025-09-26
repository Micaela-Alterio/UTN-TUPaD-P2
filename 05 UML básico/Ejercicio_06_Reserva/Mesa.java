package Ejercicio_06_Reserva;

public class Mesa {
    private String numero;
    private String capacidad;

    public Mesa(String numero, String capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return ("\nNumero de mesa reservada: " + numero + 
                "\nCapacidad: " + capacidad+"\n");
    }
    
    
}
