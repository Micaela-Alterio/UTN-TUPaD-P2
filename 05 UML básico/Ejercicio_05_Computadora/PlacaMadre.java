package Ejercicio_05_Computadora;

public class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return ("\nModelo de la placa madre: " + modelo + 
                "\nChipset de la placa madre: " + chipset+"\n");
    }
    
    
}
