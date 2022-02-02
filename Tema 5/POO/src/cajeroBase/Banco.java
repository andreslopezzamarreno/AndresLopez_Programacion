package cajeroBase;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String cif;
    private ArrayList<Cuenta> cuentas;

    //contructor
    public Banco(String nombre, String cif){
        this.nombre= nombre;
        this.cif= cif;
        this.cuentas= new ArrayList<>();
    }
    //metodos
    public void abrirCuenta(String dni){

    }
    public void cancelarCuenta(){

    }

}
