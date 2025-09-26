package Ejercicio_02_Celular;

public class Ejercicio_2_Celular {

    public static void main(String[] args) {
        
        Usuario usuario = new Usuario ("Sol Robles", "34827655");
        
        Celular celular= new Celular("74626f8mm", "Apple", 
                "Iphone 15 pro",new Bateria ("Li-ion", 250));
        
        celular.setUsuario(usuario);
        
        celular.mostrarCelular();
    }
    
}
