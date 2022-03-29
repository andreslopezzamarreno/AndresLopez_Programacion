import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() *20)+1;
        System.out.println(numeroAleatorio);
        int numeroIntroducido = 0;
        int intentos = 0;

        System.out.println("Adivina el numero secreto (1-20)");
        do{
            try{
                sc = new Scanner(System.in);
                numeroIntroducido = sc.nextInt();
                if(numeroIntroducido <0){
                    throw new ExceptionNumero("numero incorrecto");
                }
            }catch (InputMismatchException | ExceptionNumero e){
                System.out.println("Error, mete un numero");
                numeroIntroducido = 100;
            }

            if (numeroAleatorio == numeroIntroducido){
                System.out.println("Numero acertado");
            }else{
                System.out.println("Intentalo de nuevo");
            }

            intentos ++;
        }while (numeroAleatorio != numeroIntroducido);

        System.out.println("El numero de intentos han sido " + intentos);
    }
}
