
package Ejercicio_04_Animales_Y_Comportamiento_Sobrescrito;

public class Vaca extends Animal{
    
    public Vaca (String nombre, String descripcion){
        super(nombre, descripcion);
    }
    
    //Método sobrescrito hacerSonido()
    @Override
    public void hacerSonido() {
        System.out.println("Muuu!");
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