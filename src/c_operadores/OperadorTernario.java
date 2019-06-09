package c_operadores;

public class OperadorTernario {
    public static void main (String[] args){
        int numero = 10;

        String resultado = (numero % 2 == 0) ? "Es numero par" : "Es numero Inpar";
        System.out.println ("resultado = " + resultado);

        boolean par = (numero % 2 ==0) ? true : false;
        if (par)
            System.out.println ("Numero par" );
        else
            System.out.println ("Numero inpar" );

    }

}
