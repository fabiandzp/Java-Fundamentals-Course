package r_herencia;

import java.util.Date;

public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado ("Fabian", 980000);

        empleado1.setEdad (32);
        empleado1.setGenero ('M');
        empleado1.setDireccion ("AK 40 N 25B");
        System.out.println ("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente (new Date (), true);
        cliente1.setNombre ("Dany");
        cliente1.setEdad (23);
        cliente1.setGenero ('M');
        cliente1.setDireccion ("Bla Bla");
        System.out.println ("cliente1 = " + cliente1);
    }


}
