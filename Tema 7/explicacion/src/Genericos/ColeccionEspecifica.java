package Genericos;

import java.util.ArrayList;

public class ColeccionEspecifica<T extends Coleccionable>{

    private ArrayList<T> listCosas;

    public ColeccionEspecifica(){
        listCosas = new ArrayList<>();
    }

    public void agregasCosas(T cosa){
        listCosas.add(cosa);
    }
}
