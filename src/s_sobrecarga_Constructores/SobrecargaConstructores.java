package s_sobrecarga_Constructores;

public class SobrecargaConstructores {
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Fabian", 32);
        System.out.println ("persona1 = " + persona1);

        Empleado empleado1 = new Empleado ("Dany", 35, 1500);
        System.out.println ("empleado1 = " + empleado1);
    }
    

}
