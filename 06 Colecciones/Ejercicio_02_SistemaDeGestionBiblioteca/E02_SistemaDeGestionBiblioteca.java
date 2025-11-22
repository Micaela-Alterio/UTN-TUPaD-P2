
package Ejercicio_02_SistemaDeGestionBiblioteca;

public class E02_SistemaDeGestionBiblioteca {

    public static void main(String[] args) {
        
        //Tareas a realizar:
        
        //1. Creamos una biblioteca.
        System.out.println("Consigna 1: Crear una biblioteca.");
        
        //Creacion de la biblioteca
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("\nSe ha creado la biblioteca correctamente.");

        //2. Crear al menos tres autores
        System.out.println("\nConsigna 2: Crear al menos tres autores.");
        
        //Creacion del Autor 1.
        Autor autor1 = new Autor ("001","Julio Cortazar","Argentina");
        
        //Creacion del Autor 2.
        Autor autor2 = new Autor ("002","Edgar Allan Poe","Estadounidense");
        
        //Creacion del Autor 3.
        Autor autor3 = new Autor ("003","H.P.Lovecraft","Estadounidense");
        
        //Creacion del Autor 4.
        Autor autor4 = new Autor ("004","Robert Louis Stevenson","Britanica");
        
        //Creacion del Autor 5.
        Autor autor5 = new Autor ("005","Clark Ashton Smith","Estadounidense");
        
        //Creacion del Autor 6.
        Autor autor6 = new Autor ("006","Algernon Blackwood","Britanica");
        
        System.out.println("\nSe han creado los autores correctamente.");
        
        //3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        System.out.println("\nConsigna 3: Agregar 5 libros asociados a alguno de"
            +" los Autores a la biblioteca.");

        //Agregacion del Libro 1.
        biblioteca.agregarLibro("9788412071887","El corazon delator", 1843, autor2);
        
        //Agregacion del Libro 2.
        biblioteca.agregarLibro("9781544125893","La caida de la casa Usher", 1839, autor2);
        
        //Agregacion del Libro 3.
        biblioteca.agregarLibro("9781519241436","El pozo y el pendulo", 1842, autor2);
        
        //Agregacion del Libro 4.
        biblioteca.agregarLibro("9781475003314","Los crimenes de la calle Morgue", 1841, autor2);
        
        //Agregacion del Libro 5.
        biblioteca.agregarLibro("9781849311373","Relatos grotescos y arabescos", 1840, autor2);
        
        System.out.println("\nSe han asignado 5 libros al Autor Edgar Allan Poe.");
        
        //4. Listar todos los libros con su información y la del autor.
        System.out.println("\nConsigna 4: Listar todos los libros con su"
            +" informacion y la del autor.");
        
        biblioteca.listarLibros();
        
        //5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("\nConsigna 5: Buscar un libro por su ISBN y mostrar"
            + " su informacion.");

        biblioteca.buscarLibroPorIsbn("9781519241436");
        
        //6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("\nConsigna 6: Filtrar y mostrar los libros "
            + "publicados en un anio especifico.");
        
        biblioteca.filtrarLibrosPorAnio(1839);
        
        //7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("\nConsigna 7: Eliminar un libro por su ISBN y listar"
            +" los libros restantes.");
        
        biblioteca.eliminarLibro("9781849311373");
        biblioteca.listarLibros();
        
        //8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("\nConsigna 8: Mostrar la cantidad total de libros"
            +" en la biblioteca.");
        
        biblioteca.obtenerCantidadLibros();
        
        //9. Listar todos los autores de los libros disponibles en la biblioteca.
        System.out.println("\nConsigna 9: Listar todos los autores de los libros"
            +" disponibles en la biblioteca.");
        
        biblioteca.mostrarAutoresDisponibles();
        
        //Extra muestro todos los autores creados figuren o no en la biblioteca
        System.out.println("\nComo extra se muestran todos los autores que han "
                + "sido creados, figuren o no en la biblioteca");
        Autor.mostrarTodosLosAutores();
        
        
        //Conclusiones esperadas
        //Comprender la composición 1 a N entre Biblioteca y Libro.
        //Reforzar el manejo de colecciones dinámicas (ArrayList).
        //Practicar el uso de métodos de búsqueda, filtrado y eliminación.
        //Mejorar la modularidad a
    }
    
}
