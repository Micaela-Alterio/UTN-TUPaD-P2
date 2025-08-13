package javaapplicationtrabajopractico1;

import java.util.Scanner;

//Ejercicio 2;///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class HolaMundo {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio 2:\n");
        //Crea una clase llamada HolaMundo y escribe un programa
        //que imprima el mensaje hola, Java!;
        
        System.out.println("Hola Java!\n");
        
        //Ejercicio3;////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Ejercicio 3:\n");
        //Crea un programa que declare las siguientes variables con valores asignados:
        //a. String nombre b. int edad c. double altura d. boolean estudiante.
        //Imprime los valores en pantalla usando System.out.println();
        
        String nombre;
        int edad;
        double altura;
        boolean estudiante;
        
        nombre="Micaela";
        edad=36;
        altura=1.67;
        estudiante=true;

        System.out.println(nombre+"\n"+edad+"\n"+altura+"\n"+estudiante+"\n");
        
        /////Ejercicio 4:////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Ejercicio 4:\n");
        //Escribe un programa que solicite al usuario ingresar su nombre y edad,
        //y luego los muestre en pantalla. Usa Scanner para capturar los datos.
        
        Scanner input = new Scanner (System.in);

        String nombre2;
        int edad2;
        
        System.out.print("Ingrese su nombre: ");
        nombre2 = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Su nombre es " +nombre2+" y su edad es "+edad2+"\n");
        
        /////Ejercicio 5:////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Ejercicio 5:\n");
        //Escribe un programa que solicite dos numeros enteros
        //y realice las siguientes operaciones:
        //a. Suma b. Resta c. Multiplicacion d. Division
        //Muestra los resultados en la consola.
        
        int a,b,suma,resta,multi;
        double div;
        
        System.out.print("Ingrese un numero: ");
        a = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese otro numero: ");
        b = Integer.parseInt(input.nextLine());
        
        suma=a+b;
        resta=a-b;
        multi=a*b;
        div=(double)a/(double)b;
        
        System.out.println("\nEl resultado de sumar " +a+" mas "+b+" es: "+suma+"\n"
        +"El resultado de restar " +a+" menos "+b+" es: "+resta+"\n"+
        "El resultado de multiplicar " +a+" por "+b+" es: "+multi+"\n"+
        "El resultado de dividir " +a+" por "+b+" es: "+div+"\n");
        
        /////Ejercicio 6:////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Ejercicio 6:\n");
        //Escribe un programa que muestre el siguiente mensaje en consola:
        //"Nombre: Juan Perez. Edad: 30 anios. Direccion:Calle Falsa 123
        //Usa caracteres de escape (\n,\") en System.out.println()
        
        System.out.println("Nombre: Juan Perez\n"+"Edad: 30 anios\n"+
        "Direccion: Calle Falsa 123\n");
        
        /////Ejercicio 8:////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Ejercicio 8:\n");
        //Escribe un programa que divida dos numeros enteros ingresados por el usuario.
        //Modifica el codigo para usar double en lugar de int y compara los resultados.
        
        int c,d;
        double divi;
        
        System.out.print("Ingrese un numero entero: ");
        c = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese otro numero entero: ");
        d = Integer.parseInt(input.nextLine());
        
        divi=c/d;
        System.out.println("\nResultado de division con variables integer: " + divi);
        
        divi =(double)c/(double)d;
        System.out.println("Resultado de division aplicando la funcion double: " + divi+"\n");
        
        //Ejercicio 9////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("Ejercicio 9:\n");
        //Corrige el siguiente codigo para que funcione correctamente.
        //Explica que error tenia y como lo solucionaste.
        
        System.out.print("Ingresa tu nombre: ");
        
        //String nombre = scanner.nextInt(); //ERROR
        
        //El error es que se esta tratando de asignar un valor
        //del tipo "integer" a la variable "nombre"
        //que es del tipo "string".
        
        //Basta con cambiar "int.nextInt()" a "int.nextLine()"
        //para que almacene el valor otorgado como un string.
        
        String nombre3 = input.nextLine();
        System.out.println("Hola, " + nombre3);
    }
    
}
