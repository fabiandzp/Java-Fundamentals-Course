package b_primitives_types;

public class Char {
    public static void main (String[] args){
        //char
        System.out.println ("bits tipo char: " + Character.SIZE);
        System.out.println ("bytes tipo char: " + Character.BYTES);
        System.out.println ("valor min tipo char: " + Character.MIN_VALUE );
        System.out.println ("valor max tipo char : " + Character.MAX_VALUE );
        System.out.println ( );

        // a diferencia de una cadena Char es tipo primitivo por eso se usa comilla simple
        // una cadena es un tipo object no es tipo primitivo se compone de un o mas caracteres minimo espacio maximo es rectangulo

        // Definicion de variables usando systemas unicode, deciaml
        char a = '!'; // tipo char van en comilla simple
        char b = '\u0021'; // unicode
        System.out.println ("b = " + b);

        char c = 33; //decimal
        System.out.println ("c = " + c);

    }
}
