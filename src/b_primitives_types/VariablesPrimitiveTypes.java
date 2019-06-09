package b_primitives_types;

public class VariablesPrimitiveTypes {
    public static void main (String[] args){
        //byte, short, int, loong
        System.out.println ("bits tipo byte: " + Byte.SIZE);
        System.out.println ("bytes tipo byte: " + Byte.BYTES);
        System.out.println ("valor min tipo byte: " + Byte.MIN_VALUE );
        System.out.println ("valor max tipo byte: " + Byte.MAX_VALUE );
        System.out.println ( );
        System.out.println ("bits tipo short: " + Short.SIZE);
        System.out.println ("bytes tipo short: " + Short.BYTES);
        System.out.println ("valor min tipo short: " + Short.MIN_VALUE );
        System.out.println ("valor max tipo short: " + Short.MAX_VALUE );
        System.out.println ( );
        System.out.println ("bits typo int: " + Integer.SIZE);
        System.out.println ("bytes typo int: " + Integer.BYTES);
        System.out.println ("valor min tipo int: " + Integer.MIN_VALUE );
        System.out.println ("valor max tipo int: " + Integer.MAX_VALUE );
        System.out.println ( );
        System.out.println ("bits typo long: " + Long.SIZE);
        System.out.println ("bytes typo long: " + Long.BYTES);
        System.out.println ("valor min tipo long: " + Long.MIN_VALUE );
        System.out.println ("valor max tipo long: " + Long.MAX_VALUE );

        byte byteVar = 15;
        System.out.println ("byteVar = " + byteVar);
        short shortVar = 100;
        System.out.println ("shortVar = " + shortVar);
        int intVar = 500;
        System.out.println ("intVar = " + intVar);
        long longVar = 1000;
        System.out.println ("longVar = " + longVar);

        // definicion de variable tipo long
        //var numero = 10L
    }
}
