package e_calses;

public class PersonaPrueba {
    public static void main(String[] args) {

        // Creacion de objeto o instanciar clase
        Persona persona1 = new Persona ();

        //llamado a un metodo del objeto creado
        System.out.println ("Valores por defecto del objeto Persona" );
        persona1.desplegarNombre ();

        //modificar valores al objeto creado
        persona1.nombre = "Fabian";
        persona1.apellidoMaterno = "Par";
        persona1.apellidoPaterno = "Zab";

        //llamado a un metodo del objeto creado
        System.out.println ("\nNuevos valores del objeto persona1" );
        persona1.desplegarNombre ();

        //nevo objeto persona2
        Persona persona2 = new Persona ();
        System.out.println ("\nValores por objeto Person2" );
        persona2.nombre = "Dan";
        persona2.desplegarNombre ();
    }
}
