import java.util.Scanner;

public class MetodoScanner {
    public static void main(String args[]) {
        Scanner in = new Scanner (System.in);

        String nombre = "";

        System.out.println("Introducir nombre : ");
        nombre = in.nextLine();
        in.close();


        SaludarPersona(nombre);


    }
    public static void SaludarPersona(String elNombre) {

        System.out.println("Hola " + elNombre);


    }
}
