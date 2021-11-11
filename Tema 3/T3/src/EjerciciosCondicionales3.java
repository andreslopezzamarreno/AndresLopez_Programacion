import java.util.Scanner;

public class EjerciciosCondicionales3 {

    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);

        double nota = 0.0;

        System.out.println("Introducir calificacion: ");
        nota = in.nextDouble();

        if (nota<5 && nota>0) {
            System.out.println("Insuficiente");
        }
        else if (nota<0) {
            System.out.println("nota no valida");
        }
        else if (nota<=6.99) {
            System.out.println("bien");
        }
        else if (nota<=8.99) {
            System.out.println("Notable");
        }
        else if (nota>=9 && nota<10) {
            System.out.println("Sobresaliente");
        }
        else if (nota>10){
            System.out.println("Nota no valida");
        }

        in.close();

    }
}
