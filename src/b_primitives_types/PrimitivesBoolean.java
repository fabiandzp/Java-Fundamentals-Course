package b_primitives_types;

public class PrimitivesBoolean {
    public static void main (String[] args){
        //boolean
        // El tamano de una variable tipo boolean depende de la plataforma donde se este ejecutando el codigo
        //System.out.println ("bits tipo boolean: " + Boolean.SIZE);
        //System.out.println ("bytes tipo boolean: " + Boolean.BYTES);
        System.out.println ("valor min tipo boolean: " + Boolean.TRUE);
        System.out.println ("valor max tipo boolean : " + Boolean.FALSE);

        boolean boolVar = false;

        if (boolVar)
            System.out.println ("La variable contiene un valor verdadero");
        else
            System.out.println ("La variable contiene un valor falso");

        System.out.println ();

        int edad = 10;
        boolean adulto = edad >= 18;
        if (adulto)
            System.out.println ("Esres mayor de edad puedes pasar");
        else
            System.out.println ("Eres menor de edad no puedes pasar");

    }
}
