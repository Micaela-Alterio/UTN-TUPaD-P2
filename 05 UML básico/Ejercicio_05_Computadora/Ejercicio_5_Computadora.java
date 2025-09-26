package Ejercicio_05_Computadora;

public class Ejercicio_5_Computadora {

    public static void main(String[] args) {
        
        Propietario propietario = new Propietario ("Oriel Martins", "30763497");
        Computadora computadora = new Computadora("Dell","5939g9276s96", 
                "Micro-ATX", "Z790");
        
        computadora.setPropietario(propietario);
        
        computadora.mostrarComputadora();
    }
    
}
