
package Ejercicio_04_TarjetaDeCredito;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente!= null && cliente.getTarjetaDeCredito() != this){
        cliente.setTarjetaDeCredito(this);
        }
    }
    
    public void mostrarTarjetaDeCredito() {
        System.out.println("Tarjeta de credito:\nNumero: "+ numero +
                "\nFecha de vencimiento: "+ fechaVencimiento + banco + cliente);
    }
    
    
    
    
}
