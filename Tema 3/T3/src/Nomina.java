import java.util.Scanner;

public class Nomina {
    public static void main(String args[]) {
        Scanner teclado = new Scanner (System.in);

        //zona de variables
        final double RETENCION = 0.21;
        double sueldoBruto = 0.0;
        int numPagas = 0;
        double sueldoNeto = 0.0;
        double brutoMensual = 0.0;
        double netoMensual = 0.0;
        double retencionSueldo = 0.0;

        //pedir datos al usuario
        System.out.println("Introduce el sueldo bruto anual: ");
        sueldoBruto = teclado.nextDouble();

        System.out.println("Introduce el numero de pagas: ");
        numPagas = teclado.nextInt();

        //operaciones
        retencionSueldo = sueldoBruto * RETENCION;
        sueldoNeto = sueldoBruto - retencionSueldo;
        brutoMensual = sueldoBruto / numPagas;
        netoMensual = sueldoNeto / numPagas;

        //mostrar en pantalla
        System.out.println("El salario bruto anual es :" + sueldoBruto);

        System.out.println("El salario neto anual es: " + sueldoNeto);

        System.out.println("El salario bruto mensual es: " + brutoMensual + " en " + numPagas + " pagas");

        System.out.println("El salario neto mensual es: " + netoMensual + " en " + numPagas + " pagas");

        teclado.close();

    }
}
