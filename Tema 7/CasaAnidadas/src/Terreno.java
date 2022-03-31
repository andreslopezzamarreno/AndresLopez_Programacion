import java.util.Scanner;

public class Terreno {

    //variables
    private Casa casa;
    private int m2,valoracion;
    private String orientacion;

    //constructores
    public Terreno(int m2, int valoracion, String orientacion) {
        this.m2 = m2;
        this.valoracion = valoracion;
        this.orientacion = orientacion;
    }

    //metodos
    public void revalorizarCasa(){
        if(casa != null){
            valoracion += (valoracion* 0.25);
        }
        if(casa.m2 >100){
            valoracion += (valoracion* 0.3);
        }
        if(casa.pincina){
            valoracion += (valoracion* 0.5);
        }

    }

    public void construirCasa(){

    }
    //getter y setter


    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    class Casa{

        //variables
        private int m2,habitaciones;
        private boolean pincina;

        //constructores
        public Casa(int m2, int habitaciones, boolean pincina) {
            this.m2 = m2;
            this.habitaciones = habitaciones;
            this.pincina = pincina;
        }

        //metodos
        public void construirhabitacion(int metros){

        }

        public void construirPiscina(){
            pincina = true;
        }

        public void construirAnexo(int metros){
            if((m2 + metros)<Terreno.this.m2){
                casa.m2 += metros;
            }
        }


    }
}
