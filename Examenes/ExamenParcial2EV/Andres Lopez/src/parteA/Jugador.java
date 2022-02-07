package parteA;

import java.util.ArrayList;

public class Jugador {
    private String nombre, dni;
    private ArrayList<Carton> cartones;
    private int saldo;

    public Jugador (String nombre, String dni, int saldo){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
        this.cartones = new ArrayList<>();
    }

    public void verCartones (){
        int contador = 1;
        for ( Carton carton: cartones) {
            System.out.println("Carton " + contador);

            contador ++;
        }
    }

    public void comprarCartones (int cantidad){
        if(saldo - cantidad >= 0){
            for (int i = 0; i < cantidad; i++) {
                cartones.add(new Carton());
            }
        }
    }
}
