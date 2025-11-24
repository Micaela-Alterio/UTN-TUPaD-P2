
package Ejercicio_02_Excepciones;

import java.util.Scanner;

public class Ejercicio_2_Conversion_De_Cadena_A_Numero {

    public static void main(String[] args) {
     
        Scanner input = new Scanner (System.in);
        
        //2. Conversión de cadena a número: Leer texto del usuario e intentar
        //convertirlo a int. Manejar NumberFormatException si no es válido.
        System.out.println("\nConsigna 2: Leer texto del usuario e intentar "
            +"convertirlo a int.\nManejar NumberFormatException si no es valido.");
        
        String texto;
        
        System.out.print("Ingrese un texto: ");
        texto = input.nextLine();
        
        MetodosExcepciones.conversionCadenaANumero(texto);
        
    }
    
}
