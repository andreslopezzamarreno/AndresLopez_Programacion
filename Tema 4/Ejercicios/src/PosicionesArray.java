import java.util.Scanner;

public class PosicionesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posiciones;
        int posfin;
        int posini;
        System.out.println("De cuantas posiciones quieres el Array");
        posiciones = sc.nextInt();


        int [] numeros = new int[posiciones];
        int [] numeros2 = new int[posiciones];

        //cojo valores del array
        for (int i = 0; i < posiciones; i++) {
            System.out.println("introduc el valor de la posicion " + i);
            numeros[i] = sc.nextInt();
        }

        //copio el array en otro array
        for (int i = 0; i < posiciones; i++) {
            numeros2[i] = numeros[i];
        }

        //el valor de la posicion pasa a una mas
        posfin = numeros[posiciones -1];
        for (int i = posiciones-1; i >= 0; i--) {
            if (i != 0){
                numeros[i] = numeros[i-1];
            } else {
                numeros[0] = posfin;
            }
        }

        //el valor de la posicion pasa a una menos
        posini = numeros2[0];
        for (int i = 0; i < posiciones; i++) {
            if(i == posiciones-1){
                numeros2[i] = posini;
            }else{
                numeros2[i] = numeros2[i+1];
            }
        }

        //muestro en consola
        for (int i = 0; i < posiciones; i++) {
            System.out.println(numeros[i] + "\t" + numeros2[i]);
        }
    }
}
