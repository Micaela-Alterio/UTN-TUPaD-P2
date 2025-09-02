package TP3_IntroduccionaPOO;

public class Mascota {
    
    String nombre, especie;
    int edad;

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nEspecie: "+especie+"\nEdad: "
                + edad);
    }
    
    public void cumplirAnios(int anios){
        edad+=anios;
    }
}
