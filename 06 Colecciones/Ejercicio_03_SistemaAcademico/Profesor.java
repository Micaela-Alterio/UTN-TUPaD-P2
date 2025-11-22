
package Ejercicio_03_SistemaAcademico;

import java.util.List;
import java.util.ArrayList;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();
    
    //Conatructor para crear un nuevo profesor
    public Profesor(String id, String nombre, String especialidad) {
    this.id = id;
    this.nombre = nombre;
    this.especialidad = especialidad;
    this.cursos = new ArrayList<>();
}
    
    //Agrega nuevos Cursos a la lista
    public void agregarCurso(Curso c) {
    if (!cursos.contains(c)) {
        cursos.add(c);
        c.setProfesor(this); 
    }
}
    
    //Getter lista de cursos
    public List<Curso> getCursos() {
        return cursos;
    }
    
    //Muestra el listado de cursos con sus codigos y nombres
    public void listarCursos(){
        System.out.println("\nListado de cursos existentes:");
        for (Curso c: cursos){
            c.mostrarInfo();
        }
    }
    
    //Quita el curso y sincroniza el lado del curso
    //Deja profesor en null si corresponde.
    public void eliminarCurso(Curso c){
        if(cursos.remove(c)){
            c.setProfesor(null); 
            System.out.println("Curso eliminado correctamente");
        } else {
            System.out.println("Curso no encontrado");
        }
    }

    public void mostrarInfo(){
        System.out.println(this.toString());
    }
    
    //Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    @Override
    public String toString() {
        return  "\nProfesor: "+
                "\nID: "+id+
                "\nNombre: "+nombre+
                "\nEspecialidad: "+especialidad;
    }

}
