package ifelse;
import java.util.Scanner;
public class UnIncremento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero");
        num = sc.nextInt();

        if (num%2==0){
            num +=2;
        }else if(num%3==0){
            num +=3;
        }else if (num%5==0){
            num +=5;
        }else {
            num ++;
        }
        System.out.println("El nuevo numero es " + num);
    }
}
