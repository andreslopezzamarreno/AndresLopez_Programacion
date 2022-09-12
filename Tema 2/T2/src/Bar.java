
import java.util.Scanner;

public class Bar {
    public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            //declaracion de variables
            int bebidas = 0;
            int bocadillos = 0;

            System.out.println("Numero de bebidas: ");
            bebidas = in.nextInt();

            System.out.println("Numero de bocadillos ");
            bocadillos = in.nextInt();

            //mostrar en pantalla
            System.out.println("Coste de las bebidas: " + bebidas * 1.25);
            System.out.println("coste de los bocadillos " + bocadillos * 2.05);
            System.out.println("Coste del pedido: " + (bebidas * 1.25 + bocadillos * 2.05));

            in.close();

        }
    }

