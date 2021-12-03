public class Palindromo {
    public static void main(String[] args) {
        String frase = "A ti no, bonita";
        frase = frase.replaceAll(" ", "").toLowerCase();
        frase = frase.replaceAll(",", "");
        frase = frase.replaceAll("á", "a");
        frase = frase.replaceAll("é", "e");
        frase = frase.replaceAll("í", "i");
        frase = frase.replaceAll("ó", "o");
        frase = frase.replaceAll("ú", "u");

        int contador = 0;

        for (int i = 0; i < frase.length()/2; i++) {
            if (frase.charAt(i) == frase.charAt(frase.length()-1-i)){
                contador ++;
            }
        }

        if (contador == frase.length()/2){
            System.out.println("SI es un palindromo");
        }else{
            System.out.println("NO es un palindromo");
        }

        // ejercicio resuelto en clase
        /*boolean palindromo = false;

        for (int i = 0; i < frase.length()/2; i++) {
            if (frase.charAt(i) == frase.charAt(frase.length()-1-i)){
                palindromo = true;
            }else{
                palindromo = false;
                break;
            }
        }
        if (palindromo){
            System.out.println("SI es palindromo");
        }else{
          System.out.println("NO es palindromo");
        }*/
    }
}
