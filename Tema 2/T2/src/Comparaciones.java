public class Comparaciones {
    public static void main (String args[]) {
        int a = 0;
        int b = 2;

        System.out.println("La expresion a<=3 y b es distinto de 4 es " + (a<=3 && b!=4));

        a = 6;
        b = 3;

        System.out.println("La expresion a>=5 o B es raiz cuadrada de 4 es " + (a>=5 || b == Math.sqrt(9)));

        System.out.println("La expresion a>3 y a<5 es " + (a>=3 && a<=5));

    }
}

