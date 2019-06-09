package h_alcance_variables_this;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //variables locales
        int operandoA = 6;
        int operandoB = 7;

        //Creamos un objeto de la Classe Aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica (operandoA, operandoB);


        //Imprimimos operandos
        System.out.println ("operandoA = " + operandoA);
        System.out.println ("operandoB = " + operandoB);

        //Imprimimos resultados de la suma
        System.out.println ("\nResultado suma " + objeto1.sumar ());
        //Imprimimos resultados de la resta
        System.out.println ("\nResultado resta " + objeto1.restar ());
        //Imprime resultados de la multiplicacion
        System.out.println ("\nResultado multiplicaicon " + objeto1.multiplicar ());
        //Imprimimos resultados de la division
        System.out.println ("\nResultado dividir " + objeto1.dividir ());

    }
}
