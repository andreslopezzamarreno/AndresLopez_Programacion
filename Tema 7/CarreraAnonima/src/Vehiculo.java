public abstract class Vehiculo {

    //variables
    protected String tipo;
    protected int numRuedas, cc,cv;
    protected double peso;

    //constructores
    public Vehiculo(String tipo, int numRuedas, int cc,int cv,double peso) {
        this.tipo = tipo;
        this.numRuedas = numRuedas;
        this.cc = cc;
        this.cv = cv;
        this.peso = peso;
    }

    public Vehiculo() {
    }

    //metodos
    public abstract void reprogramarMotor();

    public void mostrarDatos(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Numero de ruedas: " + numRuedas);
        System.out.println("CC: " + cc);
        System.out.println("Peso: " + peso);
    }

    //getter y setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
