package Ejercicio_09_CitaMedica;

public class Ejercicio_9_CitaMedica {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Juan Manuel Caeiro", "OSDE");
        Profesional profesional = new Profesional ("Dario Mendez", "Cardiologo");
        CitaMedica citaMedica = new CitaMedica("23/10/2025", "15:00hs");
        
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);
        
        citaMedica.mostrarCitaMedica();
        
        
        
    }
    
}
