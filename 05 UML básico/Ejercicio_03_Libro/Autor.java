package Ejercicio_03_Libro;

public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return ("\nAutor: "+ nombre +"\nNacionalidad del autor: "+ 
                nacionalidad+"\n");
    }
    
    
}
