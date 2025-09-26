package Ejercicio_01_Pasaporte;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto imagen;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.imagen = new Foto (imagen, formato);
    }
    
    public void setTitular(Titular titular){
        this.titular=titular;
        if (titular!= null && titular.getPasaporte() != this){
        titular.setPasaporte(this);
        }
    }
   
    public Titular getTitular(){
        return titular;
    }

    
    public void mostrarPasaporte() {
        System.out.println("Pasaporte:\nNumero: " + numero 
                + "\nFecha de emision: " + fechaEmision + imagen + titular);
    }
    
    
    
}
