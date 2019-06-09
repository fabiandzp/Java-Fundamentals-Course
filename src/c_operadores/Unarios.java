package c_operadores;

public class Unarios {
    public static void main (String[] args){
        int a = 3;
        int b = -a;
        System.out.println ("b = " + b);

        boolean c = true;
        boolean d = !c;
        System.out.println ("d = " + d);

        //pre-incremento
        int e = 3;
        int f = e++;
        System.out.println ("e = " + e);
        System.out.println ("f = " + f);

        //- post-incremento
        int g = 3;
        int h = ++g;
        System.out.println ("g = " + g);
        System.out.println ("h = " + h);



    }
}
