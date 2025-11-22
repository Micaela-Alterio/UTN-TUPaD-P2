
package Ejercicio_01_SistemaDeStock;

public class E01_SistemaDeStock {

    public static void main(String[] args) {
        
        //1.Crear productos de diferentes categorías y agregarlos al inventario.
        System.out.println("Consigna 1:Crear 5 productos de diferentes"
            + " categorias y agregarlos al inventario.");

        //Creacion del inventario
        Inventario inventario = new Inventario();
        
        //Creacion de producto 1 que luego se agrega al inventario creado.
        Producto producto1 = new Producto ("001","Frutas",80000,10,
            CategoriaProducto.ALIMENTOS);
    
        inventario.agregarProducto(producto1);
        
        //Creacion de producto 2 que luego se agrega al inventario creado.
        Producto producto2 = new Producto ("101","Auriculares",120000,35,
            CategoriaProducto.ELECTRONICA);
        inventario.agregarProducto(producto2);
        
        //Creacion de producto 3 que luego se agrega al inventario creado.
        Producto producto3 = new Producto ("102","Parlante",145000,20,
            CategoriaProducto.ELECTRONICA);
        inventario.agregarProducto(producto3);
        
        //Creacion de producto 4 que luego se agrega al inventario creado.
        Producto producto4 = new Producto ("201","Jean",80000,50,
            CategoriaProducto.ROPA);
        inventario.agregarProducto(producto4);
        
        //Creacion de producto 5 que luego se agrega al inventario creado.
        Producto producto5 = new Producto ("301","Almohadones",60000,16,
            CategoriaProducto.HOGAR);
        inventario.agregarProducto(producto5);
        
        //Creacion de productos con metodos sobrecargados:
        
        //Creacion de producto 6 que luego se agrega al inventario creado.
        Producto producto6 = new Producto ("002","Huevos",18,CategoriaProducto.ALIMENTOS);
        inventario.agregarProducto(producto6);
    
        //Creacion de producto 7 que luego se agrega al inventario creado.
        Producto producto7 = new Producto ("302",22,CategoriaProducto.HOGAR);
        inventario.agregarProducto(producto7);
        
        System.out.println("\nSe ha creado un inventario y dentro del mismo se "
            +"han creando productos con el constructor principal y con "
            +"constructores sobrecargados.");
            inventario.obtenerCantidadProductos();
        
        //2. Listar todos los productos mostrando su información y categoría.
        System.out.println("\nConsigna 2: Listar todos los productos mostrando"
            + " su informacion y categoria.");
        inventario.listarProductos();
        
        //3. Buscar un producto por ID y mostrar su información.
        System.out.println(
            "\nConsigna 3: Buscar un producto por ID y mostrar su informacion.");
        inventario.buscarProductoPorId("001");
        
        //4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("\nConsigna 4: Mostrar productos pertenecientes a una"
            + " categoria especifica.");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        
        //5. Eliminar un producto por su ID y listar los productos restantes.
         System.out.println("\nConsigna 5: Eliminar un producto por ID y listar"
            + " el inventario actualizado.");
        inventario.eliminarProducto("001");
        inventario.listarProductos();
        
        //Luego, utilice el mismo metodo para eliminar un producto por cantidad.
        System.out.println("\nA continuacion utilizo el mismo metodo para"
            +" eliminar un producto por cantidad");
        inventario.eliminarProducto(16);
        inventario.listarProductos();
        
        
        //6. Actualizar el stock de un producto existente.
        System.out.println("\nConsigna 6: Actualizar el stock de un producto.");
        inventario.actualizarStock("201", 24);
        
        //7. Mostrar el total de stock disponible.
        System.out.println("\nConsigna 7: Mostrar el total del stock disponible.");
        inventario.obtenerTotalStock();

        //8. Obtener y mostrar el producto con mayor stock.
        System.out.println(
            "\nConsigna 8: Obtener y mostrar el producto con mayor stock.");
        inventario.obtenerProductoConMayorStock();
        
        //9. Filtrar productos con precios comprendidos en un rango.
        System.out.println("\nConsigna 9: Filtrar productos con precios "
            +"comprendidos en un rango.");
        inventario.filtrarProductosPorPrecio(100000, 200000);
        
        //10. Mostrar las categorías disponibles con sus descripciones. 
        System.out.println("\nConsigna 10: Mostrar las categorias disponibles "
            + "con sus descripciones. ");
        inventario.mostrarCategoriasDisponibles();

        
        //CONCLUSIONES ESPERADAS
        //Aplicar constructores sobrecargados para flexibilizar la creación de objetos.
        //Implementar métodos con el mismo nombre y distintos parámetros.
        //Representar objetos con toString() para mejorar la depuración.
        //Diferenciar y aplicar atributos y métodos estáticos en Java.
        //Reforzar el diseño modular y reutilizable mediante el paradigma orientado a objetos. 
    }
    
}
