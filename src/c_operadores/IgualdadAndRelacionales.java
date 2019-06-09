package c_operadores;

import org.w3c.dom.Element;

public class IgualdadAndRelacionales {
    public static void main (String[] arg){
        int a = 3;
        int b = 2;
        boolean c = (a == b); //operador de igualdad
        boolean z = (a != b); //operador de desigualdad
        System.out.println ("c = " + c);
        System.out.println ("c = " + z);


        // para comparar strings - METODO equals
        String d = "hola", e = "hola";
        boolean f = d.equals (e);
        System.out.println ("f = " + f);


        boolean g = (a > b);
        System.out.println ("g = " + g);

        boolean r = (a >= b);
        System.out.println ("r = " + r);

        if (a % 2 == 0)
            System.out.println ("NUMERO ES PAR" );
        else
            System.out.println ("NUMERO ES INPAR" );

    }
}
