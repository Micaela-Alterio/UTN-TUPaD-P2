package Ejercicio_07_Vehiculo;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo!= null && vehiculo.getConductor() != this){
        vehiculo.setConductor(this);
        }
    }

    @Override
    public String toString() {
        return ("\nConductor asociado a este vehiculo:\nNombre: " + nombre + 
                "\nLicencia: " + licencia);
    }
}