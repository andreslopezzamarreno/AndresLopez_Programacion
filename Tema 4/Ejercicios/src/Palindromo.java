public class Palindromo {
    public static void main(String[] args) {
        String frase = "Alli ve sevilla";
        frase = frase.replaceAll(" ", "");
        frase= frase.toLowerCase();
        int contador=0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == frase.charAt(frase.length()-1-i)){
                contador++;
            }
        }
        if (contador == frase.length()){
            System.out.println("Es un palindromo");
        }else{
            System.out.println("no es un palindromo");
        }
    }
}
