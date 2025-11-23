
package Ejercicio_02_Figuras_Geometricas_Y_Metodos_Abstractos;

public class Circulo extends Figura {
    private double radio;
    
    public Circulo (double radio, String nombre){ 
    super(nombre);
    this.radio=radio;
}
    
    @Override
    public double calcularArea() {
        // Utilizamos la constante Math.PI de Java
        return Math.PI * radio * radio; 
    }
}
