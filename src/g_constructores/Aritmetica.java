package g_constructores;

public class Aritmetica {

    //Atributos
    int a;
    int b;

    //constructor vacio de la clase
    Aritmetica (){
    }

    //Constructor con dos argumentos
    Aritmetica (int arg1, int arg2){
        a = arg1;
        b = arg2;
    }

    // Este Metodo sumar toma los vatributos  de la clase
    int sumar (){
        return a + b;
    }

}
