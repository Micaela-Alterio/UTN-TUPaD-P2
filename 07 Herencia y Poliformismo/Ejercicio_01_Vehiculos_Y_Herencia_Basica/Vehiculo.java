
package Ejercicio_01_Vehiculos_Y_Herencia_Basica;

public class Vehiculo {
    private String marca;
    private String modelo;
    
    //Constructor
    public Vehiculo(String marca,String modelo){
        
        this.marca=marca;
        this.modelo=modelo;
    }
    //Metodo para imprimir la informacion
    public void mostrarInfo(){
        
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return  "Marca: "+marca+
                "\nModelo: " + modelo;
    }
    
}
