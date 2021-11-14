public class Ejercicio6 {
    public static void main(String[] args) {

        int[] numeros = new int[20];
        int modificaciones = 0;

        for (int i = 0; i < 20; i++) {
            numeros[i] = (int) (Math.random() * 31);
        }

        for (int i = 0; i < 20; i++) {
            switch (numeros[i]) {
                case 6:
                    numeros[i] = 8;
                    modificaciones++;
                    break;
                case 7:
                    numeros[i] = 15;
                    modificaciones++;
                    break;
                case 20:
                    numeros[i] = 10;
                    modificaciones++;
                    break;
            }
        }
        System.out.println("Se han hecho " + modificaciones + " modificaciones");
    }
}
