
package Ejercicio_02_SistemaDeGestionBiblioteca;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Biblioteca {
    private String nombre;
    List<Libro>libros= new ArrayList<>();
    private static int cantidadTotalLibros=0;
    
    //Agrega nuevos Libros a la coleccion
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
    
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }
    
    //Lista los libros existentes
    public void listarLibros(){
        System.out.println("\nListado de libros existentes:");
        for (Libro l: libros){
            l.mostrarInfo();
        }
    }
    
    //Getter lista de libros
    public List<Libro> getLibros() {
        return libros;
    }
    
    //Buscador de libros por ISBN
    public void buscarLibroPorIsbn (String isbn){
        
        boolean encontrado= false;
        
        for (Libro l: libros){
            if (l.getIsbn().equals(isbn)){
                encontrado=true;
                System.out.println("\nEl libro buscado con el ISBN "+isbn+" es: ");
                l.mostrarInfo();
                break;
            }
        }
        if (!encontrado){
            System.out.println(
                "\nNo se ha encontrado ningun libro con el ISBN ingresado.");
        }

    }
    
    //Eliminar un Libro por ISBN
    public void eliminarLibro(String isbn){
        
        boolean encontrado= false;
        
        for (Libro l: libros){
            if (l.getIsbn().equals(isbn)){
                encontrado= true;
                libros.remove(l);
                System.out.println("\nSe ha eliminado el libro con ISBN "+isbn
                    +" con exito.");
                break;
            }    
        }
        if (!encontrado){
            System.out.println(
                "\nNo se han encontrado ningun libro con el ISBN ingresado");
        }
    }
    
    //Obtiene la cantidad total de libros de la biblioteca
    public void obtenerCantidadLibros(){
        cantidadTotalLibros=0;
        for (Libro l: libros){
            
            cantidadTotalLibros++;        
        }
        System.out.println("\nLa cantidad total actual de libros en la "
            +"biblioteca es: "+cantidadTotalLibros);
    }
    
    //Filtra libros por anio de publicacion 
    public void filtrarLibrosPorAnio(int anio){
        boolean encontrado= false;
        System.out.println("\nLos libros publicados en el anio "+anio+" son: ");
        
        for (Libro l: libros){
            if (l.getAnioPublicacion()==anio){
                encontrado=true;
                l.mostrarInfo();
            }
        }
        if (!encontrado){
            System.out.println(
                "\nNo se han encontrado libros publicados ese anio");
        }
        
    }
    
    //Muestra los autores actuales disponibles en la biblioteca
    public void mostrarAutoresDisponibles(){
        System.out.println("\nLos Autores actuales en la biblioteca son: ");
        
        Set<Autor> autores = new HashSet<>();
        for (Libro l: libros){
            
            autores.add(l.getAutor());
        }
        for (Autor a : autores){
            
            a.mostrarInfo();
        }
        
    }
    
    
}
