package Ejercicio_02_Celular;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria=bateria;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario=usuario;
        if (usuario!= null && usuario.getCelular() != this){
        usuario.setCelular(this);
        }
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public void mostrarCelular() {
        System.out.println("Celular:\nImei: "+ imei +"\nMarca: " 
                + marca +"\nModelo: "+ modelo + bateria + usuario);
    }
}
