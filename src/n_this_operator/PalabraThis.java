package n_this_operator;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona ("Juan");
    }
}

class Persona{
    String nombre;

    Persona(String nombre){
        this.nombre = nombre; //this apunta a objeto persona

        //imprimir el objeto persona
        Imprimir imprimir = new Imprimir ();
        imprimir.imprimir (this);//this contiene una referencia al objeto persona
    }
}

class Imprimir{
    public void imprimir(Persona p){
        System.out.println ("Impresion argumento: = " + p); //imprimiendo el valor del objeto persona
        System.out.println ("impresion objeto actual (this) = " + this); // apunta aun obkjeto de tipo imprinmir
    }
}
