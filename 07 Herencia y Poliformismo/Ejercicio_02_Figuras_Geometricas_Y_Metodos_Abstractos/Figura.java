
package Ejercicio_02_Figuras_Geometricas_Y_Metodos_Abstractos;

import java.util.ArrayList;

public abstract class Figura {
    
    private String nombre;
    
    //Constructor
    public Figura (String nombre){
        this.nombre=nombre;
    }
    
    //Metodo para calcular el area
    public abstract double calcularArea();
    
    // Método para mostrar todas las figuras
    public static void mostrarFiguras(ArrayList<Figura> figuras) {
        for (Figura f : figuras) {
            System.out.println(f);
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s \nArea: %.2f\n",this.nombre, this.calcularArea());
    }
    
    //return "Figura: " + nombre;
}

