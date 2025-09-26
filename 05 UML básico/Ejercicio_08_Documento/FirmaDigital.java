package Ejercicio_08_Documento;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;

    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return ("\nFirma digital del usuario:\nCodigo Hash: " + codigoHash + 
                "\nFecha de firma: " + fecha);
    }
    
    
}
