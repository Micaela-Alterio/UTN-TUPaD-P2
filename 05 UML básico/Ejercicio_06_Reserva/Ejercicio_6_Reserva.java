package Ejercicio_06_Reserva;

public class Ejercicio_6_Reserva {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Noelia Coronil","1165340025");
        Reserva reserva = new Reserva ("25/11/25", "21:00hs",
                new Mesa("10","4 personas"));
        
        reserva.setCliente(cliente);
        
        reserva.mostrarReserva();
    }
    
}
