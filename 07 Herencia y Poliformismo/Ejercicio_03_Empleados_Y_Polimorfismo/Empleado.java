
package Ejercicio_03_Empleados_Y_Polimorfismo;

import java.util.ArrayList;

public abstract class Empleado {
    
    private String nombre;
    
    //Constructor
    public Empleado (String nombre){
        this.nombre=nombre;
    }
    
    //Metodo para calcular el sueldo
    public abstract double calcularSueldo();
    
    //Metodo para clasificar empleados
    //Recibe la lista de empleados y la recorre
    //Usa instance of para clasificar
    //Utiliza toString() para imprimir los datos por consola 
    
    public static void mostrarClasificacion(ArrayList<Empleado> empleados) {
        for (Empleado e : empleados) {
            System.out.println(e.toString()); 

            if(e instanceof EmpleadoPlanta) {
                System.out.println("Tipo de contrato: Planta\n");
            }else if(e instanceof EmpleadoTemporal){
                System.out.println("Tipo de contrato: Temporal\n");
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%s \nSueldo: %.2f","\nEmpleado: "
            +this.nombre, this.calcularSueldo());
    }
    
}