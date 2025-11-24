
package Ejercicio_02_Excepciones;

import java.io.File;   
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MetodosExcepciones {

    //Metodo divisionSegura
    public static void divisionSegura(int a, int b) {
        try {
            
             int resultadoEntero = a / b; // Para atrapar división por cero
            double resultado = (double) a / b; // Para calcular con decimales

            // Si el resultado es entero, lo mostramos como int; si no, como double
            if (resultado == (int) resultado) {
                System.out.println("Resultado: " + (int) resultado);
            } else {
                System.out.println("Resultado: " + resultado);
            }
            
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }
    }
    
    //Metodo conversionCadenaANumero
    public static void conversionCadenaANumero(String texto){
        try {
            
            int numero = Integer.parseInt(texto);
            System.out.println("Numero: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: la cadena no es un numero valido.");
        }
    }
    
    //Metodo leerArchivo
    public static void leerArchivo(String ruta) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(ruta));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
    
    //Metodo validarEdad
    public static void validarEdad(int edad) throws EdadInvalidaException {
        
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad invalida: " + edad);
        }
        System.out.println("Edad valida: " + edad);
    }
    
    //Metodo leerArchivoTryWithResources
    public static void leerArchivoTryWithResources(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}