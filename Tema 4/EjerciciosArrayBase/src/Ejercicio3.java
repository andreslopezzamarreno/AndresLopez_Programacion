import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosAleatorios = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce numero ");
            numerosAleatorios[i] = sc.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(numerosAleatorios[i]);

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
