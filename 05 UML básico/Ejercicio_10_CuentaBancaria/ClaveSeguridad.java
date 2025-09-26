package Ejercicio_10_CuentaBancaria;

public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return ("\nClave de seguridad:\nCodigo: " + codigo + 
                "\nUltima modificacion: " + ultimaModificacion+"\n");
    }
    
    
}
