

// sin terminar

public class OperacionesArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int posfin;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] =(int) (Math.random() * 10 );

            if (i < numeros.length-1){
                System.out.print(numeros[i] + ", ");
            }else{
                System.out.print(numeros[i]);
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            /*if (numeros[i] %2 == 0){
                numeros[i] ++;
            }else{
                numeros[i] --;
            }

            if(numeros[i]>0 && numeros[i] < 5){
                numeros[i]*= 2;
            }*/

            //numeros[i] += ( -5 + (int) (Math.random()*11));

            for (int item: numeros) {
                System.out.println(item + ", ");
            }

            posfin = numeros[numeros.length -1];
            if (i != 0){
                numeros[i] = numeros[i-1];
            } else {
                numeros[0] = posfin;
            }

            /*for (int item:numeros) {
                System.out.print(item);
            }*/

        }
    }
}
