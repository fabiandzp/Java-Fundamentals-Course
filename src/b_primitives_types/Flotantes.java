package b_primitives_types;

import com.sun.java.browser.plugin2.DOM;

import java.util.zip.DeflaterOutputStream;

public class Flotantes {
    public static void main (String[] args){
        //float, double
        System.out.println ("bits tipo float: " + Float.SIZE);
        System.out.println ("bytes tipo float: " + Float.BYTES);
        System.out.println ("valor min tipo float: " + Float.MIN_VALUE );
        System.out.println ("valor max tipo float : " + Float.MAX_VALUE );
        System.out.println ( );

        System.out.println ("bits tipo double: " + Double.SIZE);
        System.out.println ("bytes tipo double: " + Double.BYTES);
        System.out.println ("valor min tipo double: " + Double.MIN_VALUE );
        System.out.println ("valor max tipo double : " + Double.MAX_VALUE );
        System.out.println ( );

        float floatVar = 0.5F;    // con el literal F podemos asignar valor flotante a var tipo flotante
        float floatVar2 = .5F;    // con el literal F podemos asignar valor flotante a var tipo flotante
        double doubleVar = 0.10D; // con el literal D indicamos que es tipo double
    }
}
