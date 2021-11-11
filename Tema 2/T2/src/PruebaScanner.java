import java.util.Scanner;

public class PruebaScanner {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);

        //variables
        String nombre = "";
        int  edad = 0;

        System.out.println("Dime tu nombre: ");
        nombre = in.nextLine();

        System.out.println("Dime tu edad. ");
        edad = in.nextInt();

        System.out.println(nombre + ", has vivido: " + edad * 365 + " dias");

        in.close();
    }
}
