package TP3_IntroduccionaPOO;

public class Gallina {
    
    private int idGallina, edad, huevosPuestos;
    
    // ponerHuevo(), envejecer(), mostrarEstado()
    //Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
    
    public void mostrarDatos(){
        
        System.out.println("\nid Gallina: "+idGallina+"\nEdad: "+edad+
                "\nCantidad de huevos puestos: "+huevosPuestos);
    }
    
    public void setIdGallina (int id){
        idGallina=id;
    }
    
    public void setEdad (int anios){
        edad=anios;
    }
    
    public void setHuevosPuestos (int huevos){
        
        if (huevos>=0){
            huevosPuestos=huevos;
        }
    }
    
    public void setCrecimiento(int envejecer){
        edad+=envejecer;
    
    }
    public void setNuevosHuevos(int huevosnuevos){
        huevosPuestos+=huevosnuevos;
    }
    
}
