import java.util.Scanner;

public class Factura {
    public static void main (String args[]) {
        final double IVA = 0.21;
        Scanner teclado = new Scanner (System.in);

        double precio = 0.0;
        double precioConIva = 0.0;

        System.out.println("introduce el precio base: ");
        precio = teclado.nextDouble();

        precioConIva = precio * IVA;

        System.out.println("Precio base " + precio);

        System.out.println("   con IVA:" + IVA);

        System.out.println("Importe factura: " + (precio + precioConIva) + "€");

        teclado.close();
    }
}
