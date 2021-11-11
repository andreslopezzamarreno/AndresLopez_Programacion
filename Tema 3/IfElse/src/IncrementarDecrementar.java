package ifelse;

import java.util.Scanner;

public class IncrementarDecrementar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce un numero:");
        numero = sc.nextInt();

        if (numero%2== 0){
            numero++;
            System.out.println("El numero es par. Se incrementa en 1. El numero es: " + numero);
        }else{
            numero--;
            System.out.println("El numero es impar. Se decrementa en 1. El numero es: " + numero);
        }
    }
}
