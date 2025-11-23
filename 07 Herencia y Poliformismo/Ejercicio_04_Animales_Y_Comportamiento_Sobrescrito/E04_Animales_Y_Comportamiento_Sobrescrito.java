
package Ejercicio_04_Animales_Y_Comportamiento_Sobrescrito;

import java.util.ArrayList;

public class E04_Animales_Y_Comportamiento_Sobrescrito {

    public static void main(String[] args) {
        
        //Creacion de lista de animales
        ArrayList<Animal> animales = new ArrayList<>();
        
        //Agregacion de animales
        animales.add(new Gato("Nilo","Egipcio color gris y ojos verdes"));
        animales.add(new Gato("Pepa","Siamesa bicolor y ojos azules"));
        animales.add(new Perro("Julio","Galgo negro, pelo corto"));
        animales.add(new Perro("Perla","Border Collie blanca y negra, pelo largo"));
        animales.add(new Vaca("Florinda","Holstein con grandes manchas blancas y negras"));
        animales.add(new Vaca("Alfonso","Macho, Angus pelaje negro"));
        
        //Llamado al metodo mostrarSonido() que muestra los sonidos por poliformismo
        Animal.mostrarSonidos(animales);
                
    }
    
}