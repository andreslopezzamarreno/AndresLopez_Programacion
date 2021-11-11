package dowhile;

import java.util.Scanner;

public class SumaPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        int suma = 0;

        do {
            System.out.println("Introduce numero:");
            numero = sc.nextInt();
            if (numero>=0){
                suma += numero;
            }else{
                System.out.println("numero negativo, no valido");
            }
        }while (numero !=0);
            System.out.println("La suma de todos los numeros es: " + suma);
    }
}
