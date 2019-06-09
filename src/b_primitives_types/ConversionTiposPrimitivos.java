package b_primitives_types;

import java.awt.*;
import java.util.Scanner;

public class ConversionTiposPrimitivos {
    public static void main (String[] args){
        // de String a Int
        int edad = Integer.parseInt ("20");
        System.out.println ("edad = " + edad);

        // de Sring a boolean
        double valorPi = Double.parseDouble ("3.14");
        System.out.println ("valorPi = " + valorPi);

        //string a char, char solo almacena un caracter, este metodo permite selecionar uno de los caracteres para asignarlo a la variable typo char
        char c = "Fabian".charAt (2);
        System.out.println ("c = " + c);


        // Metodo scanner con .nextline devuelve String y se convierte a entero
        Scanner scanner = new Scanner (System.in);
        int edadFab = Integer.parseInt (scanner.nextLine ());
        System.out.println ("edad = " + edadFab);

        double precio = Double.parseDouble (scanner.nextLine ());
        boolean envioGratuito = Boolean.parseBoolean (scanner.nextLine());



        // de String a caracter soleccionando solo un carater de la cadena
        char caracter = scanner.nextLine().charAt(1);
        System.out.println ("caracter = " + caracter);

        // asignar entero a una variable string
        String edadTexto = String.valueOf (30);
        System.out.println ("edadTexto = " + edadTexto);

        // asignar un valor, concatenar con comillas para convertir en cadena
        String valorPiTexto = "" + valorPi;
        System.out.println ("valorPiTexto = " + valorPiTexto);

        byte b = 10;
        short s = b;

        // casting
        short s2 = 15;
        byte b2 = (byte) (s2 + 1);


    }
}
