package Ejercicio_03_Libro;

public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial;
    private Autor autor;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    
    public Autor getAutor(){
        return autor;
    }
    
    public void mostrarLibro() {
        System.out.println("Libro:\nTitulo: "+ titulo +"\nISBN: " 
                + isbn+"\n" + autor + editorial);
    }
}
