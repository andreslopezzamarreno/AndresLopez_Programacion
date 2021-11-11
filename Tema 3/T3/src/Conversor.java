import java.util.Scanner;

public class Conversor {
    public static void main(String args[]) {

        Scanner cantidad = new Scanner (System.in);

        //declaracion de variable
        double euros = 0.0;


        System.out.println("Introduzca los euros que quiere convertir: ");
        euros = cantidad.nextDouble();

        //conversion euro dolar
        double convdolares = euros * 1.16;
        System.out.println(euros + " euros son " + convdolares + " dolares.");

        //conversion euro libra
        double convlibras = euros * 0.85;
        System.out.println(euros + " euros son " + convlibras + " libras.");

        //conversion euro yenes
        double convyenes = euros * 128.91;

        System.out.println(euros + " euros son " + convyenes + " yenes.");

        cantidad.close();


    }
}
