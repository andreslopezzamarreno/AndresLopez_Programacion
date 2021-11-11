package Examen;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero =0;

        int combinacion;

        System.out.println("Introducir combinacion : ");
        combinacion = sc.nextInt();

        System.out.println("Prueba la combinación:");
        for (int i = 0; i < 4; i++) {
            numero = sc.nextInt();

            if (combinacion == numero) {
                System.out.println("Caja desbloqueada.");
                break;
            }else {
                if (i<=2) {
                    System.out.println("Lo siento prueba de nuevo");
                }
            }
        }
        if (combinacion!= numero) {
            System.out.println("Caja bloqueada");
        }
    }
}

