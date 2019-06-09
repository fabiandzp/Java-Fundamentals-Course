package h_alcance_variables_this;

public class Aritmetica {

    //Attributes
    int a;
    int b;

    //constructor empty of the class
    Aritmetica (){
    }

    //Constructor con dos argumentos
    Aritmetica (int a, int b){
        this.a = a;
        this.b = b;
    }

    // Este Metodo sumar toma los vatributos  de la clase
    int sumar (){
        return a + b;
    }

    // Este Metodo restar toma los vatributos  de la clase
    int restar (){ return a - b;  }

    // Este Metodo multiplicar toma los vatributos  de la clase
    int multiplicar (){ return a * b; }

    // Este Metodo dividir toma los vatributos  de la clase
    int dividir (){ return a / b; }

}
