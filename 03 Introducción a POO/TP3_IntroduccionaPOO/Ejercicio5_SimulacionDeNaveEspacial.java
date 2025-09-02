package TP3_IntroduccionaPOO;

public class Ejercicio5_SimulacionDeNaveEspacial {

   public static void main(String[] args) {
       
        NaveEspacial nave1 = new NaveEspacial();
        
        nave1.setIdNave("Apolo");
        nave1.setCantCombustible(50);
        nave1.mostrarEstado();
        
        nave1.despegue();
        nave1.mostrarEstado();
        
        nave1.avanzar();
        nave1.recargarCombustible(150);
        nave1.avanzar();
        nave1.avanzar();
        nave1.avanzar();
        nave1.avanzar();
        nave1.recargarCombustible(350);
        nave1.avanzar();
        nave1.avanzar();
        nave1.avanzar();
        nave1.mostrarEstado();
   }
    
}
