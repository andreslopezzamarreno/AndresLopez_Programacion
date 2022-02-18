package TrigonometriaHerencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double base;
        double altura;
        double radio;
        do {
            System.out.println("Con que quieres trabajar: \n1.Circulo\n2.Rectangulo\n3.Triangulo");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introducir radio:");
                    radio = sc.nextInt();
                    Circulo circulo = new Circulo(radio);
                    System.out.println("Que quieres hacer con el circulo:\n1.Calcular Area\n2.Calcular Diametro\n3.Calcular Perimetro");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("El area del circulo es " + circulo.calcularArea() + "\n");
                            break;
                        case 2:
                            System.out.println("El diametro del circulo es " + circulo.calcularDiametro() + "\n");
                            break;
                        case 3:
                            System.out.println("El perimetro del circulo es " + circulo.calcularPerimetro() + "\n");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Introducir base:");
                    base = sc.nextInt();
                    System.out.println("Introducir altura:");
                    altura = sc.nextInt();
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    System.out.println("Que quieres hacer con el rectangulo:\n1.Calcular Area\n2.Calcular Perimetro");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("El area del rectanguno es " + rectangulo.calcularArea() + "\n");
                            break;
                        case 2:
                            System.out.println("El perimetro del rectangulo es " + rectangulo.calcularPerimetro() + "\n");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Introducir base:");
                    base = sc.nextInt();
                    System.out.println("Introducir altura:");
                    altura = sc.nextInt();
                    Triangulo triangulo = new Triangulo(base, altura);
                    System.out.println("Que quieres hacer con el triangulo:\n1.Calcular Area\n2.Calcular Perimetro");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("El area del triangulo es " + triangulo.calcularArea() + "n");
                            break;
                        case 2:
                            System.out.println("El perimetro del triangulo es " + triangulo.calcularPerimetro() + "\n");
                            break;
                    }
                    break;
            }
        } while (true);

    }
}
