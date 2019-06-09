package z_final_lab.com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclados;
    }


    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    @Override
    public String toString() {
        return  super.toString () +
                "Teclado{" +
                "idTeclado=" + idTeclado +
                '}';
    }
}
