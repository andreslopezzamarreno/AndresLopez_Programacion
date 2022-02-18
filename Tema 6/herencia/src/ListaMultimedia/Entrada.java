package ListaMultimedia;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        ArrayList<Elemento> listaElementos = new ArrayList<>();
        Libro libro = new Libro("1", "titulo libro", "juan rodriguez", "100", "digital", 580, 456);
        Elemento libro2 = new Libro("5", "titulo libro 2", "alberto sanchez", "300", "digital", 120, 9032);

        listaElementos.add(libro);
        listaElementos.add(libro2);

        for (Elemento item: listaElementos) {
            item.mostrarDatos();
            System.out.println();
        }

        System.out.println(libro.getClass());
        System.out.println(libro.getClass().getName());
        System.out.println(libro.getClass().getCanonicalName());
        System.out.println(libro instanceof Libro);//true
        System.out.println(libro2 instanceof Libro);//true



    }
}
