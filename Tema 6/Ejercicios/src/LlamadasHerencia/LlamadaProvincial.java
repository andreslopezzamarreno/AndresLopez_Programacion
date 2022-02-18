package LlamadasHerencia;

public class LlamadaProvincial extends Llamada{


    public LlamadaProvincial(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    //metodos
    @Override
    protected void carcularCoste() {
        this.coste = this.duracion * 0.15;
    }
}
