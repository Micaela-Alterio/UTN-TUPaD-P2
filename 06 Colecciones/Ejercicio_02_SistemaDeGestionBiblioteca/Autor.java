
package Ejercicio_02_SistemaDeGestionBiblioteca;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    //Extra para mostrar todos los autores creados, esten o no en la biblioteca.
    private static List<Autor> autores = new ArrayList<>();
    
    //Constructor para crear un nuevo Autor
    public Autor(String id, String nombre, String nacionalidad){
    
        this.id=id;
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
        
        //Agrega los autores creados a la lista general.
        autores.add(this);
    }
    
    //Metodo para mostrar la informacion de los autores
    public void mostrarInfo(){
        System.out.println(this.toString());
    }
    
    //Metodo extra para mostrar todos los autores creados
    public static void mostrarTodosLosAutores() {
        System.out.println("\nTodos los autores creados:");
        for (Autor a : autores) {
            a.mostrarInfo();
        }
    }
    
    @Override
    public String toString() {
        return "\nAutor: "+nombre+
               "\nNacionalidad: "+nacionalidad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        return Objects.equals(this.id, other.id);
    }
    
    
    
    
    
    
}
