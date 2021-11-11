import java.util.Scanner;

public class MetodoSuma {
    public static void main(String args[]) {

        Scanner in = new Scanner (System.in);

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Introducir numero : ");
        numero1 = in.nextInt();
        System.out.println("introducir segundo numero : ");
        numero2 = in.nextInt();

        in.close();

        int operacion = numero1 + numero2;

        suma(operacion);

    }
    public static void suma(int resultado) {

        System.out.println("El resultado es: " + resultado);
    }
}
