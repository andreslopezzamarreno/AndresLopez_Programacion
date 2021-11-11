import java.util.Scanner;

public class CompararLogica {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);

        int numeroEntero = 0;
        int numeroReal = 0;

        System.out.println("Escribe el primer numero entero: (0-9)");
        numeroEntero = in.nextInt();

        System.out.println("Escribe el segundo numero real: (0-9)");
        numeroReal = in.nextInt();

        System.out.println("El primero es par y el segundo es impar: " + (numeroEntero %2==0 && numeroReal %2!=0));
        System.out.println("El primero es superior al doble del segundo e inferior a 8: " + (numeroEntero > 2*numeroReal && numeroEntero<8));
        System.out.println("Son iguales o la diferencia entre el primero y el segundo es menos que 2: "+ (numeroEntero == numeroReal || numeroEntero-numeroReal<2));

        in.close();
    }
}
