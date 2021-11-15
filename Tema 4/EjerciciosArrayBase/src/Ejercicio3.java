import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosAleatorios = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce numero ");
            numerosAleatorios[i] = sc.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            if (i>0){
                System.out.print(numerosAleatorios[i] + ", \t ");
            }else {
                System.out.print(numerosAleatorios[i] + " \t ");
            }
        }
        System.out.printf("\n");
        for (int i = 0; i < 10; i++) {
            if (i<9){
                System.out.print(numerosAleatorios[i] + ", \t ");
            }else {
                System.out.print(numerosAleatorios[i] + " \t ");
            }
        }
    }
}
