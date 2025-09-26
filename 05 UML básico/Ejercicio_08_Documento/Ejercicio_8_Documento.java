package Ejercicio_08_Documento;

public class Ejercicio_8_Documento {

    public static void main(String[] args) {
        Documento documento= new Documento("TP UML", 
                "Ejercicios de programacion", "SHA-256","26/09/2025", 
                new Usuario("Micaela Alterio", "micaelalterio@gmail.com"));
        
        documento.mostrarDocumento();
    }
    
}
