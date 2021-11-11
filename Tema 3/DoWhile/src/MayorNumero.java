public class MayorNumero {
    public static void main(String[] args) {
        int numAleatorio;
        int max = -999;
        do {
            numAleatorio = (int) Math.floor(Math.random() * 100);
            System.out.println(numAleatorio);
            if (numAleatorio>max){
                max = numAleatorio;
            }
        } while (numAleatorio!=0);
        System.out.println("El numero mas grande generado es: " + max);
    }
}

