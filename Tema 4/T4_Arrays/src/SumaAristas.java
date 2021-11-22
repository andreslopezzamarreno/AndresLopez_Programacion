import java.util.Scanner;

public class SumaAristas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filas, columnas;
        int numerosAleatorios[][];
        int sumatorioFila1 = 0;
        int sumatorioFilaN = 0;
        int sumatorioColumna1 = 0;
        int sumatorioColumnaN = 0;

        System.out.println("Cuantas filas tendrá el Array");
        filas = sc.nextInt();
        System.out.println("Cuantas columnas tendrá el Array");
        columnas = sc.nextInt();
        numerosAleatorios = new int[filas][ columnas];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] =(int) (Math.random()*21);
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        /*for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (i == 0 ){
                    sumatorioFila1 += numerosAleatorios [i][j];
                }

                if (i == filas-1){
                    sumatorioFilaN += numerosAleatorios [i][j];
                }

                if (j== 0){
                    sumatorioColumna1 += numerosAleatorios [i][j];
                }
                if (j == columnas-1){
                    sumatorioColumnaN += numerosAleatorios [i][j];
                }
            }
        }*/
        int numeroFila = 0;
        for (int[] item : numerosAleatorios) {

            
            numeroFila++;


        }
        System.out.println("la suma de la primera fila es: "+sumatorioFila1);
        System.out.println("la suma de la ultima fila es: "+sumatorioFilaN);
        System.out.println("la suma de la primera columna es: "+sumatorioColumna1);
        System.out.println("la suma de la ultima columna es: "+sumatorioColumnaN);
        sc.close();
    }
}
