package j_paso_por_referencia;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona p = new Persona ();
        p.cambiarNombre ("Fabian");

        imprimirNombre(p);
        modificarpersona(p);
        imprimirNombre(p);
    }

    public static void imprimirNombre(Persona p1){
        System.out.println ("VALOR RECIBIDO = " + p1.obtenerNombre ());
    }

    public static void modificarpersona(Persona arg){
        arg.cambiarNombre ("Dany");
    }
}
