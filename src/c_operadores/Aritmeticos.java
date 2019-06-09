package c_operadores;

public class Aritmeticos {
    public static void main (String[] args){
        int a=3, b=2;
        
        int resultado = a + b;
        System.out.println ("resultado = " + resultado);
        System.out.println ("resultado = " + a + b);
        System.out.println ("resultado = " + (a + b));
        System.out.println (a + b + "resultado = ");

        resultado = a - b;
        System.out.println ("resultado resta= " + resultado);
        
        resultado = a * b; 
        System.out.println ("resultado multiplicacion= " + resultado);

        double resDivision = 3D / b;
        System.out.println ("resDivision = " + resDivision);
        
        int resModulo = a % b;
        System.out.println ("resModulo = " + resModulo);
        
        int z = 10 % 2;
        System.out.println ("z = " + z);

        if (z == 0)
            System.out.println ("El numero es PAR" );
        else
            System.out.println ("El numero es inpar" );
    }
}
