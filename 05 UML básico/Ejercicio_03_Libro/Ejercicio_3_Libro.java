package Ejercicio_03_Libro;

public class Ejercicio_3_Libro {

    public static void main(String[] args) {
        
        Autor autor = new Autor("Edgar Allan Poe", "Estadounidense");
        Libro libro = new Libro ("Cuentos de imaginacion y misterio", 
                "9788492412143", new Editorial("Libros del zorro rojo", 
                        "Pallars 85, Barcelona, Espania"));
        
        libro.setAutor(autor);
        libro.mostrarLibro();
    }
    
}
