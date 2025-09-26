package Ejercicio_14_EditorVideo;

public class EditorVideo {
    public void exportarYMostrar (String formato, Proyecto proyecto){
        
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        
        System.out.println("El video ha sido exportado.\nFormato: "+ 
                render.getFormato()+ "\n"+render.getProyecto());
    }
}
