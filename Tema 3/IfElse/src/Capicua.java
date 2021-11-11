package ifelse;

import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un numero de 4 digitos");
        numero = sc.nextInt();

        if (numero <= 999 || numero > 9999) {
            System.out.println("El numero no tiene 4 digitos");
        } else if (numero / 1000 == numero % 10 && numero / 100 % 10 == numero / 10 % 10) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }
    }
}
