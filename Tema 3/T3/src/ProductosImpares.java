public class ProductosImpares {
    public static void main (String args[]) {

        int producto = 1;

        for (int i = 1; i<=20;i=i+2){
            producto *= i;
        }

        System.out.println("El resultado de la operacion es: " + producto);
    }
}
