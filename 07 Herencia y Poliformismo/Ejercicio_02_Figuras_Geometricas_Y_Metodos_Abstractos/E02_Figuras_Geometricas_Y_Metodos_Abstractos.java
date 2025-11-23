
package Ejercicio_02_Figuras_Geometricas_Y_Metodos_Abstractos;

import java.util.ArrayList;

public class E02_Figuras_Geometricas_Y_Metodos_Abstractos {

    public static void main(String[] args) {
        
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Circulo(20, "Circulo 1"));
        figuras.add(new Rectangulo(5, 15, "Rectangulo 1"));
        figuras.add(new Circulo(35, "Circulo 2"));
        figuras.add(new Rectangulo(87, 41, "Rectangulo 2"));
        
        Figura.mostrarFiguras(figuras);
        
    }
    
}
