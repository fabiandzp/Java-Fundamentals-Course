package c_operadores;

public class OperadoresCondicionales {
    public static void main (String[] args){
        int a = 3;
        int valorMinimo = 0, valorMaximo = 10;
        boolean res = a >= valorMinimo && a <= valorMaximo;
        System.out.println ("res = " + res);

        if (a >= valorMinimo && a <= valorMaximo)
            System.out.println ("dentro de rango");
        else
            System.out.println ("fuerda de rango");

        boolean vacaciones = false;
        boolean diaDescanso = false;

        if (vacaciones || diaDescanso)
            System.out.println ("puede asistir al juego");
        else
            System.out.println ("padre ocupado");


    }
}
