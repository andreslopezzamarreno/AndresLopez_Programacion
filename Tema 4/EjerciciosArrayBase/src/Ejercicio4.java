public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
        }
        for (int i = 0; i < 20; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2);
        }
        for (int i = 0; i < 20; i++) {
            cubo[i] = (int) Math.pow(numero[i], 3);
        }

        System.out.print("NUMERO\tCUADRADO\tCUBO \n");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " \t\t " + cuadrado[i] + " \t    " + cubo[i] + "\n");
        }

    }
}
