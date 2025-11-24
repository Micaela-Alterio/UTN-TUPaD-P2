
package Ejercicio_02_Excepciones;

public class EdadInvalidaException extends Exception{
    
    public EdadInvalidaException(String mensaje) {
        super(mensaje); // Llama al constructor de Exception
    }
}