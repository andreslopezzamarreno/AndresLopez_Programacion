public class Arrays {
    public static void main(String[] args) {
        //array de diferentes variables
        int [] numeros =  new int[10];
        boolean [] aciertos = new boolean[5];
        String[] palabras = new String[3];
        double [] decimales = {2.54, 5.76,3.45};

        int [] numeros2 = {1,2,3,4,5,6,7,8,9,10};

        //sacar numero de elementos que tiene el array
        int longitudArray = numeros2.length;
        //System.out.println(longitudArray);

        //sacar valor de una posicion en concreto, dentro de los corchetes la posicion que me interese
        int posicionArray = numeros2[7];
        //System.out.println(posicionArray);

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
    }
}
