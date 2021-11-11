import java.util.Scanner;

public class BarAvanzado {
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);

        int bebidas = 0;
        int bocadillos = 0;
        double precioBebidas = 0.0;
        double precioBocadillos = 0.0;
        int personas = 0;
        double precioTotal = 0.0;

        //datos al usuario
        System.out.println("Numero de bebidas: (0-20)");
        bebidas = in.nextInt();

        System.out.println("Numero de bocadillos: (0-20)");
        bocadillos = in.nextInt();

        System.out.println("Precio de las bebidas (0-3€)");
        precioBebidas = in.nextDouble();

        System.out.println("precio de bocadillos: (0-5€)");
        precioBocadillos = in.nextDouble();

        System.out.println("Numero de personas que realizan la compra: (0-10)");
        personas = in.nextInt();

        precioTotal = bebidas *precioBebidas + bocadillos *precioBocadillos;

        //mostrar en consola
        System.out.println("ARTICULO \t\t\t\tCANTIDAD \t\t\t\tPRECIO \t\t\t\tCOSTE");
        System.out.println("======== \t\t\t\t======== \t\t\t\t====== \t\t\t\t=====");
        System.out.println("bebidas \t\t\t\t" + bebidas + "\t\t\t\t\t" + precioBebidas + "\t\t\t\t" + (bebidas * precioBebidas));
        System.out.println("================================================");
        System.out.println("Total: \t\t\t\t\t" + precioTotal);
        System.out.println("importe unitario \t\t\t" + precioTotal / personas);

        in.close();
    }
}
