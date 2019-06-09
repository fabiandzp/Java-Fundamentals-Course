package w_arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {

        //ARREGLOS TIPO PTIMITIVO
        int edades[];        //1. Declaracion arreglo de enteros
        edades = new int[4]; //2. Instanciacion arreglo de enteros
        edades[0] = 30;      //3. Inicializacion arreglo de enteros
        edades[1] = 15;
        edades[2] = 15;


        // 4. Leemos los valores de cada elmento del arreglo
        System.out.println ("Arreglo enteros indice 0 = " + edades[0]);
        System.out.println ("Arreglo enteros indice 1 = " + edades[1]);
        System.out.println ("Arreglo enteros indice 2 = " + edades[2]);
        System.out.println ("Arreglo enteros indice 3 = " + edades[3]);


        //ARREGLOS TIPO OBJECT
        Persona personas[];
        personas = new Persona[4];
        personas[0] = new Persona("Fabian");
        personas[1] = new Persona("Dany");


        System.out.println ("Arrgelo personas indice 0: " + personas[0] );
        System.out.println ("Arrgelo personas indice 1: " + personas[1] );
        System.out.println ("Arrgelo personas indice 1: " + personas[2] );

        //ARREGLO CON NOTACION SIMPLIFICADA
        String nombres[] = {"Fabian","Matias","Emilce"};
        //imprimir elementos de un arreglo
        for (int i = 0; i < nombres.length; i++){
            System.out.println ("Arrelgo nombres, indice " + i +": " + nombres[i]);
        }

        //ARREGLO CON NOTACION SIMPLIFICADA
        Persona peronas2[] = {new Persona("Fabian2"), new Persona ("Matias2"), new Persona ("Emilce2")};

        //imprimir elementos de un arreglo
        for (int i = 0; i < peronas2.length; i++){
            System.out.println ("Arrelgo nombres, indice " + i +": " + peronas2[i]);
        }
    }
}
