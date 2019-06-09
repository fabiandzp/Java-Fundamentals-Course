package t_sobrecarg_Metodos;

public class Operaciones {

    //Metodo sumar
    public static int sumar(int a, int b){
        System.out.println (" Metodo int int");
        return a + b;
    }

    public static double sumar(double a, double b){
        System.out.println ("Metodo double double" );
        return a + b;
    }

    public static double sumar(int a, double b){
        System.out.println ("Metodo int double" );
        return a + b;
    }

    public static double sumar(double a, int b){
        System.out.println ("Metodo double int  " );
        return a + b;
    }



}
