package TP3_IntroduccionaPOO;

public class Ejercicio3_EncapsulamientoConClaseLibro {

    public static void main(String[] args) {
        
        Libro libro1= new Libro();
        
        libro1.setTitulo("100 anios de soledad");
        libro1.setAutor("Gabriel Garcia Marquez");
        libro1.setAnioPublicacion(1867);
        
        System.out.println("Titulo del libro: "+libro1.getTitulo());
        System.out.println("Autor del libro: "+libro1.getAutor());
        System.out.println("Anio de publicacion del libro: "
                +libro1.getAnioPublicacion());
        
        libro1.setAnioPublicacion(967);
        System.out.println("Anio de publicacion del libro: "
                +libro1.getAnioPublicacion());
        
        System.out.println("\nDatos actualizados: ");
        libro1.setAnioPublicacion(1967);
        
        System.out.println("Titulo del libro: "+libro1.getTitulo());
        System.out.println("Autor del libro: "+libro1.getAutor());
        System.out.println("Anio de publicacion del libro: "
                +libro1.getAnioPublicacion());
    }
    
}
