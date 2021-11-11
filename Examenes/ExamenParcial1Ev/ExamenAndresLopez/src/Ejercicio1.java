import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char opcion = 1;
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 1;

        while (opcion != 0) {
            System.out.println("¿Que quieres hacer?");
            System.out.println("a. Suma \nb. Potencia\nc. Tablas de multiplicar");
            opcion = sc.next().charAt(0);
            if (opcion == 'a') {
                System.out.println("Primer sumando: ");
                numero1 = sc.nextInt();
                System.out.println("Segundo sumando: ");
                numero2 = sc.nextInt();
                resultado = numero1 + numero2;
                System.out.println("El resultado es " + resultado);
            } else if (opcion == 'b') {
                numero1 = 0;
                numero2 = 0;
                resultado = 1;
                System.out.println("Introducir Base");
                numero1 = sc.nextInt();
                System.out.println("Introducir Exponente");
                numero2 = sc.nextInt();
                for (int i = 0; i < numero2; i++) {
                    resultado = resultado * numero1;
                }
                System.out.println("El resultado de la potencia es " + resultado);

            } else if (opcion == 'c') {
                numero1 = 0;
                numero2 = 0;
                for (int i = 0; i < 11; i++) {
                    for (int j = 0; j < 11; j++) {
                        System.out.println(numero1 + "X" + numero2 + " = " + (numero1 * numero2));
                        numero2++;
                    }
                    numero2 = 0;
                    numero1++;
                }

            }
            System.out.println();
        }

    }
}
