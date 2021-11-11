package ejsfor;

import java.util.Scanner;
public class BaseExponente {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int base;
        int exponente;
        int resultado = 1;

        System.out.println("base:");
        base = sc.nextInt();
        System.out.println("exponete");
        exponente = sc.nextInt();

        if (base != 0){
            for (int i = 0; i < exponente; i++) {
                resultado = resultado * base ;
            }
            System.out.println("El resultado es: " + resultado);
        }else {
            System.out.println("ERROR");
        }
    }
}
