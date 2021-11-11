import java.util.Scanner;

public class NumeroSecreto {
    //programa que coge un numero aleatorio 1-100 y tienes que adivinarlo con el -1 te rindes
    public static void main (String args[]) {
        Scanner in = new Scanner (System.in);

        int numero = 0;
        int num_secreto =(int) Math.floor(Math.random()*100+1);//formula para numero aleatorio entre 1-100

        do {
            System.out.println("Adivina el numero(1-100):  ");
            numero = in.nextInt();

            if (numero == num_secreto) {
                System.out.println("¡HAS ACERTADO!");
            }
            //rendirse
            else if (numero == -1) {
                System.out.println("Te has rendido. Era el " + num_secreto);
            }
            //mayor
            else if (num_secreto > numero) {
                System.out.println("Has fallado, el numero secreto es mayor ");
            }
            //menor
            else if (num_secreto < numero) {
                System.out.println("Has fallado, el numero secreto es menor ");

            }
        }while (numero != num_secreto && numero!= -1);

        in.close();



    }

}
