package z_final_lab.com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarOrden(Computadora computadora){
        //si max_computadoras < a max
        if (contadorComputadoras < MAX_COMPUTADORAS){
            // se agrega computadora al arreglo y se incrementa en 1
            computadoras[contadorComputadoras++] = computadora;
        }
        else {
            System.out.println ("Se ha alcanzado el maximo de computadoras en la orden: " + MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden(){
        System.out.println ("Orden # : " + idOrden);
        for (int i=0; i < contadorComputadoras; i++){
            System.out.println (computadoras[i]);
        }
    }

}
