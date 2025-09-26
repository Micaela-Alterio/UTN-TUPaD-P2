package Ejercicio_12_Impuesto;

public class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return ("\nContribuyente:\nNombre: " + nombre + "\nCuil: " + cuil+"\n");
    }
    
    
}
