package x_matrices;

public class MatrizFor {
    public static void main(String[] args) {
        String nombres[][] = { {"Fabian", "Matias", "Emilce"}, {"Zabala", "Zabala", "Alvarez"}};

        System.out.println ("Largo Matriz renglones = " + nombres.length);
        System.out.println ("Largo Matriz filas = " + nombres[0].length);

        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++)
                System.out.println ("Matriz String indice: " + i + "-" + j + ": " + nombres[i][j]);
        }
    }
}
