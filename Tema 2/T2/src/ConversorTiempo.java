import java.util.Scanner;

public class ConversorTiempo {
    public static void main(String args[]) {

        Scanner in = new Scanner (System.in);

        //declaracion de variables
        int segundos = 0;
        int horas = 0;
        int minutos = 0;


        System.out.println("Introduce el numero de segundos: ");
        segundos = in.nextInt();

        //operaciones
        horas = segundos / 3600;
        segundos = segundos % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;

        //mostrar en pantalla
        System.out.println("horas: " + horas);
        System.out.println("minutos: " + minutos);
        System.out.println("segundo " + segundos);

        in.close();

    }
}
