
package Ejercicio_03_SistemaAcademico;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    
    //Constructor para crear un nuevo curso
    public Curso (String codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
        this.profesor=null;
    }
    
    public void setProfesor(Profesor p) {
        if(this.profesor != null){
            this.profesor.getCursos().remove(this);
        }
        this.profesor = p;
        if(p!=null && !p.getCursos().contains(this)){
        p.getCursos().add(this);
        }
    }
    
    public void mostrarInfo(){
        System.out.println(this.toString());
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
    @Override
    public String toString() {
        
        return  "\nCurso: "+
                "\nCodigo del curso: "+codigo+
                "\nNombre: "+nombre;
    }

}
