import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {

        int aleat;
        ArrayList<String> clase = new ArrayList();
        clase.add(0,"Alvaro");
        clase.add(0,"Andres");
        clase.add(0,"Coca");
        clase.add(0,"Dani");
        clase.add(0,"Sergio Perez");
        clase.add(0,"Alex");
        clase.add(0,"Angel");
        clase.add(0,"Jorte");
        clase.add(0,"Jorge Saturde");
        clase.add(0,"Sergio");
        clase.add(0,"Andrea");
        clase.add(0,"Patricia");
        clase.add(0,"Marcos");
        clase.add(0,"Luismi");
        clase.add(0,"Catherine");
        clase.add(0,"Fernando");
        clase.add(0,"Mario");
        clase.add(0,"Adrian");
        clase.add(0,"Cris");
        clase.add(0,"Dani");
        clase.add(0,"Jessica");
        clase.add(0,"Nico");

         aleat = (int)(Math.random()* clase.size()+1);

        System.out.println(clase.get(aleat));
    }
}
