package LlamadasHerencia;

public class LlamadaNacional extends Llamada{

    private int franja;

    public LlamadaNacional(int nOrigen, int nDestino, int duracion, int franja) {
        super(nOrigen, nDestino, duracion);
        this.franja = franja;
        carcularCoste();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("franja: " +franja);
    }

    @Override
    protected void carcularCoste() {
        switch (franja){
            case 1:
                this.coste = this.duracion * 0.20;
                break;
            case 2:
                this.coste = this.duracion * 0.25;
                break;
            case 3:
                this.coste = this.duracion * 0.30;
                break;
        }
    }
}
