package dowhile;

import java.util.Scanner;

public class BinarioOctalHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String binario = "";
        String octal = "";
        System.out.println("Introduce numero entero: ");
        numero = sc.nextInt();

        int numb = numero;
        int numo = numero;


        do {
            binario = (numb % 2) + binario;
            numb /= 2;
        } while (numb != 0);

        do {
            octal = numo % 8 + octal;
            if ((numo % 8) < 8) {
                numo /= 8;
            } else {
                octal = numo % 8 + octal;
                numo /= 16;
            }
        } while (numo != 0);

        System.out.println(binario);
        System.out.println(octal);
    }
}
