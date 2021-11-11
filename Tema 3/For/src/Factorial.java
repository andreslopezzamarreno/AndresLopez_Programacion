import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int factorial=1;
        int veces;

        System.out.println("Calcula factorial de:");
        numero = sc.nextInt();

        veces = numero;
        for (int i = 0; i < veces; i++) {

            factorial = factorial * numero;
            numero--;

        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }

}
