public class Arrays {
    public static void main(String[] args) {
       /* //array de diferentes variables
        int [] numeros =  new int[10];
        boolean [] aciertos = new boolean[5];
        String[] palabras = new String[3];
        double [] decimales = {2.54, 5.76,3.45};

        int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};

        //sacar numero de elementos que tiene el array
        int longitudArray = numeros2.length;
        System.out.println(longitudArray);

        //sacar valor de una posicion en concreto, dentro de los corchetes la posicion que me interese
        int posicionArray = numeros2[7];
        System.out.println(posicionArray);

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        //modificar posicion del Array
        numeros2[7] = 88;
        System.out.println("modifico alguna posicion");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }*/

        //meter en un Array de 15 posiciones 15 aleatorios entre 0 -50
        int [] numerosAleatorios= new int[15];
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int)(Math.random() * 51);
            System.out.println(numerosAleatorios[i]);
        }

        //cuantos pares e impares hay
        int pares=0;
        int impares=0;
        for(int i = 0; i < numerosAleatorios.length; i++) {

            if (numerosAleatorios[i] %2 == 0){
                pares++;

            }else{
                impares++;
            }
        }
        System.out.println("Hay " + pares + " numeros pares");
        System.out.println("Hay " + impares + " numeros impares ");

        //La super clase de java
        Object[] cositas = {true, 1, 4.643 , "hola", 'c'};

    }
}
