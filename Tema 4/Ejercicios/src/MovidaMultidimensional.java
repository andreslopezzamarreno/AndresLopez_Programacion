import java.util.Scanner;

public class MovidaMultidimensional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [][] numeros = new int[3][4];

        for (int i = 0; i <  numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println("introduce valor de la posicion " );
                numeros [i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]);
            }
            System.out.println();
        }
    }
}
