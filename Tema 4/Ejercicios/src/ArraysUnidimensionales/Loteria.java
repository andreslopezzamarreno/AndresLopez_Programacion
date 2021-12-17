package ArraysUnidimensionales;

import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeroIntro = new int[7];
        int[] boleto = new int[7];
        int suma = 0;

        for (int i = 0; i < boleto.length; i++) {
            boleto[i] = (int) (Math.random() * 10);
            System.out.print(boleto[i]);
        }
        System.out.println();
        for (int i = 0; i < numeroIntro.length; i++) {
            System.out.println("Introduce numero de la posicion " + i);
            numeroIntro[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            if (numeroIntro[i] == boleto[i]) {
                suma++;
            }
        }
        if (suma == 7) {
            System.out.println("Has ganado la loteria");
        } else {
            System.out.println("No has ganado la loteria");
        }
    }
}
