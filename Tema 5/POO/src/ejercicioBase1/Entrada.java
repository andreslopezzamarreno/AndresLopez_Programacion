package ejercicioBase1;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Persona persona1 = new Persona("alberto","hernandez" , "34534546t", 45,86, 181);
        Persona persona2 = new Persona("juan","lopez ", "34545645R", 39);
        Persona persona3 =  new Persona("andres" , "lopez");

        persona1.mostrarDatos();
    }
}
