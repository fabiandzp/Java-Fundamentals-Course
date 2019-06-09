package c_operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = ++x + y--;
        System.out.println ("x = " + x);
        System.out.println ("y = " + y);
        System.out.println ("z = " + z);

        System.out.println ("Precedecia de operadores" );
        int res = 4 + 5 * 6 / 3; //4+(5*6)/3 => 4+30/3 => 4+10 => 14
        System.out.println ("res = " + res);

        res = (4+5) *  (6/3);
        System.out.println ("res = " + res);
    }
}
