package parteA;

import java.util.ArrayList;

public class Carton {

    private ArrayList<Integer> listaNumeros;

    public Carton(){
        listaNumeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int aleatorio = (int) (Math.random() * 51);
            listaNumeros.add(aleatorio);
        }
    }

}
