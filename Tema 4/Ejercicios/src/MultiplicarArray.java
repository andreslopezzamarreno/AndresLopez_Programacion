import java.util.Scanner;

public class MultiplicarArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numero");
            numeros[i] = sc.nextInt();
            
        }
    }
}
