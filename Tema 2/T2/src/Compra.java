import java.util.Scanner;

public class Compra {
    public static void main(String args[]) {
        Scanner in = new Scanner  (System.in);

        //declaracion de variables
        double importe;
        double iva;
        double cantidadImporte;

        //datos al usuario
        System.out.println("Introduce el importe total de la compra: (0-500€) ");
        importe = in.nextDouble();

        System.out.println("introduce el IVA apricado: (0-25%) ");
        iva = in.nextDouble();

        //operaciones
        cantidadImporte = importe / (1 + (iva/100));
        iva = importe - cantidadImporte;


        //mostrar en pantalla
        System.out.printf("El valor neto de la compra fue: " + "%.2f \n",cantidadImporte );
        System.out.printf("El iva aplicado fue: " + "%.2f", iva);

        in.close();
    }
}
