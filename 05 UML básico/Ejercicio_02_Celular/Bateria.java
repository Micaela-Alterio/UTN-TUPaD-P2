package Ejercicio_02_Celular;

public class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return ("\nModelo de la bateria: "+ modelo + "\nCapacidad de la "
                + "bateria:" + capacidad+"\n");
    }
    
    
}
