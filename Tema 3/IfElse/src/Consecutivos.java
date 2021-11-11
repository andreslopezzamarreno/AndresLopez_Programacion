package ifelse;

import java.util.Scanner;

public class Consecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        System.out.println("Introduce 3 numeros enteros");
        System.out.println("El primero:");
        numero1 = sc.nextInt();
        System.out.println("El segundo:");
        numero2 = sc.nextInt();
        System.out.println("El tercero:");
        numero3 = sc.nextInt();

        if (numero2 == (numero1+1)) {
            if (numero3 == (numero2+1)) {
                System.out.println("Los numeros son consecutivos");
            }else{
                System.out.println("Los numeros no sos consecutivos ");
            }
        }else {
            System.out.println("Los numeros no sos consecutivos ");
        }
    }
}
