
package Ejercicio_02_Excepciones;

import java.util.Scanner;

public class Ejercicio_1_Division_Segura {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        //1. División segura :Solicitar dos números y dividirlos.
        //Manejar ArithmeticException si el divisor es cero.
        System.out.println("Consigna 1: Solicitar dos numeros y dividirlos "
                + "\nManejar ArithmeticException si el divisor es cero.");
                
        int a,b;

        System.out.println("\n\nIngrese un numero:");
        a=Integer.parseInt(input.nextLine());
        System.out.println("\nIngrese otro numero:");
        b=Integer.parseInt(input.nextLine());
        
        MetodosExcepciones.divisionSegura(a,b);
        

    }
    
}
