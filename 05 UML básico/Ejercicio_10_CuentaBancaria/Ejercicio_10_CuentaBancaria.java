package Ejercicio_10_CuentaBancaria;

public class Ejercicio_10_CuentaBancaria {

    public static void main(String[] args) {
        
        Titular titular = new Titular("Gonzalo Flores", "23987453");
        CuentaBancaria cuentaBancaria = new CuentaBancaria
        ("84597352753168906537", 350000.00, "VLH756", "23/05/2024");
        
        cuentaBancaria.setTitular(titular);
        
        cuentaBancaria.mostrarCuentaBancaria();
    }
    
}
