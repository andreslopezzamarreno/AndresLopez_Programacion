package ArraysMultidimensionales;

/* duda que surgió en clase de porque para recorrer el array multidimensional el segundo for alidado
tenia que ser de la forma numeros[i].length y no numeros.length*/


import java.util.Scanner;
public class MovidaMultidimensional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [][] numeros = new int[3][4];

        for (int i = 0; i <  numeros.length; i++) {

            /*se pone numero[i].length por que en el caso de que el array no fuese un array cuadrado
            la longitud de las columnas solo llegaria hasta la longitud de las filas y se quedarias valores
            nulos o no podrias meter valores en las posiciones
            */

            for (int j = 0; j < numeros[i].length; j++) {
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
