package Ejercicio_13_GeneradorQR;

public class Ejercicio_13_GeneradorQR {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Camila Lopez", "camilop@gmail.com");
        GeneradorQR generadorQR = new GeneradorQR();
        
        generadorQR.generarYMostrarQR("geo:40.7128,-74.0060", usuario);
    }
    
}
