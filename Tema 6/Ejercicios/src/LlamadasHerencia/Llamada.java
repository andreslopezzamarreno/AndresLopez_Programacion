package LlamadasHerencia;

public abstract class Llamada {
    //variables
    protected int nOrigen, nDestino, duracion;
    protected double coste;

    //constructores
    public Llamada(){}

    public Llamada(int nOrigen,int nDestino, int duracion){
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
        carcularCoste();

    }

    //metodos
    protected abstract void carcularCoste();

    public void mostrarDatos(){
        System.out.println("Origen: " + nOrigen);
        System.out.println("Destino: " + nDestino);
        System.out.println("Duracion: " + duracion);
        System.out.println("Coste: " + coste);
    }

    //getter y setter
    public int getnOrigen() {
        return nOrigen;
    }

    public void setnOrigen(int nOrigen) {
        this.nOrigen = nOrigen;
    }

    public int getnDestino() {
        return nDestino;
    }

    public void setnDestino(int nDestino) {
        this.nDestino = nDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}