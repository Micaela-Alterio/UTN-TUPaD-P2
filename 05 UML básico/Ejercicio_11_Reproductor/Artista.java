package Ejercicio_11_Reproductor;

public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    
    
    @Override
    public String toString() {
        return ("\nArtista: " + nombre + "\nGenero: " + genero);
    }
    
    
}
