package Ejercicio_04_TarjetaDeCredito;

public class Ejercicio_4_TarjetaDeCredito {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente ("Maria Cartier", "24556786");
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito ("956985038",
                "05/2028", new Banco ("Galicia", "54-98776493-1"));
        
        tarjetaDeCredito.setCliente(cliente);
        
        tarjetaDeCredito.mostrarTarjetaDeCredito();
    }
    
}
