
package Ejercicio_04_Animales_Y_Comportamiento_Sobrescrito;

public class Gato extends Animal{
    
    public Gato (String nombre, String descripcion){
        
        super(nombre, descripcion);
    }
    
    //Método sobrescrito hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
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