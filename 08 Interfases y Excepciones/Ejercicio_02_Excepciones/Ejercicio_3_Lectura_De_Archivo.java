
package Ejercicio_02_Excepciones;

import java.util.Scanner;
import java.io.FileNotFoundException; 


public class Ejercicio_3_Lectura_De_Archivo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        //3. Lectura de archivo: Leer un archivo de texto y mostrarlo.
        //Manejar FileNotFoundException si el archivo no existe.
        System.out.println("\nConsigna 3: Leer un archivo de texto y mostrarlo."
            +"\nManejar FileNotFoundException si el archivo no existe.");
        
        String ruta;
        
        System.out.println("\nIngrese la ruta del archivo: ");
        
        ruta = input.nextLine();

        try {
            MetodosExcepciones.leerArchivo(ruta);
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado. " + e.getMessage());
        }
        
    }
    
}
