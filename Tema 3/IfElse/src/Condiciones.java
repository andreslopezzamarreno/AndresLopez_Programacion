package ifelse;

import java.util.Scanner;
public class Condiciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Untroduce un numero ");
        numero = sc.nextInt();

        if (numero%20== 0){
            System.out.println("el numero es multiplo de 20");

        }else{
            System.out.println("el numero no es multiplo de 20");
        }
        if (numero>=-100 && numero<=100){
            System.out.println("El numero esta entre -100 y 100");
        }else{
            System.out.println("El numero no esta entre -100 y 100");
        }
    }
}
