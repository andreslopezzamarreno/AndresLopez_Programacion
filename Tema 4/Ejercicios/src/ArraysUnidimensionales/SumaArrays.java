package ArraysUnidimensionales;

import java.util.Scanner;

public class SumaArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicion;
        System.out.println("Que longitud quieres que tenga el Array ");
        posicion = sc.nextInt();

        int[] sumando1 = new int[posicion];
        int[] sumando2 = new int[posicion];
        int [] resultado = new int[posicion];

        for (int i = 0; i < posicion; i++) {
            System.out.println("introcude el valor de la posicion " + i + " del primer array ");
            sumando1[i] = sc.nextInt();
        }
        for (int i = 0; i < posicion; i++) {
            System.out.println("introcude el valor de la posicion " + i + " del segundo array");
            sumando2[i] = sc.nextInt();
        }
        for (int i = 0; i < posicion; i++) {
            resultado[i] = sumando1[i] + sumando2[i];
            System.out.println(resultado[i]);
        }
    }
}
