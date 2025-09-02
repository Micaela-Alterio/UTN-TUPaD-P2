package TP3_IntroduccionaPOO;

public class Ejercicio2_RegistroDeMascotas {

    public static void main(String[] args) {
        
        Mascota mascota1 = new Mascota();
        
        mascota1.mostrarDatos();
        
        mascota1.nombre= "Julio";
        mascota1.especie= "Perro, Galgo";
        mascota1.edad= 9;
        
        mascota1.mostrarDatos();
        
        System.out.println("\nDatos actualizados: ");
        mascota1.cumplirAnios(1);
        mascota1.mostrarDatos();
        
    }
    
}
