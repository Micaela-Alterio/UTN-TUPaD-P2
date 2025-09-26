package Ejercicio_03_Libro;

public class Editorial {
    private String nombre;
    private String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return ("\nEditorial: "+ nombre + "\nDireccion de la editorial: " + 
                direccion);
    }
    
    
}
