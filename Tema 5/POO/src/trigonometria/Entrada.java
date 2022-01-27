package trigonometria;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int base;
        int altura;
        int radio;
        /*Triangulo triangulo = new Triangulo(4,6);

        System.out.println("El area del triangulo es: " + triangulo.areaTriangulo());

        Circulo circulo = new Circulo(5);

        System.out.println("El area del circulo es: " + circulo.areaCirculo());

        Cuadrado cuadrado = new Cuadrado(4,7);

        System.out.println("el area del cuadrado es: " + cuadrado.area());*/
        do {
            System.out.println("1. Trabajar con triangulos \n2. Trabajar con circulos\n3. Trabajar con cuadrados\n0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce base: ");
                    base = sc.nextInt();
                    System.out.println("Introduce altura: ");
                    altura = sc.nextInt();

                    Triangulo triangulo = new Triangulo(base, altura);
                    do {
                        System.out.println("Que quieres hacer\n1.Calcular Area\n2.Mostrar datos\n0.Salir");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                triangulo.areaTriangulo();

                                break;
                            case 2:
                                triangulo.areaTriangulo();
                                System.out.println("Base: " + base + "\nAltura: " + altura + "\nBase : "+ base);
                                break;
                        }
                    }while (opcion != 0);
                    System.out.println("Pulsa enter para continuar");
                    sc.nextLine();
                    break;

                case 2:
                    System.out.println("Introduce radio");
                    radio = sc.nextInt();
                    System.out.println("Que operacion quieres hacer\n1.Calcular area\n2.Calcular diametro\nMostrar datos");
                    opcion= sc.nextInt();
                    Circulo circulo = new Circulo(radio);
                    switch (opcion){
                        case 1:
                            circulo.areaCirculo();
                            System.out.println("El area del circulo es: " + circulo.getArea());
                            break;
                        case 2:
                            circulo.diametroCirculo();
                            System.out.println("El diametro del circulo es: " + circulo.getDiametro());
                            break;
                        case 3:
                            System.out.println("El radio es: " + circulo.getRadio());
                            break;
                    }

                    break;
                case 3:
                    System.out.println("Introduce la base: ");
                    base = sc.nextInt();
                    System.out.println("Introduce la altura: ");
                    altura = sc.nextInt();
                    System.out.println("Que operacion quieres hacer\n1.Calcular area\n2.Calcular diametro\nMostrar datos");
                    opcion= sc.nextInt();
                    Cuadrado cuadrado = new Cuadrado(base, altura);
                    switch (opcion){
                        case 1:
                            cuadrado.area();
                            System.out.println("El area del cuadrado es: " + cuadrado.getArea());
                            break;
                        case 2:
                            cuadrado.perimetro();
                            System.out.println("El perimetro del circulo es: " + cuadrado.getPerimetro());
                            break;
                        case 3:
                            System.out.println("La base es: " + cuadrado.getBase());
                            System.out.println("La altura es: " + cuadrado.getAltura());
                            break;
                    }
                    break;
            }
        }while (opcion != 0);

    }


}
