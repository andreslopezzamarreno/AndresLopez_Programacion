import java.util.Scanner;

public class Circunferencia {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        double radio = 0.0;
        final double PI = 3.14159565;
        double perimetro= 0.0;
        double area = 0.0;

        System.out.println("Introduce el radio de la circunferencia: (0-100)");
        radio = in.nextDouble();

        perimetro = 2 * PI * radio;
        area = PI * Math.pow(radio,2);

        System.out.println("la longitud de la cricunferencia es: " + perimetro);
        System.out.println("El area de la circunferencia es: " + area);

        in.close();
    }
}

