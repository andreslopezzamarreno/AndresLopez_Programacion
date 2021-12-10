import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();

        int suma = 0;
        int media;
        int maximo = -1;
        int minimo = 101;

        for (int i = 0; i < 10; i++) {
            numeros.add((int)(Math.random()*101));
        }

        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
            if (numeros.get(i)>maximo){
                maximo = numeros.get(i);
            }
            if (numeros.get(i)<minimo){
                minimo = numeros.get(i);
            }
        }
        media = suma/10;


        System.out.println(numeros);
        System.out.println("la suma de todos los numeros es: " + suma);
        System.out.println("la media de todos los numeros es: " + media);
        System.out.println("El numero mas grande es: " + maximo);
        System.out.println("El numero mas pequeño es: " + minimo);

    }
}
