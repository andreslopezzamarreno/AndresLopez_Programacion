package consumicionAplicacion;

import java.util.ArrayList;

public class Cuenta {
    //variables
    private int id;
    private boolean estado;
    private ArrayList<Articulo> articulos;

    //constructor
    public Cuenta (int id){
        articulos = new ArrayList<>();
        this.id = id;
    }

    //metodos
    public void agregarArticulo(Articulo articulo){

        articulos.add(articulo);
    }

    public int numeroArticulos (){
        int nart = 0;
        for (Articulo item: articulos) {
            nart += 1;
        }
        return nart;
    }

    public double pagarCuenta (){
        double total= 0;
        for (Articulo item:articulos) {
            total += item.getCoste();
        }
        return total;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
