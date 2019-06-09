package y_Diseno_Clases.ventas;

import y_Diseno_Clases.com.gm.ventas.*;

public class Ventas {
    public static void main(String[] args) {
        //Creamos varios Objetos de tipo producto
        Producto producto1 = new Producto ("Camisa", 50);
        Producto producto2 = new Producto ("Pantalon", 100);
        Producto producto3 = new Producto ("Medias", 20);
        Producto producto4 = new Producto ("Zapatos", 250);
        Producto producto5 = new Producto ("Relog", 300);

        //Objeto de tipo orden
        Orden orden1 = new Orden ();
        Orden orden2 = new Orden ();

        //Agregamos los productos a la orden
        orden1.agregarProducto (producto1);
        orden1.agregarProducto (producto2);

        //agregamos a orden orden dos
        orden2.agregarProducto (producto1);
        orden2.agregarProducto (producto2);
        orden2.agregarProducto (producto3);
        orden2.agregarProducto (producto4);
        orden2.agregarProducto (producto5);

        //imrpimimos la orden
        orden1.mostrarOrden ();

        //imrpimimos la orden
        orden2.mostrarOrden ();


    }
}
