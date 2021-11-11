package ejsfor;

import java.util.Scanner;

public class CuadradoFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int lado;
        String linea= " ";

        System.out.println("introce el lado: ");
        lado = sc.nextInt();
        for (int i = 0; i < lado; i++) {
                linea = " + "  + linea;
        }
        for (int i = 0; i < lado; i++) {
            System.out.println(linea);

        }
    }
}

