public class Terreno {

    //variables
    private Casa casa;
    private int m2,valoracion;
    private String orientacion;

    //constructores
    public Terreno(Casa casa, int m2, int valoracion, String orientacion) {
        this.casa = casa;
        this.m2 = m2;
        this.valoracion = valoracion;
        this.orientacion = orientacion;
    }

    public Terreno() {
    }

    //metodos
    public void revalorizarCasa(){

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

        public Casa() {
        }

        //metodos
        public void construirhabitacion(){

        }

        public void construirPiscina(){

        }

        public void construirAnexo(){

        }


    }
}
