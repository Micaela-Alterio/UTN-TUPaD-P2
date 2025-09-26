package Ejercicio_10_CuentaBancaria;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, 
            String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    public void mostrarCuentaBancaria() {
        System.out.println("Cuenta bancaria:\nCBU: " + cbu + "\nSaldo: " + saldo 
                +"\n"+ claveSeguridad + titular);
    }
    
    
}
