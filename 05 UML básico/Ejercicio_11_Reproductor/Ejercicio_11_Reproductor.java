package Ejercicio_11_Reproductor;

public class Ejercicio_11_Reproductor {

    public static void main(String[] args) {
        Cancion cancion = new Cancion("Ghost");
        Artista artista = new Artista ("Motorama", "Post-Punk");
        cancion.setArtista(artista);
        Reproductor reproductor = new Reproductor();
        
        reproductor.reproducir(cancion);
        
        
    }
    
}
