package Ejercicio_09_CitaMedica;

public class CitaMedica {
    private String fecha;
    private String hora;
    private Profesional profesional;
    private Paciente paciente;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void mostrarCitaMedica() {
        System.out.println("Cita medica:\nFecha de la cita: "+ fecha +
                "\nHora de la cita: " + hora + profesional + paciente);
    }
    
}
