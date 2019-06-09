package a_variables;

import java.util.Scanner;

public class ScannerTest {
    public  static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Digita tu nombre: ");
        String usuario = scanner.nextLine ();
        String saludar = "Saludos";
        System.out.println (saludar + " " + usuario);
    }
}
