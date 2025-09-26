package Ejercicio_13_GeneradorQR;

public class GeneradorQR {
    
    public void generarYMostrarQR (String valor, Usuario usuario){
        
        CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        
        System.out.println("El Codigo QR generado es: " + 
                codigoQR.getValor()+ codigoQR.getUsuario());
    }
}