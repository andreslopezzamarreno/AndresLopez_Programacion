public class Ejercicio2 {
    public static void main(String[] args) {

        int[] numeros = new int[30];
        int suma = 0;
        double media;

        for (int i = 0; i < 30; i++) {
            numeros[i] = (int) (Math.random() * 11);
            suma += numeros[i];
        }

        media = (double) suma / (double) numeros.length;

        System.out.println("La suma total de puntos es: " + suma);
        System.out.println("La media de los puntos es: " + media);
    }
}