package Ejercicio_09_CitaMedica;

public class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return ("\nNombre del profesional: " + nombre + 
                "\nEspecialidad: " + especialidad+"\n");
    }
    
    
}
