import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int numero = 0;
        int num_secreto = (int) Math.floor(Math.random() * 11);
        int intentos = 0;

        do {
            System.out.println("Adivina el numero(1-11):  ");
            numero = in.nextInt();
            intentos ++;

            if (numero == num_secreto) {
                System.out.println("¡HAS ACERTADO!");
            } else if (numero == -1) {
                System.out.println("Te has rendido. Era el " + num_secreto);
            } else if (num_secreto > numero) {
                System.out.println("Has fallado, el numero secreto es mayor ");
            } else if (num_secreto < numero) {
                System.out.println("Has fallado, el numero secreto es menor ");

            }
        } while (numero != num_secreto && numero != -1);
        System.out.println("Numero de intentos: " + intentos);

        in.close();

    }
}
