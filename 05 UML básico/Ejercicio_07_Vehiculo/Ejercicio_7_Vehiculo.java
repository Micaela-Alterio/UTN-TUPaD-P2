package Ejercicio_07_Vehiculo;

public class Ejercicio_7_Vehiculo {

    public static void main(String[] args) {
        
        Conductor conductor = new Conductor("Rodrigo Buron", "M75927472l");
        Vehiculo vehiculo = new Vehiculo ("AG8547LU","Toyota Ethios",
                new Motor("Gasolina","37789dh45"));
        
        vehiculo.setConductor(conductor);
        
        vehiculo.mostrarVehiculo();
        
    }
    
}
