package Examen;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aleatorio;
        int sumaAleatorio = 0;
        int numsAleatorios=0;
        double media;

        System.out.println("Cuantos aleatorios quieres generar:");
        aleatorio = sc.nextInt();
        for (int i = 0; i < aleatorio; i++) {
            int aleatorios = (int) Math.floor(Math.random() * 100);
            System.out.println(aleatorios);
            sumaAleatorio+=aleatorios;
            numsAleatorios++;
        }
        System.out.println("La suma de los aleatorios es: " + sumaAleatorio);
        media = (double) sumaAleatorio/(double) numsAleatorios;
        System.out.println("La media de los numeros generados es :" + media );
    }
}
