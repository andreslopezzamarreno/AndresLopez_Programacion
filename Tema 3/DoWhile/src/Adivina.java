
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char jugar;
        int intentos = 0;
        int numero;
        int numAleatorio;
        int record = 9999;

        do {
            numAleatorio = (int) Math.floor(Math.random() * 20);
            do {
                intentos++;
                System.out.println("Introduce numero: ");
                numero = sc.nextInt();
                if (numero != numAleatorio) {
                    System.out.println("Lo siento has fallado:");
                } else {
                    System.out.println("HAS ACERTADO ");
                }
            } while (numero != numAleatorio);

            System.out.println("Has acertado el numero en " + intentos + " intentos");

            if (intentos < record) {
                record = intentos;
                System.out.println("Has superado el record de intentos");
            } else {
                System.out.println("No has superado el numero de intentos");
            }

            System.out.println("¿Quieres volver a jugar?(S/N)");
            jugar = sc.next().charAt(0);

            intentos = 0;

        } while (jugar == 's' || jugar == 'S');
    }
}
