
package Ejercicio_01_Interfaces_En_Un_Sistema_E_Commerce;

import java.util.ArrayList;

public class Pedido implements Pagable{
    
    ArrayList<Producto>  productos = new ArrayList<>();
    private final Cliente cliente;
    private String estado;
    private double total=0;
    
    public Pedido(Cliente cliente, ArrayList<Producto>productos) {
        this.cliente = cliente;
        this.estado = " Pendiente de pago.\n"
            + "\n----------------------------------------------------------------";
        this.productos=productos;
        System.out.println("\n"+cliente.getNombre()+" hemos recibido tu pedido."
            +"\n\nDetalle del pedido:");
        mostrarPedido();
        calcularTotal();
        mostrarMonto();
        cliente.setPedido(this);
        cliente.mostrarEstadoDelPedido();
    }
  
    
    //Metodo que recibe un medio de pago y llama a calcularTotal.
    //Luego mediante un if, valida el metodo de pago y evalua si tiene que
    //aplicar o no un descuento. Luego llama a procesarPago, e imprime un mensaje
    //Comunicando que el pago esta siendo procesado. En caso de haber descuento
    //Calcula el monto final y lo muestra en el mensaje. Finalmente cambia el
    //estado del pedido y llama a mostrarEstadoDelPedido para imprimirlo por consola
    public void realizarPago(String medioDePago) {
        
        System.out.println("\n--Proceso de pago--\n"
            +"\n----------------------------------------------------------------");
        
        if (productos == null || productos.isEmpty()) {
            throw new IllegalArgumentException("\nNo se puede procesar un pedido"
                +" sin productos.");
        }

        if (!medioDePago.equalsIgnoreCase("tarjeta") && 
                !medioDePago.equalsIgnoreCase("transferencia")) {
            throw new IllegalArgumentException("\nMétodo de pago no válido: "
                + medioDePago);
        }
    
        double total = calcularTotal();   
        
        if (medioDePago.equalsIgnoreCase("tarjeta")) {
            Pago pago = new Pago() {

            @Override
            public void procesarPago(double monto) {
                System.out.println("\n...\n\nProcesando el pago... Monto $" + monto
                    +"\n\n...");
            }
        }; 
        pago.procesarPago(total);

        } else if (medioDePago.equalsIgnoreCase("transferencia")) {
            double descuento = 10; // 10% de ejemplo
            PagoConDescuento pagoConDesc = new PagoConDescuento() {
                
            @Override
            public double aplicarDescuento(double monto) {
                return monto * (1 - descuento / 100);
            }
            @Override
            public void procesarPago(double monto) {
                double totalConDesc = aplicarDescuento(monto);
                System.out.println("\n...\n\nProcesando pago con descuento por"
                    +" transferencia. Total: $" + totalConDesc+"\n\n...");
            }
        };
        pagoConDesc.procesarPago(total);
        }
        this.estado = " Pagado"
            +"\n\n----------------------------------------------------------------";
        cliente.mostrarEstadoDelPedido();
    }

    public String getEstado() {
        return estado;
    }
    
    //Metodo para mostrar el contenido del pedido
    public void mostrarPedido(){
        
        for (Producto p : productos){
            System.out.println("\nProducto: "+p.getNombre()
                +"\nPrecio: "+p.getPrecio());
        }
    }
    
    //Metodo que imprime por pantalla el monto total a pagar
    public void mostrarMonto(){
        
        System.out.println("\nEl total a pagar es: "+total);
    }
    
    //Metodo sobrescrito que recorre la lista de productos del pedido y calcula
    //el total a pagar. Luego llama al metodo mostrarMonto para que lo imprima 
    @Override
    public double calcularTotal(){
        
        total = 0;
        
        for (Producto p : productos){
            total+=p.calcularTotal();
        }
        return total;
    }
}