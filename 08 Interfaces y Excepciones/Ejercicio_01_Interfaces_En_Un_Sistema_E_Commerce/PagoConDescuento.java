
package Ejercicio_01_Interfaces_En_Un_Sistema_E_Commerce;

public interface PagoConDescuento extends Pago {
    
    public double aplicarDescuento(double monto);
    
}