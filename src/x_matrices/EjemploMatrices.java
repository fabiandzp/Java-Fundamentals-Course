package x_matrices;

public class EjemploMatrices {
    public static void main(String[] args) {
        int edades[][];
        edades = new int[3][2];
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        System.out.println ("edades = " + edades[0][0]);
        System.out.println ("edades = " + edades[0][1]);
        System.out.println ("edades = " + edades[1][0]);
        System.out.println ("edades = " + edades[1][1]);
        System.out.println ("edades = " + edades[2][0]);
        System.out.println ("edades = " + edades[2][1]);


        //1. Declarar e instanciar matriz tipo Object
        Persona personas [][] = new Persona[1][2];
        //2. Inicializacion de valores
        personas[0][0] = new Persona ("Fabian");
        personas[0][1] = new Persona ("Dany");

        //3. Imprimir valores de la matriz Object
        System.out.println ("Matriz persona indice [0][0] = " + personas[0][0]);
        System.out.println ("Matriz persona indice [0][1] = " + personas[0][1]);

        System.out.println ("");

        for (int i = 0; i < personas.length; i++){
            for (int j = 0; j < personas[i].length; j++){
                System.out.println ("Matriz persona indice " + i + "-" +  j + ": " + personas[i][j]);
            }
        }


    }
}
