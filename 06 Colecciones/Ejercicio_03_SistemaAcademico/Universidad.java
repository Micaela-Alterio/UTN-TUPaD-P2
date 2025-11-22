
package Ejercicio_03_SistemaAcademico;

import java.util.List;
import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    //Constructor de universidad
    public Universidad (String nombre){
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    //Metodo para agregar un nuevo profesor
    public void agregarProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }
    
    //Metodo para agregar un nuevo curso
    public void agregarCurso(Curso curso){
        this.cursos.add(curso);
    }
    
    //Metodo para asignar un profesor a un curso //→ Usa setProfesor del curso.
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if(curso != null && profesor != null){
            
            // sincroniza ambos lados:
            curso.setProfesor(profesor);
        }
    }
    
    //Metodo para listar profesores y los cursos que dictan
    public void listarProfesores(){
        
        System.out.println("\nListado de profesores y los cursos que dictan:");
        
        for (Profesor p: profesores){
            p.mostrarInfo();
            if (p.getCursos().isEmpty()) System.out.println("\nNo dicta ningún curso");
            else {System.out.println("Cursos que dicta: ");
                for (Curso c : p.getCursos()){
                    System.out.println("- "+c.getNombre());
                }
            }
        }
    }
    
    //Metodo para listar cursos y los profesores que los dictan.
    public void listarCursos(){
        System.out.println("\nListado de cursos y profesores que los imparten:");
        
        for (Curso c: cursos){
            c.mostrarInfo();
            if (c.getProfesor()==null) System.out.println("Profesor no asignado.");
            else{System.out.println("Profesor que dicta el curso: "+ c.getProfesor().getNombre());
            }
        }
    }
    
    //Buscador de profesor por ID
    private Profesor buscarProfesorPorId(String id){
        
        for (Profesor p: profesores){
            if (p.getId().equals(id)){
              
                return p;
            }
        }
        return null;
    }
    
    //Buscador de cursos por codigo
    private Curso buscarCursoPorCodigo(String codigo){
       
        for (Curso c: cursos){
            if (c.getCodigo().equals(codigo)){
                
                return c;
            }
        }
        return null;
    }
    
    //Mostrar profesor por ID
    public void mostrarProfesorPorId(String id){
        
        for (Profesor p: profesores){
            if (p.getId().equals(id)){
               
                p.mostrarInfo();
                System.out.println("Cursos que dicta:");
                for (Curso c : p.getCursos()) {
                    System.out.println("- "+c.getNombre());
                }
                return;
            }    
        }
        System.out.println(
                    "\nNo se han encontrado profesores con la id ingresada.");
        
    }
    
    //Mostrar cursos por codigo
    public void mostrarCursoPorCodigo(String codigo){
       
        for (Curso c: cursos){
            if (c.getCodigo().equals(codigo)){
                
                c.mostrarInfo();
                if (c.getProfesor() != null){
                    System.out.println("Profesor que lo dicta: "
                        + c.getProfesor().getNombre());
                }else{
                    System.out.println("Profesor no asignado");
                }
                return;
            }        
        }
        System.out.println(
            "\nNo se han encontrado cursos con el codigo ingresado.");
    }
    
    //Eliminar un curso por codigo → Debe romper la relación con su profesor si la hubiera.
    public void eliminarCurso(String codigo){
        
        boolean encontrado= false;
        
        for (Curso c: cursos){
            if (c.getCodigo().equals(codigo)){
                encontrado= true;
                
                if (c.getProfesor() != null) {
                    
                    c.setProfesor(null);// Quita la referencia del curso al profesor
                }
                cursos.remove(c);// Elimina curso
                
                System.out.println("\nSe ha eliminado el curso "+c.getNombre());
                break;
            }    
        }
        if (!encontrado){
            System.out.println(
                "\nNo se han encontrado cursos con el codigo ingresado");
        }
    }
    
    //Eliminar un profesor por id → Antes de remover, dejar null los cursos que dictaba.
    public void eliminarProfesor(String id){
        
        //variable temporal para almacenar el profesor a eliminar
        Profesor eliminar = null;
        
        //for-each para buscar por id y almacenar el profesor en la variable
        for (Profesor p: profesores){
            if (p.getId().equals(id)){
                eliminar=p;
                break;
            }    
        }
        //si el id no coincide se imprime un mensaje y se detiene el proceso
        if (eliminar==null){
            System.out.println(
                "\nNo se han encontrado profesores con la id ingresada");
            return;
        }
        //for-each que crea una copia de la lista para setear en null los cursos
        for(Curso c : new ArrayList<>(eliminar.getCursos())){
            c.setProfesor(null);
        }
        //se elimina el profesor
        profesores.remove(eliminar);
        System.out.println("\nSe ha eliminado el profesor "+eliminar.getNombre());
    }
    
    //Metodo que cuenta la cantidad de cursos que dicta cada profesor
    public void cantidadCursosProfesor(){
        System.out.println("\nCantidad de cursos por profesor:");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre()+": "+p.getCursos().size());
        }
    }
    
}
