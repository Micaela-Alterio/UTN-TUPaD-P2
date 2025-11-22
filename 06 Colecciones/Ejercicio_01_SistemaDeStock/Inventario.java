
package Ejercicio_01_SistemaDeStock;

import java.util.ArrayList;

public class Inventario {
    
    ArrayList<Producto>productos= new ArrayList<>(); 
    private static int totalStock;
    private static int cantidadTotalProductos=0;
    
    //Agrega productos al inventario
    public void agregarProducto(Producto p){

        productos.add(p);
    }
    
    //Lista los productos existentes
    public void listarProductos(){
        System.out.println("\nListado de productos existentes:");
        for (Producto p: productos){
            p.mostrarInfo();
        }
    }
    
    //Getter lista de productos
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    //Buscador de productor por ID
    public void buscarProductoPorId (String id){
        
        boolean encontrado= false;
        
        for (Producto p: productos){
            if (p.getId().equals(id)){
                encontrado=true;
                System.out.println("\nEl producto buscado con el ID "+id+" es: ");
                p.mostrarInfo();
                break;
            }
        }
        if (!encontrado){
            System.out.println(
                "\nNo se han encontrado productos con la id ingresada.");
        }

    }
    
    //Eliminar un producto por ID
    public void eliminarProducto(String id){
        
        boolean encontrado= false;
        
        for (Producto p: productos){
            if (p.getId().equals(id)){
                encontrado= true;
                productos.remove(p);
                System.out.println("\nSe ha eliminado el producto "+id
                    +" con exito.");
                break;
            }    
        }
        if (!encontrado){
            System.out.println(
                "\nNo se han encontrado productos con la id ingresada");
        }
    }
    
    public void eliminarProducto(int cantidad){
        boolean encontrado= false;
        for (Producto p: productos){
            if (p.getCantidad()==cantidad){
                encontrado= true;
                productos.remove(p);
                System.out.println("\nSe ha eliminado el producto con cantidad "
                    +cantidad+" en stock con exito.");
                break;
            }    
        }
        if (!encontrado){
            System.out.println(
                "\nNo se han encontrado productos con la cantidad ingresada");
        }
    }
    
    //Actualiza el stock
    public void actualizarStock(String id, int nuevaCantidad){
        for (Producto p: productos){
            if (p.getId().equals(id)){
                p.setCantidad(nuevaCantidad);
                System.out.println("\nSe ha actualizado el stock del producto"
                    +" ingresado con exito, el stock actual es: ");
                p.mostrarInfo();
            }
        }
    }
    
    //Filtra los productos por categoria  
    public void filtrarPorCategoria(CategoriaProducto categoria){
        boolean encontrado= false;
        System.out.println("\nLos productos pertenecientes a la categoria "
            +categoria+ " son: ");
        
        for (Producto p: productos){
            if (p.getCategoria().equals(categoria)){
                encontrado=true;
                p.mostrarInfo();
            }
        }
        if (!encontrado){
            System.out.println(
                "\nNo se han encontrado productos en la categoria solicitada");
        }
        
    }
    
    //Obtiene el total del stock disponible
    public void obtenerTotalStock(){
        totalStock=0;
        for (Producto p: productos){
            
            totalStock+=p.getCantidad();
        }
        System.out.println("\nEl total actual del stock del inventario es: "
            +totalStock);
    }
    
    //Obtiene la cantidad total de productos del inventario
    public void obtenerCantidadProductos(){
        cantidadTotalProductos=0;
        for (Producto p: productos){
            
            cantidadTotalProductos++;        
        }
        System.out.println("\nLa cantidad total actual de productos del"
            + " inventario es: "+cantidadTotalProductos);
    }
    
    //Muestra el producto con mayor stock del inventario
    public void obtenerProductoConMayorStock(){
        
        Producto productoMayorStock= productos.get(0);
        
        for (Producto p: productos){
            if (p.getCantidad()>(productoMayorStock.getCantidad())){
                
                productoMayorStock=p;
            } 
        }
        System.out.println("\nEl producto con mayor stock disponible es: ");
        productoMayorStock.mostrarInfo();
        
    }
    
    //Filtra los productos por un rango de precios
    public void filtrarProductosPorPrecio(double min, double max){
        boolean encontrado= false;
        System.out.println("\nLos productos existentes en el rango de"
            +" precios comprendidos entre "+min+" y "+max+" son:");
        
        for (Producto p:productos){
            if ((p.getPrecio()>min)&&(p.getPrecio()<max)){
                encontrado=true;
                p.mostrarInfo();
            }
        }
        if(!encontrado){
        System.out.println(
                    "\nNo existen productos dentro de ese rango de precios.");
    
        }
    }
    //Muestra las categorias existentes en el inventario  
    
    public void mostrarCategoriasDisponibles() {
    System.out.println("\nLas categorias existentes en el inventario son:");    
    for (CategoriaProducto c : CategoriaProducto.values()) {
        System.out.println("\n"+c.name() + ": " + c.getDescripcion());
        }
    }
}