package Ejercicio_01_SistemaDeStock;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
    
    //Constructor Producto
    public Producto(String id, String nombre, double precio, int cantidad,
        CategoriaProducto categoria){
    
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
        this.categoria=categoria;
    }
    
    //Constructor Sobrecargado para crear un producto sin precio
    public Producto(String id, String nombre, int cantidad, CategoriaProducto categoria){
    
        this.id=id;
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.categoria=categoria;
    }
    
    //Constructor sobrecargado para crear un producto sin nombre ni precio
    public Producto(String id, int cantidad, CategoriaProducto categoria){
    
        this.id=id;
        this.nombre="No especificado";
        this.cantidad=cantidad;
        this.categoria=categoria;
    }
    
    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }
    
    //Muestra la informacion del producto
    public void mostrarInfo(){
        
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "\nId del producto: "+id+
               "\nNombre del producto: "+nombre+
               "\nPrecio del producto: "+precio+
               "\nCantidad en stock: "+cantidad+
               "\nCategoria del producto: "+categoria;
    }
    
}