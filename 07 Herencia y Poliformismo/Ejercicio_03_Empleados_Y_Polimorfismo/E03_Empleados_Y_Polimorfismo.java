
package Ejercicio_03_Empleados_Y_Polimorfismo;

import java.util.ArrayList;

public class E03_Empleados_Y_Polimorfismo {

    public static void main(String[] args) {
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta(170,14500,"Martin Diaz"));
        empleados.add(new EmpleadoPlanta(130,20000,"Julian Bueno"));
        empleados.add(new EmpleadoPlanta(190,10500,"Florencia Robles"));
        empleados.add(new EmpleadoPlanta(100,25000,"Sol Rodriguez"));
        empleados.add(new EmpleadoTemporal(90,8000,"Lautaro Silva"));
        empleados.add(new EmpleadoTemporal(75,8000,"Diego Perez"));
        empleados.add(new EmpleadoTemporal(100,8000,"Monica Cruz"));
        empleados.add(new EmpleadoTemporal(50,8000,"Julieta Vera"));

        Empleado.mostrarClasificacion(empleados);
        
        
    }
    
}
