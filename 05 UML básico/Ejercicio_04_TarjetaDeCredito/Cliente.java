package Ejercicio_04_TarjetaDeCredito;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito!= null && tarjetaDeCredito.getCliente() != this){
        tarjetaDeCredito.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return ("\nCliente asociado a esta tarjeta:\nNombre: "+ nombre + 
                "\nDNI: " + dni);
    }
    
    
}
