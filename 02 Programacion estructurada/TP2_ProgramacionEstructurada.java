package TrabajosPracticosProgramacion2;

import java.util.Scanner;

public class TP2_ProgramacionEstructurada {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        //EJERCICIO 1///////////////////////////////////////////////////////////
        //Verificacion de anio bisiesto
        
        System.out.println("Ejercicio 1:\n");
        int anio;
        
        System.out.print("Ingrese un anio: ");
        anio=Integer.parseInt(input.nextLine());
        
        if((anio%4==0 && anio%100!=0) || (anio%100==0 && anio%400==0)){
            System.out.println("El anio ingresado es bisiesto.");
        }else{
            System.out.println("El anio ingresado no es bisiesto.");          
        }
        System.out.println();  
        
        //EJERCICIO 2///////////////////////////////////////////////////////////
        //Determinar el mayor de tres Numeros
        
        System.out.println("Ejercicio 2:\n");
        int a,b,c,mayor;
        
        System.out.println("Ingrese un numero: ");
        a=Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro un numero: ");
        b=Integer.parseInt(input.nextLine());
        System.out.println("Ingrese otro un numero: ");
        c=Integer.parseInt(input.nextLine());
        
        if (a>b){
            mayor=a;
        }else if (b>c){
            mayor=b;
        }else{
            mayor=c;
        }
        System.out.println("El numero mayor ingresado es: "+ mayor);
        System.out.println();
        
        //EJERCICIO3////////////////////////////////////////////////////////////
        //Clasificación de edad
        
        System.out.println("Ejercicio 3:\n");
        int edad;
        
        System.out.println("Ingrese su edad: ");
        edad=Integer.parseInt(input.nextLine());
        
        if (edad>60){
            System.out.println("Etapa: Adulto mayor. ");
        }else if (edad>18){
            System.out.println("Etapa: Adulto. ");
        }else if (edad>12){
            System.out.println("Etapa: Adolescente. ");
        }else if (edad>0){
            System.out.println("Etapa: Ninio. ");            
        }else{
            System.out.println("Edad ingresada incorrecta. ");
        }
        System.out.println();
        
        //EJERCICIO 4///////////////////////////////////////////////////////////
        //Calculadora de descuento segun categoria
        
        System.out.println("Ejercicio 4:\n");
        double precio,preciofinal=0;
        char categoria;
        int descuento=0;
        
        System.out.println("Ingrese el precio del producto: ");
        precio=Double.parseDouble(input.nextLine());
        System.out.println("Ingrese la categoria del producto (A,B o C): ");
        categoria=input.nextLine().charAt(0);
        
        switch(categoria){
            case 'A','a':
                preciofinal=precio*0.90;
                descuento=10;
                break;
            case 'B','b':
                preciofinal=precio*0.85;
                descuento=15;
                break;
            case 'C','c':
                preciofinal=precio*0.80;
                descuento=20;
                break;
            default:
                System.out.println("Categoria incorrecta");
                return;
        }
        System.out.println("El precio del producto es "+precio+", se aplica un "
                +descuento+ " % de descuento, y el precio final es: "
                +preciofinal);
        System.out.println();
        
        //EJERCICIO 5///////////////////////////////////////////////////////////
        //Suma de numeros pares
        
        System.out.println("Ejercicio 5:\n");
        int num,suma=0,impar=0;
        
        System.out.println("Ingrese un numero, (para finalizar ingrese 0): ");
        num=Integer.parseInt(input.nextLine());
        
        while (num!=0){
            if (num%2==0){
                suma=suma+num;
            }else{
                impar++;
            }
            System.out.println("Ingrese un numero, (para finalizar ingrese "
                    + "0): ");
            num=Integer.parseInt(input.nextLine());
        }
        if (suma==0&&impar>0){
            System.out.println("No se ingresaron numeros pares. ");
        }else{
            System.out.println("La suma total de los numeros pares ingresados "
                    + "es: "+suma);
            
        System.out.println();
        
        //EJERCICIO 6///////////////////////////////////////////////////////////
        //Contador de positivos, negativos y ceros
        
        System.out.println("Ejercicio 6:\n");
        int numeros,pares=0,impares=0,ceros=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            numeros=Integer.parseInt(input.nextLine());
            
            if (numeros==0){
                ceros++;
            }else if (numeros%2==0){
                pares++;
            }else {
                impares++;
            }          
        }
        System.out.println("La cantidad de numeros pares ingresados es: "
                +pares+"\nLa cantidad de numeros impares ingresados es: "
                +impares
                +"\nLa cantidad de ceros ingresados es: "+ceros);
        
        System.out.println();
        
        //EJERCICIO 7///////////////////////////////////////////////////////////
        //Validacion de nota entre 0 y 10
        
        System.out.println("Ejercicio 7:\n");
        int nota;
        
        do{
        System.out.println("Ingrese su nota: ");
        nota=Integer.parseInt(input.nextLine());
            
        if (nota>=0 && nota<=10){
                System.out.println("Nota guardada correctamente. ");
            }else {
                System.out.println("ERROR: Nota inválida. Ingrese una nota "
                        + "entre 0 y 10. ");
            }          
        }while (nota<0||nota>10);
        
        System.out.println();
        
        //EJERCICIO 8///////////////////////////////////////////////////////////
        //Calculo del precio final con impuesto y descuento
        
        System.out.println("Ejercicio 8:\n");
        double preciobase,impuesto,desc,preciofin;
        
        System.out.println("Ingrese el precio del producto: ");
        preciobase=Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el impuesto del producto en porcentaje: ");
        impuesto=Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el descuento del producto en porcentaje: ");
        desc=Integer.parseInt(input.nextLine());
        
        preciofin= calcularPrecioFinal(preciobase,impuesto,desc);
        
        System.out.println("El precio final del producto es: "+ preciofin);
        System.out.println();
        
        //EJERCICIO 9///////////////////////////////////////////////////////////
        //Funciones para calcular costo de envío y total de compra
        
        System.out.println("Ejercicio 9:\n");
        double precioproducto,peso,costoenvio,totalcompra;
        String zona;
        
        System.out.println("Ingrese el precio del producto: ");
        precioproducto=Double.parseDouble(input.nextLine());
        System.out.println("Ingrese el peso del paquete en KG: ");
        peso=Double.parseDouble(input.nextLine());
        System.out.println("Ingrese la zona de envio (Nacional/Internacional):"
                + " ");
        zona=input.nextLine();
        
        costoenvio= calcularCostoEnvio(peso, zona);
        totalcompra= calcularTotaldeCompra(precioproducto, costoenvio);
        
        if (costoenvio!=0){
        System.out.println("El costo del envio  es: "+ costoenvio+"\nEl total "
                + "a pagar es: "+totalcompra);
        }else{
        System.out.println("Zona de envio incorrecta");
        }
        System.out.println();
        
        //EJERCICIO10///////////////////////////////////////////////////////////
        //Actualización de stock a partir de venta y recepción de productos
        
        System.out.println("Ejercicio 10:\n");
        int stock,cantvendida,cantrecibida;
        
        System.out.println("Ingrese el stock actual del producto: ");
        stock=Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad de productos vendidos: ");
        cantvendida=Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad de productos recibidos: ");
        cantrecibida=Integer.parseInt(input.nextLine());
        
        stock=actualizarStock(stock,cantvendida,cantrecibida);
        
        System.out.println("El stock actual del producto es: "+ stock);
        System.out.println();
        
        //EJERCICIO 11//////////////////////////////////////////////////////////
        //Cálculo de descuento especial usando variable global
        
        System.out.println("Ejercicio 11:\n");
        double precioin,preciof;
        
        System.out.println("Ingrese el precio del producto: ");
        precioin=Double.parseDouble(input.nextLine());
        
        preciof=calcularDescuentoEspecial(precioin);
        
        System.out.println("El precio final con descuento es: "+preciof);
        System.out.println();
        
        //EJERCICIO 12//////////////////////////////////////////////////////////
        //Modificación de un array de precios y visualización de resultados
        
        System.out.println("Ejercicio 12:\n");
        double[]precios={199.99, 299.5, 149.75, 399, 89.99};
        
        for (int i = 0; i < precios.length; i++) {
            System.out.print(precios[i]+" ");
        }
        System.out.println();
        precios[2]=129.99;
    
        for (int i = 0; i < precios.length; i++) {
            System.out.print(precios[i]+" ");
        }
        System.out.println();
        
        //EJERCICIO13///////////////////////////////////////////////////////////
        //Impresion recursiva de arrays antes y despues de modificar un elemento
        
        System.out.println("\nEjercicio 13:\n");
        double[]valores={199.99, 299.5, 149.75, 399, 89.99};
        
        vectorRecursivo(valores,0);
        
        valores[2]=129.99;
    
        System.out.println();
        
        vectorRecursivo(valores,0);
        
        System.out.println();
        }
    }
//FUNCIONES/////////////////////////////////////////////////////////////////////
    
//METODO EJERCICIO 8////////////////////////////////////////////////////////////
//Calculadora de precio final
    
public static double calcularPrecioFinal(double precio, double impuesto, 
double descuento){
        
    double preciofinal= precio + (precio*(impuesto/100)) -
    (precio*(descuento/100));
        
    return preciofinal;
    }

//METODO EJERCICIO 9////////////////////////////////////////////////////////////
//Calculadora de costo de envio
    
public static double calcularCostoEnvio(double peso, String zona){
        
        double costoenvio=0;
        if (zona.equalsIgnoreCase("Nacional")){
            costoenvio=peso*5;
        }else if (zona.equalsIgnoreCase("Internacional")){
            costoenvio=peso*10;
        }
        return costoenvio;
    }

//METODO EJERCICIO 9////////////////////////////////////////////////////////////
//Calculadora del precio total de la compra

 public static double calcularTotaldeCompra(double precioproducto, 
    double costoenvio){
        
        double totalcompra=precioproducto+costoenvio;
        return totalcompra;
    }

//METODO EJERCICIO 10///////////////////////////////////////////////////////////
//Calculadora que actualiza stock de productos
 
public static int actualizarStock(int stock, int cantvendida, 
    int cantrecibida){
        int stockactual=stock-cantvendida+cantrecibida;
        
        return stockactual;
}
    //VARIABLE GLOBAL EJERCICIO 11//////////////////////////////////////////////
    
    static double descuentoespecial = 0.10;

//METODO EJERCICIO11////////////////////////////////////////////////////////////
//Calculadora de descuento

public static double calcularDescuentoEspecial(double precio){
        
        double descuentoaplicado=precio * descuentoespecial;
        double preciofinal=precio-descuentoaplicado;
        
        System.out.println("El descuento especial aplicado es: "
                + descuentoaplicado);
        return preciofinal;
    }
//METODO EJERCICIO13////////////////////////////////////////////////////////////
//Impresion recursiva de vector
public static void vectorRecursivo (double []vector, int indice){
        if (indice==vector.length){
            return;
        }
        System.out.print(vector[indice] + " ");
        vectorRecursivo(vector, indice + 1);
    }
}