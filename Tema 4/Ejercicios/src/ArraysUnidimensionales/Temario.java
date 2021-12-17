package ArraysUnidimensionales;

public class Temario {
    public static void main(String[] args) {
        String [] temario = {" Introducción"," Identificadores"," Estructuras"," Colecciones",
                " Orientación a objetos", " Clases y Objetos", " Abstracción, Herencia y Polimorfismo",
                " Ficheros y Excepciones", " Bases de datos", " Interfaces"};

        System.out.println("Número de temas: " + temario.length);

        for (int i = 0; i < temario.length; i++) {
            System.out.print("Tema " + (i+1) + ": ");
            System.out.println(temario[i]);
        }
    }
}
