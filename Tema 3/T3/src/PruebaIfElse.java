import java.util.Scanner;

public class PruebaIfElse {
    public static void main(String args[]) {

        //Ejercicio que pide al usuario un numero entero y dice si es par o impar utilizando bucle if.

        Scanner in = new Scanner  (System.in);

        int valor = 0;
        System.out.println("Introduce un valor entero: ");
        valor = in.nextInt();

        if (valor %2==0) {
            System.out.println("El numero " + valor + " es par ");
        }
        else {
            System.out.println("El numero " + valor + " es impar ");
        }

        in.close();

    }
}
