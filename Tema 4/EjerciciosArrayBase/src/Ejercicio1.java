import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int contador = -1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce numero ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            contador++;
            System.out.println(contador + ")" + numeros[i]);
        }
    }
}
