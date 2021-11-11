import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aleatorio = (int) Math.floor(Math.random() * 9999 + 1);
        int numero;
        int unidadesAleatorio;
        int decenasAleatorio;
        int centenasAleatorio;
        int unidades;
        int decenas;
        int centenas;

        do {
            System.out.println("Con que numero quierers jugar (4 digitos): ");
            numero = sc.nextInt();
        } while (numero < 999 || numero > 9999);


        unidadesAleatorio = aleatorio % 10;
        unidades = numero % 10;
        decenasAleatorio = aleatorio%100;
        decenas = numero % 100;
        centenasAleatorio = aleatorio%1000;
        centenas = numero %1000;

        if (numero == aleatorio) {
            System.out.println("Enhorabuena has ganado el premio gordo");
        }else if (centenasAleatorio == centenas){
            System.out.println("Enhorabuena has ganado 10000€");
        }else if( decenasAleatorio == decenas){
            System.out.println("Enhorabuena has ganado 100€");
        }else if(unidadesAleatorio == unidades){
            System.out.println(" Enhorabuena has ganado la pedrea, 10€");
        }else {
            System.out.println("Lo siento, no has ganado nada");
        }
    }
}
