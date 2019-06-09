package g_constructores;

public class PruebaAritmetica {
    public static void main(String[] args) {

        //creamos un nuevo objeto de la calse aritmetica
        Aritmetica objeto1 = new Aritmetica ();

        //modifico los valores del objeto
        objeto1.a = 1;
        objeto1.b = 2;

        int result = objeto1.sumar ();
        System.out.println ("result = " + result);

        //creamos segundo objeto de tipo aritmetica
        Aritmetica objeto2 = new Aritmetica (2,4);
        System.out.println ("objeto2.sumar = " + objeto2.sumar ());



    }
}
