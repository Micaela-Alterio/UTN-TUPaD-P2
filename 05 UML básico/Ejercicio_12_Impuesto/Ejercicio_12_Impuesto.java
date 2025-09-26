package Ejercicio_12_Impuesto;

public class Ejercicio_12_Impuesto {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Hector Post", "2435345879");
        Impuesto impuesto = new Impuesto(23560.33);
        impuesto.setContribuyente(contribuyente);
        
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
        
        
    }
    
}
