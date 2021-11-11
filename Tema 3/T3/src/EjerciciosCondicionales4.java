import java.util.Scanner;

public class EjerciciosCondicionales4 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);

        int numero = 0;
        int primernumero = 0;
        int tercernumero = 0;

        System.out.println("Introduce un numero: ");
        numero = in.nextInt();

        primernumero = numero/100;
        tercernumero = numero%10;

        if (primernumero==tercernumero) {
            System.out.println("El numero es capicua");
        }
        else {
            System.out.println("El numero no es capicua");
        }

        in.close();
    }

}
