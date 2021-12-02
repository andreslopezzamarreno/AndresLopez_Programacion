public class TratamientoPalabras {

    public static void main(String[] args) {
        String palabraTratar = "Ejemplo de palabra";
        System.out.println(palabraTratar.toLowerCase());
        System.out.println(palabraTratar.toUpperCase());
        String palabraComparar = "ejemplo de palabra";
        if (palabraTratar.toLowerCase().equals(palabraComparar.toLowerCase())){
            System.out.println("son iguales ");
        }else{
            System.out.println("son diferentes");
        }
        String fraseCompleta = "Esto es una frase completa de un conjunto de palabras";
        System.out.println(fraseCompleta.length());
        String[] palabras = fraseCompleta.split(" ");
        System.out.println("El numero de palabras es " + palabras.length);

        int contador = 0;
        for (String item : palabras) {
            contador += item.length();
        }
        System.out.println("El numero total de letras es " + contador);

        System.out.println(fraseCompleta.replaceAll(" ","").length());

        for (int i = 0; i < fraseCompleta.length(); i++) {
            if (fraseCompleta.charAt(i) != ' '){
                System.out.println(fraseCompleta.charAt(i) + "  ");
            }
        }

        System.out.println(fraseCompleta.indexOf('a'));

        String correo = "andres.lopez@cesjuanpablosegundo.es";
        System.out.println(correo.substring(0, correo.indexOf('@')));
        System.out.println(correo.substring(correo.indexOf('@')+1, correo.length()));
    }
}
