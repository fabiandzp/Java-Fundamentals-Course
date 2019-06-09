package d_sentencias_de_control;

public class Switch {
    public static void main(String[] args){
        int numero = 7;

        switch (numero) {
            case 1:
                System.out.println ("numero 1");
                break;

            case 2:
                System.out.println ("numero 2");
                break;
            case 3:
                System.out.println ("numero 3");
                break;
            default:
                System.out.println ("Otro numero");
                break;
        }
    }
}
