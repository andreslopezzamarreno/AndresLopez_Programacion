import java.util.Scanner;

public class NumerosTipos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        double mediapos;
        double medianeg;
        int sumapos = 0;
        int sumaneg = 0;
        int numpos = 0;
        int numneg = 0;

        for (int i = 0; i <10 ; i++) {
            System.out.println("Introduce numero:");
            numero = sc.nextInt();
            if(numero>=0){
                sumapos+= numero;
                numpos++;
            }else{
                sumaneg += numero;
                numneg++;
            }
        }
        mediapos = (double) sumapos/numpos;
        medianeg = (double) sumaneg/numneg;

        System.out.println("La media de los positivos es: " + mediapos);
        System.out.println("La media de los negativos es: " + medianeg);
    }
}
