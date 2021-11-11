import java.util.Scanner;

public class CompararNumeros {
    public static void main(String args[]) {


        Scanner in = new Scanner (System.in);

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int suma = 0;

        System.out.println("Escribe el primer numero real: ");
        numero1 = in.nextInt();

        System.out.println("Escribe el segundo numero real: ");
        numero2 = in.nextInt();

        System.out.println("Escribe el tercer numero real: ");
        numero3 = in.nextInt();

        suma = numero1 + numero2;

        System.out.println("la suma de los dos primeros numeros es el tercero: " + (suma == numero3));

        in.close();
    }
}
