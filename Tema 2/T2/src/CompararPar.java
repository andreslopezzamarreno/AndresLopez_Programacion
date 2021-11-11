import java.util.Scanner;

public class CompararPar {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);

        int numero = 0;

        System.out.println("Introduce un numero entero entre 1 y 100 ");
        numero = in.nextInt();

        System.out.println("Es numero PAR: " + (numero %2==0));
        System.out.println("Es mayor que 50: " + (numero>50));
        in.close();
    }
}
