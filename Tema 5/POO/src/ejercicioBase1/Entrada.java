package ejercicioBase1;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Persona persona1 = new Persona("juan","lopez ", "34545645R", 39);

        persona1.mostrarDatos();
    }
}
