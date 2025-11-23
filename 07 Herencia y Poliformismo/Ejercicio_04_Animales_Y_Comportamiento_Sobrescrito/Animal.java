
package Ejercicio_04_Animales_Y_Comportamiento_Sobrescrito;

import java.util.ArrayList;

public abstract class Animal {
 
    private String nombre;
    private String descripcion;
    
    //Constructor
    public Animal (String nombre, String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    
    //Método hacerSonido()
    public abstract void hacerSonido();
    
    //Metodo describirAnimal() 
    public void describirAnimal() {
        System.out.println(this.toString());
    }
    
    //Metodo para mostrar los sonidos con poliformismo
    //Recibe la lista de animales y la recorre
    //Llama a describirAnimal para imprimir los datos por consola 
    public static void mostrarSonidos(ArrayList<Animal> animales) {
        for (Animal a : animales) {
            System.out.println("Sonido: ");
            a.hacerSonido();
            a.describirAnimal();
        }
    }
    
    @Override
    public String toString() {
        return  "Nombre: "+nombre+
                "\nDescripcion: "+ descripcion+"\n";
    }
     
}