package Ejercicio_06_Reserva;

public class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return ("\nCliente asociado a esta reserva:\nNombre: " + nombre + 
                "\nTelefono: " + telefono);
    }
    
    
}
