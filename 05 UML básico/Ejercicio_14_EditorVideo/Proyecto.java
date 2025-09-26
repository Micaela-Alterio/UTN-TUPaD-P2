package Ejercicio_14_EditorVideo;

public class Proyecto {
    private String nombre;
    private int duracion;

    public Proyecto(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return ("\nProyecto:\nNombre: " + nombre + "\nDuracion: " + duracion);
    }
    
    
}
