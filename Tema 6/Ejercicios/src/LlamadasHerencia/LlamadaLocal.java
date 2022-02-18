package LlamadasHerencia;

public class LlamadaLocal extends Llamada{

    public LlamadaLocal() {}

    public LlamadaLocal(int nOrigen, int nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }

    @Override
    protected void carcularCoste() {

    }

}
