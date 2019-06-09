package p_encapsulamiento;

public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Fabian", "Zabala", true);
        System.out.println ("Nombre = " + persona1.getNombre ());
        persona1.setNombre ("Dany");
        System.out.println ("Nombre = " + persona1.getNombre ());

        //imprime estado del objeto con el metodo por defecto toString
        //Metodo println en automatico llama al metodo toString
        System.out.println (persona1);

        persona1.setBorrado (false);

        System.out.println (persona1);


    }
}
