import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Colecciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //lista de cualquier cosa > OBJECT
        ArrayList listaCosas = new ArrayList();

        //para poder saber su tamaño
        listaCosas.add(5);
        int tamanio = listaCosas.size();
        System.out.println(tamanio);

        System.out.println(listaCosas);
        listaCosas.add("Andrés");

        //castear cualquier tipo de dato a String
        String palabra = String.valueOf(listaCosas.get(1));
        System.out.println("El valor es: " + palabra);

        listaCosas.add(true);
        listaCosas.add(6);
        listaCosas.add(9);
        listaCosas.add(6);
        listaCosas.add("casa");
        listaCosas.add('a');
        listaCosas.add(6);
        listaCosas.add(324);
        listaCosas.add(6);
        listaCosas.add("portatil");
        listaCosas.add(6);

        //sacar los elementos del ArrayList en vertical
        // con for
        for (int i = 0; i < listaCosas.size(); i++) {
            System.out.println(i + 1 + ". " + listaCosas.get(i));
        }

        System.out.println();

        //con foreach
       /* int pos = 1;
        for (Object item : listaCosas) {
            System.out.println(pos + " - " + item);
            pos++;
        }

        //buscar dentro de una lista la palabra en concreto
        //for
        for (int i = 0; i < listaCosas.size(); i++) {
            if (listaCosas.get(i).equals("casa")) {
                System.out.println("Palabra encontrada. Esta en la posicion " + i);
            }
        }
        //foreach
        pos = 0;
        for (Object item : listaCosas) {
            if (item.equals("casa")) {
                System.out.print("Palabra encontrada. ");
                System.out.println("En la posicion " + pos);
            }
            pos++;
        }
        //otra posibilidad para buscar una palabra en concreto
        int posElemento = listaCosas.indexOf("casa");
        if(posElemento>-1){
            System.out.print("Palabra encontrada ");
            System.out.println("en la posicion " + posElemento);
        }

        //pedir por consola una palabra a buscar
        System.out.println("Busca una palabra ");
        Object element = sc.next();
        int posElement = listaCosas.indexOf(element);
        if (posElement > -1) {
            System.out.println("Por qué palabra quieres cambiar " + element);
            Object newElement = sc.next();
            listaCosas.set(posElement, newElement);
        }else{
            System.out.println("la palabra " + element + " no esta. la añado al Arraylist");
            listaCosas.add(element);
        }
        System.out.println(listaCosas);*/

        System.out.println("El tamaño actual es de " + listaCosas.size());
        /*for (int i = 0; i < listaCosas.size(); i++) {
            if (listaCosas.get(i) instanceof Integer) {
                //solo cuando sea numero se metera en el if
                if ((int) listaCosas.get(i) == 6) {
                    listaCosas.remove(i);
                }
            }
        }*/
        listaCosas.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer o) {
                return o.equals(6);
            }
        });
        System.out.println("El tamaño actual es de " + listaCosas.size());
        System.out.println(listaCosas);
    }
}
