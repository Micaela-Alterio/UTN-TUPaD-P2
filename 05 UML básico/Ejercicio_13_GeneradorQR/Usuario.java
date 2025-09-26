package Ejercicio_13_GeneradorQR;

public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return ("\nUsuario asignado a este QR:\nNombre: "+ nombre + 
                "\nEmail: " + email);
    }
    
    
    
}


