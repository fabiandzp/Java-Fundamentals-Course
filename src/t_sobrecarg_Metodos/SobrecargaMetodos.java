package t_sobrecarg_Metodos;

public class SobrecargaMetodos {
    public static void main(String[] args) {
        System.out.println ("Resultado 1: " + Operaciones.sumar (3, 5) );
        System.out.println ("Resultado 2: " + Operaciones.sumar (3, 9.1) );
        System.out.println ("Resultado 3: " + Operaciones.sumar (3.1, 5L) );
        System.out.println ("Resultado 4: " + Operaciones.sumar (3.2, 5.5) );
    }
}
