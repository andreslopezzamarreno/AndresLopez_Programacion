import java.util.Scanner;

public class MultidimensionalAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numFilas;
        int numColumnas;
        System.out.println("Numero de filas del Array");
        numFilas= sc.nextInt();
        System.out.println("Numero de columnas del Array ");
        numColumnas = sc.nextInt();

        int [][] numeros = new int[numFilas][numColumnas];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros [i][j] = (int)( Math.random()*101);
                System.out.print(numeros[i][j] + " ");
            }

            System.out.println();
            if (i<numFilas-1){
                for (int j = 0; j < numColumnas; j++) {
                    System.out.printf("*  ");
                }
            }
            /*for (int j = 0; j < numColumnas; j++) {
                System.out.printf("*  ");
            }*/
            System.out.println();
        }
    }

}
