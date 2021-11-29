import jdk.swing.interop.SwingInterOpUtils;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double REFRESCO = 1.20;
        final double CAFE = 1;
        final double BOCADILLO = 3.20;
        final double MENU = 9.50;
        int opcion;

        do{
            System.out.println("1.Pedir café \n2.Pedir refresco \n3.Pedir bocadillo \n4.Pedir menú\n5.Sacar la cuenta\nIntroduce una opcion:");
            opcion= sc.nextInt();
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida. Prueba otra vez");
            }
        }while(opcion!= 5);


    }
}
