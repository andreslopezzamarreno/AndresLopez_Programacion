package baseHashtable;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Scanner;

public class EjercicioBase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, Object[]> listaCoches = new Hashtable();
        String busqueda;

        Object[] coche = new Object[]{"2344hme", "Audi", "A4", 30000};
        listaCoches.put(coche[0].toString(), coche);

        listaCoches.put("2345hpe", new Object[]{"2345hpe", "mercedes", "c220", 28000});
        listaCoches.put("2347hwe", new Object[]{"2347hwe", "seat", "ibiza", 15000});

        //pedir matricula por teclado y sacar todos los datos por teclado
        System.out.println("Introduce matricula");
        busqueda = sc.next();

        Object[] cocheBuscado = listaCoches.get(busqueda);

        if (cocheBuscado != null) {
            for (Object item : cocheBuscado) {
                System.out.println(item);
            }
        } else {
            System.out.println("Coche no encontrado");
        }

        /*Enumeration<String> listaClaves = listaCoches.keys();

        while (listaClaves.hasMoreElements()) {

            String clave = listaClaves.nextElement();
            Object[] elemento = listaCoches.get(clave);

            for (Object item :elemento) {
                System.out.println(item);
            }
        }*/

        Enumeration<Object[]> listaCochesEnum = listaCoches.elements();

        while(listaCochesEnum.hasMoreElements()){
            Object[] cocheActual = listaCochesEnum.nextElement();
            for (Object item :cocheActual) {
                System.out.println(item);
            }
        }



    }
}
