package dowhile;

import java.util.Scanner;

public class MinimoComunMultiplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int mcm;
        int mult = 1;
        System.out.println("introduce dos numeros: ");
        System.out.println("Primero: ");
        numero1 = sc.nextInt();
        System.out.println("Segundo: ");
        numero2 = sc.nextInt();

        do {
            mcm = numero1 * mult;
            mult++;
        } while (mcm % numero2 != 0);

        System.out.println(mcm);
    }
}
