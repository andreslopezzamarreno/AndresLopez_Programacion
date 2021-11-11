package ifelse;

import java.util.Scanner;

public class Inversos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        double inv1;
        double inv2;
        double inv3;
        double suma;

        System.out.println("Introduce 3 numeros ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        numero3 = sc.nextInt();

        if (numero1 < -100 || numero1 > 100 && numero2 < -100 || numero2 > 100 && numero3 < -100 || numero3 > 100) {
            System.out.println("Algun numero no esta entre -100 y 100");

        } else {
            if (numero1 != 0 && numero2 != 0 && numero3 != 0) {
                inv1 = 1 / (double) numero1;
                inv2 = 1 / (double) numero2;
                inv3 = 1 / (double) numero3;

                suma = inv1 + inv2 + inv3;
                System.out.printf("La suma de los inversos es: %.5f%n", suma);
            } else if (numero1 == 0 && numero2 != 0 && numero3 != 0) {
                inv2 = 1 / (double) numero2;
                inv3 = 1 / (double) numero3;

                suma = inv2 + inv3;
                System.out.printf("La suma de los inversos es: %.5f%n", suma);
            } else if (numero2 == 0 && numero1 != 0 && numero3 != 0) {
                inv1 = 1 / (double) numero1;
                inv3 = 1 / (double) numero3;

                suma = inv1 + inv3;
                System.out.printf("La suma de los inversos es: %.5f%n", suma);
            } else if (numero3 == 0 && numero2 != 0 && numero1 != 0) {
                inv1 = 1 / (double) numero1;
                inv2 = 1 / (double) numero2;

                suma = inv1 + inv2;
                System.out.printf("La suma de los inversos es: %.5f%n", suma);
            } else if (numero1 == 0 && numero2 == 0 && numero3 != 0) {
                inv3 = 1 / (double) numero3;
                System.out.printf("La suma de los inversos es: %.5f%n", inv3);
            } else if (numero1 == 0 && numero3 == 0 && numero2 != 0) {
                inv2 = 1 / (double) numero2;
                System.out.printf("La suma de los inversos es: %.5f%n", inv2);
            } else if (numero2 == 0 && numero3 == 0 && numero1 != 0) {
                inv1 = 1 / (double) numero1;
                System.out.printf("La suma de los inversos es: %.5f%n", inv1);
            } else {
                System.out.println("Todos los numeros son 0 la suma es 0");
            }
        }
    }
}
