package o_null;

public class PalabraNull {
    public static void main(String[] args) {
        Persona persona1 = new Persona ("Juan");
        System.out.println ("persona1 = " + persona1.obtenerNombre());


        Persona persona2 = persona1;
        System.out.println ("persona2 = " + persona2.obtenerNombre ());

        persona1 = null;// varialbe candidata a ser eliminada por el recolector de basura
        System.gc (); // Metodo para Llamado al garbach colector, solo planifica5

        if (persona1 != null)
            System.out.println ("persona1 = " + persona1.obtenerNombre ());

    }
}

class Persona {
    String nombre;

    Persona(String nombre){
        this.nombre = nombre;
    }

    public String obtenerNombre (){
        return this.nombre;
    }
}
