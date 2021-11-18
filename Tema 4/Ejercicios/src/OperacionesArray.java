public class OperacionesArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] =(int) (Math.random() * 10 );

            if (i < numeros.length-1){
                System.out.print(numeros[i] + ", ");
            }else{
                System.out.print(numeros[i]);
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] %2 == 0){
                numeros[i] ++;
            }else{
                numeros[i] --;
            }
        }
    }
}
