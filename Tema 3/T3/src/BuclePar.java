import java.util.Scanner;

public class BuclePar {
    Scanner lecturaTeclado = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("introduce un numero entero ");
        //new BuclePar().ejercicioUno();
        new BuclePar().ejercicioDos();
        //new BuclePar().ejercicioTres();

    }

    //Ejercicio 1
    public void ejercicioUno() {
        int a = lecturaTeclado.nextInt();
        if (a % 2 == 0) {
            System.out.printf("Es par %d", a);
        } else {
            System.out.printf("es impar %d ", a);
        }
    }

    //Ejercicio 2
    public void ejercicioDos() {
        int a = lecturaTeclado.nextInt();
        if (a % 2 == 0) {
            a++;
            System.out.println("El numero es par ");
        } else {
            if (a < 10) {
                a--;
                System.out.println("impar y menor que 10");
            } else if (a > 10 && a < 100) {
                a *= 2 & a++;
                System.out.println("impar, mayor que 10 y menos que 100");
            } else if (a > 100) {
                a = 0;
                System.out.println("impar y mayor que 100");
            }
        }
        System.out.println(a);
    }


    //ejercicio 3
    public void ejercicioTres(){
        int a = lecturaTeclado.nextInt();
        if (a<10 && a>0){
            System.out.println("un digito ");
        } else if (a<0) {
            System.out.println("negativo ");
        }

    }
}
