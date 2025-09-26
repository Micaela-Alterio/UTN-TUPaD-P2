package Ejercicio_05_Computadora;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modelo, String 
            chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre (modelo, chipset);
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario!= null && propietario.getComputadora() != this){
        propietario.setComputadora(this);
        }
    }
    
    public void mostrarComputadora() {
        System.out.println("Computadora:\nMarca: " + marca + 
                "\nNumero de serie: " + numeroSerie + placaMadre + propietario);
    }
    
}
