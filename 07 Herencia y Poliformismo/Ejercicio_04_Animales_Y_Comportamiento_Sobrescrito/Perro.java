
package Ejercicio_04_Animales_Y_Comportamiento_Sobrescrito;

public class Perro extends Animal{
    
    public Perro (String nombre, String descripcion){
        super(nombre, descripcion);
    }
    
   //Método sobrescrito hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }
    
     @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public void describirAnimal(){
        
        System.out.println("\nAnimal: "+this.getClass().getSimpleName());
        System.out.println(this.toString()); 
    }
}