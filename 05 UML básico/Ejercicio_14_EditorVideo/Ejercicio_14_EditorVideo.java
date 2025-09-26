package Ejercicio_14_EditorVideo;

public class Ejercicio_14_EditorVideo {

    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto ("FOXY en patines", 120);
        EditorVideo editorVideo = new EditorVideo();
        
        editorVideo.exportarYMostrar("MP4", proyecto);
    }
    
}
