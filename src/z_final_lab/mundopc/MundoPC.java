package z_final_lab.mundopc;

import z_final_lab.com.gm.mundopc.*;
import com.sun.org.apache.xpath.internal.operations.Or;

public class MundoPC {
    public static void main(String[] args) {
        //Creamos ratones diferentes marcas
        Raton raton1 = new Raton ("Raton", "Acer");
        Raton raton2 = new Raton ("Raton", "HP");
        Raton raton3 = new Raton ("Raton", "Logitech");

        //Creamos teclados diferentes marcas
        Teclado teclado1 = new Teclado ("KeyBoad", "Microsoft");
        Teclado teclado2 = new Teclado ("KeyBoad", "HP");
        Teclado teclado3 = new Teclado ("KeyBoad", "IBM");

        //Creamos monitor
        Monitor monitor1 = new Monitor ("Acer", 10);
        Monitor monitor2 = new Monitor ("Acer", 20);
        Monitor monitor3 = new Monitor ("Acer", 30);

        //Creamos computadora
        Computadora computadora1 = new Computadora ("Descktop1", monitor1, teclado1, raton1);
        Computadora computadora2 = new Computadora ("Descktop2", monitor2, teclado2, raton2);
        Computadora computadora3 = new Computadora ("Descktop3", monitor3, teclado3, raton3);

        //Creamos la orden 1
        Orden orden1 = new Orden ();
        orden1.agregarOrden (computadora1);
        orden1.agregarOrden (computadora2);
        orden1.agregarOrden (computadora3);

        //Creamos Orden 2
        Orden orden2 = new Orden ();
        orden2.agregarOrden (computadora3);
        orden2.agregarOrden (computadora3);
        orden2.agregarOrden (computadora1);

        //Imprimir Orden 1
        orden1.mostrarOrden ();

        //Imprimir Orden 2
        orden2.mostrarOrden ();
    }
}
