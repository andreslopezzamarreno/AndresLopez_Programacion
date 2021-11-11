package ejsfor;

public class TablaTodos {
    public static void main(String[] args) {

        int tabla = 0;
        int numero= 0;

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(numero + " X " + tabla + " = " + (numero * tabla));
                tabla ++;
            }
            numero ++;
            tabla = 0;
        }
    }
}
