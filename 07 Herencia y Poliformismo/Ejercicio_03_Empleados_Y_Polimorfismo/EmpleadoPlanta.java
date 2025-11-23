
package Ejercicio_03_Empleados_Y_Polimorfismo;

public class EmpleadoPlanta extends Empleado {

    private double horasTrabajadas;
    private double valorPorHora;
    
    public EmpleadoPlanta (double horasTrabajadas, double valorPorHora, String nombre){
        super(nombre);
        this.horasTrabajadas=horasTrabajadas;
        this.valorPorHora=valorPorHora;
    }
    
    @Override
    public double calcularSueldo(){
        return horasTrabajadas * valorPorHora;
    }
    
}