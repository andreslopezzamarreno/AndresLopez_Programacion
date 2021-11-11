import java.util.Scanner;
public class ParesEntreDosDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Todos los pares entre: ");
        System.out.println("numero 1 ");
        numero1 = sc.nextInt();
        System.out.println("numero 2: ");
        numero2 = sc.nextInt();

        if (numero1%2==0){
            for (int i = numero1 +2; i <numero2 ; i+=2) {
                System.out.println(i);

            }
        }else{
            for (int i = numero1+1; i < numero2; i+=2) {
                System.out.println(i);
            }
        }
    }
}
