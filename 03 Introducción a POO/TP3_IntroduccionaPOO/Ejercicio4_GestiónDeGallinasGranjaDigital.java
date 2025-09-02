package TP3_IntroduccionaPOO;

public class Ejercicio4_GestiónDeGallinasGranjaDigital {

  public static void main(String[] args) {
        
    Gallina gallina1= new Gallina();
    Gallina gallina2= new Gallina();
    
    gallina1.setIdGallina(1234);
    gallina1.setEdad(1);
    gallina1.setHuevosPuestos(10);
    gallina1.mostrarDatos();
    
    gallina2.setIdGallina(4321);
    gallina2.setEdad(2);
    gallina2.setHuevosPuestos(12);
    gallina2.mostrarDatos();
    
    //Registramos el crecimiento y la produccion
    
    System.out.println("\nDatos actualizados: ");
            
    gallina1.setCrecimiento(1);
    gallina1.setNuevosHuevos(34);
    gallina1.mostrarDatos();
    
    gallina2.setCrecimiento(1);
    gallina2.setNuevosHuevos(43);
    gallina2.mostrarDatos();
    }
    
}
