package j_paso_por_referencia;

public class Persona {
    String nombre;

    public void cambiarNombre(String NuevoNombre){
        this.nombre = NuevoNombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }
}
