package ifelse;

import java.util.Scanner;

public class OrdenarAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int max;
        int med;
        int min;
        int orden;

        System.out.println("Introducir numeros:");
        System.out.println("Primero:");
        numero1 = sc.nextInt();
        System.out.println("seundo: ");
        numero2 = sc.nextInt();
        System.out.println("tercero: ");
        numero3 = sc.nextInt();
        do{
            System.out.println("Ascendente:1 \nDescendente:0");
            orden = sc.nextInt();
        }while (orden<0 && orden> 1);




        if (numero1>numero2 && numero1> numero3){
            max = numero1;
            if (numero2>numero3) {
                min = numero3;
                med = numero2;
            }else{
                min=numero2;
                med=numero3;
            }
        }else if(numero2>numero3 && numero2>numero1){
            max = numero2;
            if(numero1>numero3){
                min = numero3;
                med = numero1;
            }else{
                min = numero1;
                med = numero3;
            }
        }else{
            max = numero3;
            if (numero1>numero2){
                min= numero2;
                med = numero1;
            }else{
                min = numero1;
                med = numero2;
            }
        }

        if(orden == 1) {
            System.out.println("Los numeros ordenados son " + min + ", " + med + ", " + max);
        }else{
            System.out.println("Los numeros ordenados son " + max + ", " + med + ", " + min);
        }
    }
}
