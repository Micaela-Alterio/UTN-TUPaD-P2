package Ejercicio_09_CitaMedica;

public class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return ("\nPaciente asociado a la cita:\nNombre: " + nombre + 
                "\nObra Social: " + obraSocial);
    }
    
    
}
