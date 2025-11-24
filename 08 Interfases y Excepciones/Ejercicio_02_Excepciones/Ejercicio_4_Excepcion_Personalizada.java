
package Ejercicio_02_Excepciones;

import java.util.Scanner;

public class Ejercicio_4_Excepcion_Personalizada {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        //4. Excepción personalizada: Crear EdadInvalidaException. Lanzarla si
        //la edad es menor a 0 o mayor a 120. Capturarla y mostrar mensaje.
        System.out.println("\nConsigna 4: Crear EdadInvalidaException.\nLanzarla"
            +" si la edad es menor a 0 o mayor a 120.\nCapturarla y mostrar mensaje.");
        
        int edad;
        
        System.out.println("\nIngrese su edad:");
        
        try {
            edad = Integer.parseInt(input.nextLine());
            MetodosExcepciones.validarEdad(edad);  
        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar un numero valido.");
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
