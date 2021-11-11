package ifelse;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int centenas;
        int decenas;
        int unidades;
        int centenas3;
        int decenas3;
        int unidades3;
        int suma3;

        System.out.println("Introduce un numero de 3 digitos:");
        numero = sc.nextInt();

        if (numero >= 100 && numero <= 999) {
            centenas = numero /100;
            decenas = numero /10 %10;
            unidades = numero %10;
            centenas3 = (int) Math.pow(centenas,3);
            decenas3 = (int ) Math.pow(decenas, 3);
            unidades3 = (int) Math.pow(unidades,3);
            suma3 = centenas3 + decenas3 + unidades3;
            if (suma3 == numero){
                System.out.println("El numero es armstrong ");

            }else {
                System.out.println("El numero no es armstrong");
            }
        }else{
            System.out.println("El numero no tiene 3 digitos");
        }
    }
}
