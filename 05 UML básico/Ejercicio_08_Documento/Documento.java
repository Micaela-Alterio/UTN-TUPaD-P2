package Ejercicio_08_Documento;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    private Usuario usuario;

    public Documento(String titulo, String contenido, String codigoHash, 
            String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha);
        this.usuario = usuario;
    }
    
    public void mostrarDocumento() {
        System.out.println("Documento:\nTitulo: "+ titulo +"\nContenido: " 
                + contenido +"\n"+ usuario + firmaDigital);
    }
    
}
