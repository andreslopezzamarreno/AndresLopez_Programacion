public class LlenarArrays {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(10 +Math.random()*41);
            System.out.println(numeros[i]);
        }
    }
}
