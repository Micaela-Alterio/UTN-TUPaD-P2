package Ejercicio_02_Excepciones;

import java.util.Scanner;

public class Ejercicio_5_Uso_De_Try_With_Resources {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        //5. Uso de try-with-resources: Leer un archivo con BufferedReader
        //usando try-with-resources. Manejar IOException correctamente.
        System.out.println("\nConsigna 4: Leer un archivo con BufferedReader "
            +"usando try-with-resources.\nManejar IOException correctamente.");
        
         String ruta;
        
        System.out.println("\nIngrese la ruta del archivo: ");
        
        ruta = input.nextLine();

        MetodosExcepciones.leerArchivoTryWithResources(ruta);
       
        
    }
    
}
