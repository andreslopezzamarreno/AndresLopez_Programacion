package LlamadasHerencia;

public class Entrada {
    public static void main(String[] args) {

        Centralita centralita = new Centralita();

        LlamadaProvincial llamadaProvincial = new LlamadaProvincial(234, 1234, 5);
        centralita.agrgarLlamada(llamadaProvincial);
        LlamadaNacional llamadaNacional = new LlamadaNacional(13412341, 1234, 10, 1);
        centralita.agrgarLlamada(llamadaNacional);
        LlamadaLocal llamadaLocal = new LlamadaLocal(123,12335,20);
        centralita.agrgarLlamada(llamadaLocal);

        centralita.listarTodas();

        centralita.mostrarLlamadas("locales");

        centralita.costesTotales();
    }
}
