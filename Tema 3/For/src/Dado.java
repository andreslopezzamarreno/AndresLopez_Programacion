package ejsfor;

import java.util.Scanner;

public class Dado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces = 0;
        int dado;

        System.out.println("Numero de veces para tirar el dado: ");
        veces = sc.nextInt();

        if (veces <1){
            veces = 100;
        }
        for (int i = 0; i < veces; i++) {
            dado = (int) Math.floor(Math.random()*6 +1);
            System.out.println(dado);
        }

    }
}
