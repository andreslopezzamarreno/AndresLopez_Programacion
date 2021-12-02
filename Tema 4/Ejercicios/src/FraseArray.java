import java.util.Scanner;

public class FraseArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String larga = "";
        String corta = "000000000000000000000000000000000";
        String frase = "a mi padre le gusta jugar al tenis klk";
        String []frase2 = frase.split(" ");
        for (String item : frase2) {
            if (item.length()<corta.length()){
                corta = item;
            }
            if (item.length()>larga.length()){
                larga = item;
            }
        }
        System.out.println(corta);
        System.out.println(larga);


    }
}
