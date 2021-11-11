import java.util.Scanner;

public class EjerciciosCondicionales2 {
    public static void main (String argz[]) {
        Scanner in = new Scanner(System.in);

        double numero = 0.0;

        System.out.println("Introduce un numero con decimales: ");
        numero = in.nextDouble();

        if (numero < 1 && numero>-1 && numero!=0) {
            System.out.println("El numero es casi cero ");
        }
        else {
            System.out.println("El numero no se acerca a cero ");
        }

        in.close();
    }
}
