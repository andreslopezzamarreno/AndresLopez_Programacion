import java.util.Scanner;

public class EjerciciosCondicionales1 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Introduce el primer numero: ");
        numero1 = in.nextInt();

        System.out.println("Introduce el segunod numero: ");
        numero2 = in.nextInt();

        if (numero1 == numero2){
            System.out.println("Los numeros son iguales");
        }
        else {
            System.out.println("El numero " + Math.max(numero1, numero2) + " el mayor ");
        }

        in.close();
    }
}
}
