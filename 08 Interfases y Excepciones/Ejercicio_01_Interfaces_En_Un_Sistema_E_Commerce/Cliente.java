
package Ejercicio_01_Interfaces_En_Un_Sistema_E_Commerce;

public class Cliente implements Notificable{
    private String nombre;
    private Pedido pedido;
    private String estado; 
    
    //Constructor
    public Cliente (String nombre){
        this.nombre = nombre;
    }
    
    //Metodo para imprimir el estado del pedido
    public void mostrarEstadoDelPedido(){
        
        System.out.println("\nEl estado del pedido es :"+cambioDeEstado());    
    }
    
    //Setter para asignar el pedido al cliente
    public void setPedido(Pedido pedido){
    this.pedido = pedido;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String cambioDeEstado(){
        
        this.estado= pedido.getEstado();
        
        return estado;
    }
}