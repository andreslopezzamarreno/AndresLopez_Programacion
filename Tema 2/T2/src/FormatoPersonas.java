import java.util.Scanner;

public class FormatoPersonas {
    public static void main(String args[]) {

        Scanner in = new Scanner (System.in);

        //declaracion de variables
        String nombre = "";
        double altura = 0.0;
        int edad = 0;
        boolean carnet = false;
        char dni = '\0';

        //datos del usuario
        System.out.println("Introduzca su nombre: ");
        nombre = in.nextLine();

        System.out.println("introduzca su altura: ");
        altura = in.nextDouble();

        System.out.println("Introduzca su edad: ");
        edad = in.nextInt();

        System.out.println("Tiene carnet de conducir: ");
        carnet = in.nextBoolean();

        System.out.println("Introduzca su letra de DNI ");
        dni = in.next().charAt(0);

        //mostrar en pantalla, cada \t añade un tabulador entre palabra y palabra
        System.out.println("NOMBRE \t\t\t\tEDAD \t\t\t\tALTURA \t\t\t\tCARNET \t\t\t\tLETRA");
        System.out.println(nombre + "\t\t\t\t" + altura + "\t\t\t\t" + edad + "\t\t\t\t" + carnet + "\t\t\t\t" + dni);

        in.close();


    }
}
