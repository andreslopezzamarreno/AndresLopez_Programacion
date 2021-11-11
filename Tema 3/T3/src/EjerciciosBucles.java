import java.util.Scanner;

public class EjerciciosBucles {
    // programa que tu introduces un numero y te dice si es par o impar, positivo o negativo y su cuadrado
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);

        int numero = 0;

        do {
            System.out.println("introduce un numero: ");
            numero = in.nextInt();

            if (numero %2==0) {
                System.out.println("El numero es par.");
            }
            else {
                System.out.println("El numero es impar. ");
            }
            if (numero>0 ) {
                System.out.println("El numero es positivo.");
            }
            else {
                System.out.println("El numero es negativo");
            }
            System.out.println("El cuadrado de " + numero + " es " + Math.pow(numero,2));

        }	while (numero != 0);

    }
}
