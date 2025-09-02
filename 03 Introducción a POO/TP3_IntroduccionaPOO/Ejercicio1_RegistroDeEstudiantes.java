
package TP3_IntroduccionaPOO;

public class Ejercicio1_RegistroDeEstudiantes {

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.mostrarDatos();
        
        estudiante1.nombre= "Miccaela";
        estudiante1.apellido= "Alterio";
        estudiante1.curso= "Programacion";
        estudiante1.calificacion= 9;
        estudiante1.mostrarDatos();
        
        System.out.println("\nDatos actualizados: ");
        estudiante1.subirCalificacion(3);
        estudiante1.mostrarDatos();
        
        System.out.println("\nDatos actualizados: ");
        estudiante1.bajarcalificacion(5);
        estudiante1.mostrarDatos();
    }
    
}
