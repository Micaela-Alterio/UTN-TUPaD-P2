
package Ejercicio_01_Vehiculos_Y_Herencia_Basica;

public class Auto extends Vehiculo {
    
    private int cantidadPuertas;
    
    //Constructor
    public Auto (String marca, String modelo, int cantidadPuertas){
        super(marca,modelo);
        this.cantidadPuertas=cantidadPuertas;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCantidad de puertas: " + cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        //Investigue como hacer para que lea el nombre de la subclase para que
        //en caso de crear otras sublases el metodo nombre el tipo de vehiculo
        System.out.println("Vehiculo: "+this.getClass().getSimpleName());
        System.out.println(this.toString()); 
    }
    
    
}
    
    

