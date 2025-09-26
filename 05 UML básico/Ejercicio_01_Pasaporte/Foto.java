package Ejercicio_01_Pasaporte;

public class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "\nImagen: "+imagen +"\nFormato: "+formato+"\n";
    }
    
    
    
    
}
