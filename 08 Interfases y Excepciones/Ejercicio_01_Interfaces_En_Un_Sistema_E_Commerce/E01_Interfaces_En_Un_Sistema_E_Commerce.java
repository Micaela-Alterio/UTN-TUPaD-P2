package Ejercicio_01_Interfaces_En_Un_Sistema_E_Commerce;

import java.util.ArrayList;
import java.util.Arrays;

public class E01_Interfaces_En_Un_Sistema_E_Commerce {
    
    public static void main(String[] args) {

        //Creacion de clientes
        Cliente cliente1 = new Cliente("Franco Girolo");
        Cliente cliente2 = new Cliente("Marta Tunez");
        Cliente cliente3 = new Cliente("Rodrigo Santos");
        Cliente cliente4 = new Cliente("Olga Sanchez");
        
        //Creacion de productos
        Producto p1 = new Producto("Teclado", 54000);
        Producto p2 = new Producto("Mouse", 12000);
        Producto p3 = new Producto("Pantalla", 120000);
        Producto p4 = new Producto("CPU", 350000);
        
        //Cliente 1 realiza 1 pedido
        
        //Se crea una lista que aloja los productos que el cliente va a pedir 
        ArrayList<Producto> productos1 = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));
        
        //Se crea un nuevo pedido utilizando la lista.
        //Al crearse el pedido, se muestra su estado actual
        Pedido pedido1 = new Pedido (cliente1, productos1);
        
        //LLama al metodo realizarPago para procesar el pago
        //y ver el estado del pedido
        pedido1.realizarPago("tarjeta");
        
        
        //Cliente 2 realiza 1 pedido
        
        //Se crea una lista que aloja los productos que el cliente va a pedir 
        ArrayList<Producto> productos2 = new ArrayList<>(Arrays.asList(p1, p3));
        
        //Se crea un nuevo pedido utilizando la lista.
        //Al crearse el pedido, se muestra su estado actual
        Pedido pedido2 = new Pedido (cliente2, productos2);
        
        //LLama al metodo realizarPago para procesar el pago
        //y ver el estado del pedido
        pedido2.realizarPago("transferencia");
          
        
        //Cliente 3 realiza 1 pedido
        
        //Se crea una lista que aloja los productos que el cliente va a pedir 
        ArrayList<Producto> productos3 = new ArrayList<>(Arrays.asList(p2, p3));
        
        //Se crea un nuevo pedido utilizando la lista.
        //Al crearse el pedido, se muestra su estado actual
        Pedido pedido3 = new Pedido (cliente3, productos3);
        
        //LLama al metodo realizarPago para procesar el pago
        //y ver el estado del pedido
        pedido3.realizarPago("transferencia");
          
        //Cliente 4 realiza 1 pedido
        
        //Se crea una lista que aloja los productos que el cliente va a pedir 
        ArrayList<Producto> productos4 = new ArrayList<>(Arrays.asList(p4));
        
        //Se crea un nuevo pedido utilizando la lista.
        //Al crearse el pedido, se muestra su estado actual
        Pedido pedido4 = new Pedido (cliente4, productos4);
        
        //LLama al metodo realizarPago para procesar el pago
        //y ver el estado del pedido
        pedido4.realizarPago("tarjeta");
          
    }
    
}