import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numerosAleatorios = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Introduce numero ");
            numerosAleatorios[i] = sc.nextInt();
        }
        for (int i = 0; i < 8; i++) {
            if (numerosAleatorios[i] %2 == 0) {
                System.out.println(numerosAleatorios[i] + " par");
            }else{
                System.out.println(numerosAleatorios[i] + " impar");
            }
        }

    }
}
