package i_Paso_por_Valor;

public class PasoPorValor {
    public static void main(String[] args) {
        int x = 10;
        imprimir(x);
        cambiarValor(x);
        x = 15;
        imprimir(x);
    }

    public static void imprimir (int arg){
        System.out.println ("arg = " + arg);
    }

    public static void cambiarValor(int i) {
        i = 200;
    }
}
