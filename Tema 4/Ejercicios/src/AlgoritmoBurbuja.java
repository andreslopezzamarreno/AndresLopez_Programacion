import java.util.Scanner;

public class AlgoritmoBurbuja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la longitud del array");
        int longitud = sc.nextInt();
        int[] enteros = new int[longitud];
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Introduce el valor de la posicion " + i);
            enteros[i] = sc.nextInt();
        }
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud-1; j++) {
                if (enteros[j]>enteros[j+1]){
                    int cambio = enteros[j];
                    enteros[j] = enteros[j+1];
                    enteros[j+1] = cambio;
                }
            }
            longitud--;
        }

        for (int item :enteros ) {
            System.out.println(item);
        }
    }
}
