package TP3_IntroduccionaPOO;

public class Libro {
    
    private String titulo, autor;
    private int anioPublicacion;
    
    
     
    public void setTitulo(String tituloLibro){
        titulo=tituloLibro;
    }
    
    public void setAutor(String autorLibro){
        autor=autorLibro;
    }
    
    public void setAnioPublicacion(int anioLibro){
        
        //Verificamos que el anio ingresado tenga cuatro digitos
        //El primero libro impreso registrado data de 1455
        //Verificamos que el anio de publicacion este dentro del rango esperado.
        
        if (String.valueOf(anioLibro).length() == 4 && 
                anioLibro >=1455 && anioLibro <=2025){
            
            anioPublicacion=anioLibro;
        }else{
            System.out.println("\nEl anio ingresado es incorrecto.\n");
        }    
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    
}
