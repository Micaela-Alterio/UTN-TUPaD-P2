package tp4_poo;

public class TP4_POO {

    public static void main(String[] args) {
        
        System.out.println("Empleados por parametro: ");
        
        Empleado emp1 = new Empleado(22,"Diego Diaz","CEO",20000);
        Empleado emp2 = new Empleado(23,"Nicolas Valiero","Team Lider",6000);
        
        System.out.println("\n" + emp1);
        System.out.println(emp2);
        
        System.out.println("\nEmpleados que asigna id automatico y salario por defecto: ");
        Empleado emp3 = new Empleado("Anouki Capri","Project Manager");
        Empleado emp4 = new Empleado("Diego Nicolas Bueno","Product Owner");
        
        
        System.out.println("\n" + emp3);
        System.out.println(emp4);
        
        System.out.println("\nActualizacion de salarios por monto fijo: ");
        emp1.actualizarSalario(5000.0);
        emp2.actualizarSalario(4000.0);
        System.out.println("\n" + emp1);
        System.out.println(emp2);
        
        System.out.println("\nActualizacion de salarios por procentaje: ");
        emp3.actualizarSalario(125);
        emp4.actualizarSalario(200);
        
        System.out.println("\n" + emp3);
        System.out.println(emp4);
        
        
        System.out.println("\nEl total de empleados registrados es: " + 
                Empleado.mostrarTotalEmpleados());
        
    }
    
}
