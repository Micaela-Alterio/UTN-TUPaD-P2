package Ejercicio_01_Pasaporte;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte=pasaporte;
        if (pasaporte!= null && pasaporte.getTitular() != this){
        pasaporte.setTitular(this);
        }
    }
   
    public Pasaporte getPasaporte(){
        return pasaporte;
    }

    @Override
    public String toString() {
        return "\nTitular asociado a este pasaporte:\nNombre: " + nombre + 
                "\nDNI:" + dni;
    }

    
    
    
}
