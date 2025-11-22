
package Ejercicio_03_SistemaAcademico;

public class E03_SistemaAcademico {

    public static void main(String[] args) {
        
        //Tareas a realizar
        
        //1. Crear al menos 3 profesores y 5 cursos.
        System.out.println("\nCrear al menos 3 profesores y 5 cursos.");
        
        //Creacion del Profesor 1.
        Profesor prof1 = new Profesor ("101", "Luciano Chiroli", "Programacion ");
        
        //Creacion del Profesor 2.
        Profesor prof2 = new Profesor ("102", "Nicolas Carcano", "Base de Datos ");
        
        //Creacion del Profesor 3.
        Profesor prof3 = new Profesor ("103", "Andrea Comerci", "Probabilidad y estadistica ");
        
        //Creacion del Curso 1.
        Curso curso1 = new Curso ("001", "Programacion Orientada a Objetos ");
        
        //Creacion del Curso 2.
        Curso curso2 = new Curso ("002", "Modelado UML ");
        
        //Creacion del Curso 3.
        Curso curso3 = new Curso ("003", "Lenguaje SQL ");
        
        //Creacion del Curso 4.
        Curso curso4 = new Curso ("004", "Diseno de Bases de datos ");
        
        //Creacion del Curso 5.
        Curso curso5 = new Curso ("005", "Lenguaje R ");
        
        //Creacion del Curso 6.
        Curso curso6 = new Curso ("006", "Analisis de Modelos de Probabilidad ");
        
        System.out.println("\nHe creado 3 Profesores y 6 Cursos.");
        
        //2. Agregar profesores y cursos a la universidad.
        System.out.println(
            "\nConsigna 2: Agregar profesores y cursos a la universidad.");
        
        //Primero se crea la universidad
        Universidad universidad = new Universidad ("UTN");
        
        //Se agregan los profesores 
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        //Se agregan los cursos
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        universidad.agregarCurso(curso6);
        
        System.out.println("\nSe creo la universidad y se agregaron Profesores y Cursos.");

        //3. Asignar profesores a cursos usando asignarProfesorACurso().
        System.out.println("\nConsigna 3: Asignar profesores a cursos usando "
            +"asignarProfesorACurso().");
        
        universidad.asignarProfesorACurso("001", "101");
        universidad.asignarProfesorACurso("002", "101");
        universidad.asignarProfesorACurso("003", "102");
        universidad.asignarProfesorACurso("004", "102");
        universidad.asignarProfesorACurso("005", "103");
        universidad.asignarProfesorACurso("006", "103");
        
        System.out.println("\nSe asignaron Profesores a los Cursos.");
        
        //4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("\nConsigna 4: Listar cursos con su profesor y "
            +"profesores con sus cursos.");
        
        universidad.listarCursos();
        universidad.listarProfesores();
        
        //5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("\nConsigna 5: Cambiar el profesor de un curso y "
            +"verificar que ambos lados quedan sincronizados.");
        
        System.out.println(
            "\nSe cambia el profesor "+prof1.getNombre()+" por el profesor "
            +prof2.getNombre()+" en el curso "+curso2.getNombre());
        
        System.out.println("\nSe muestra la informacion actual del curso:");
        universidad.mostrarCursoPorCodigo("002");
        
        //Se hace el cambio de profesor
        universidad.asignarProfesorACurso("002", "102");
        
        System.out.println("\nSe muestra la nueva informacion del curso:");
        universidad.mostrarCursoPorCodigo("002");
        
        System.out.println("\nSe muestra la nueva informacion de los profesores:");
        universidad.mostrarProfesorPorId("102");
        universidad.mostrarProfesorPorId("101");
        
        //6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\nConsigna 6: Remover un curso y confirmar que ya no"
            +" aparece en la lista del profesor.");
        
        universidad.eliminarCurso("003");
        
        System.out.println("\nSe muestra la nueva informacion del profesor:");
        universidad.mostrarProfesorPorId("102");
        
        //7. Remover un profesor y dejar profesor = null.
        System.out.println(
            "\nConsigna 7: Remover un profesor y dejar profesor = null.");
        
        universidad.eliminarProfesor("103");
        universidad.listarCursos();
        
        //8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println(
            "\nConsigna 8: Mostrar la cantidad de cursos por profesor.");
        
        universidad.cantidadCursosProfesor();

    }
    
}

