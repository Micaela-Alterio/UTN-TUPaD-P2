
package TP3_IntroduccionaPOO;

public class Estudiante {
    String nombre, apellido, curso;
    int calificacion;
    
    public void mostrarDatos(){
        System.out.println(nombre+" "+ apellido+" "+ curso+" "+ calificacion);
    }
    
    public void subirCalificacion(int puntos){
        calificacion+=puntos;
    }
    
    public void bajarcalificacion(int puntos){
        calificacion-=puntos;
    }
}
