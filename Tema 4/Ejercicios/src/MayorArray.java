import java.util.Scanner;

public class MayorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -999999999;
        int min = 999999999;
        int longitud;
        System.out.println("Que longitud quieres que tenga el Array");
        longitud = sc.nextInt();

        int[] enteros = new int[longitud];

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Introduce valor para la posicion " + i);
            enteros[i] = sc.nextInt();
        }
        for (int i = 0; i < enteros.length; i++) {

        }
    }
}
