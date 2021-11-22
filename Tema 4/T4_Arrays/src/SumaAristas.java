import java.util.Scanner;

public class SumaAristas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filas, columnas;
        int numerosAleatorios[][];
        int sumatorioFila1;
        int sumatorioFilaN;
        int sumatorioColumna1;
        int sumatorioColumnaN;

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
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (i == 0 ){
                    sumatorioFila1 += numerosAleatorios [i][j];
                }
                
            }


        }

        sc.close();
    }
}
