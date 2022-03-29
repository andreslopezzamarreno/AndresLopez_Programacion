package Genericos;

import java.util.ArrayList;

public class Coleccion <T,S,V> implements Organizable<S,V>{

    private ArrayList<T> listCosas;

    public Coleccion (){
        listCosas = new ArrayList<>();
    }

    public void agregasCosas(T cosa){
        listCosas.add(cosa);
    }


    @Override
    public void organizar(S criterio) {

    }

    @Override
    public V listar() {
        return null;
    }
}
