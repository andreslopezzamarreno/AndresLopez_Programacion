public class Ejercicio4 {
    public static void main(String[] args) {
        int [] numero = new int[20];
        int [] cuadrado = new int[20];
        int [] cubo = new int[20];

        System.out.println("Array numero");
        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 101);
            cuadrado[i] = (int) Math.pow (numero[i],2);
            cubo[i] = (int) Math.pow (numero[i],3);
            System.out.println(numero[i]);

        }
        System.out.println("\nArray cuadrado: Elementos Array cuadrado elevado a 2");
        for (int i = 0; i < 20; i++) {
            System.out.println(cuadrado[i]);
        }
        System.out.println("\nArray cubo: Elementos Array cuadrado elevado a 3");
        for (int i = 0; i < 20; i++) {
            System.out.println(cubo[i]);
        }

    }
}
