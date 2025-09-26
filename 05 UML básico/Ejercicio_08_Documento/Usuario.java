package Ejercicio_08_Documento;

public class Usuario {
    private String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return ("\nDocumento asociado al usuario:\nNombre: " + nombre + 
                "\nEmail: " + email+"\n");
    }
    
    
}
