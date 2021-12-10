import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros1 = new ArrayList();
        ArrayList<Integer> numeros2 = new ArrayList();
        int suma = 0;

        for (int i = 0; i < 21; i++) {
            numeros1.add((int)(Math.random()*11));
            numeros2.add((int)(Math.random()*11));
        }
        for (int i = 0; i < numeros1.size(); i++) {
            if (numeros1.get(i) == numeros2.get(i)){
                suma++;
            }
        }
        System.out.println("Primer Arraylist: " + numeros1);
        System.out.println("Segundo Arraylist: " + numeros2);
        System.out.println("Han sido iguales " + suma + " numeros. ");
    }
}
