package ArraysUnidimensionales;

public class OperacionesArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int posfin;

        System.out.println("El Array aleatorio es: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);

            if (i < numeros.length - 1) {
                System.out.print(numeros[i] + ", ");
            } else {
                System.out.print(numeros[i]);
            }
        }
        System.out.println();


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i]++;
            } else {
                numeros[i]--;
            }


            if (numeros[i] > 0 && numeros[i] < 5) {
                numeros[i] *= 2;
            }


            numeros[i] += (-5 + (int) (Math.random() * 11));

        }
        posfin = numeros[numeros.length - 1];
        for (int i = numeros.length - 1; i >= 0; i--) {
            if (i != 0) {
                numeros[i] = numeros[i - 1];
            } else {
                numeros[0] = posfin;
            }
        }
        for (int i = 0; i < numeros.length; i += 2) {
            int numerito = numeros[i];
            numeros[i] = numeros[i + 1];
            numeros[i + 1] = numerito;
        }

        int plus = 1;
        for (int i = 0; i < numeros.length; i++) {
            int numerito = numeros[i];
            if (i <= 4) {
                numeros[i] = numeros[numeros.length - plus];
                numeros[numeros.length - plus] = numerito;
            }
            plus++;
        }

        System.out.println("El Array resultande es: ");
        for (int i = 0; i < numeros.length; i++) {
            if (i < numeros.length - 1) {
                System.out.print(numeros[i] + ", ");
            } else {
                System.out.println(numeros[i]);
            }

        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("El primer numero par es " + numeros[i]);
                break;
            }
        }

        for (int i = numeros.length - 1; i >= 0; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("El ultimo numero impar es el " + numeros[i]);
                break;
            }
        }

    }
}
