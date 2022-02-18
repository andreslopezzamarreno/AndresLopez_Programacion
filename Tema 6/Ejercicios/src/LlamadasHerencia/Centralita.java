package LlamadasHerencia;

import java.util.ArrayList;

public final class Centralita {
    private ArrayList<Llamada> listaLlamadas;
    private double costeTotal = 0;

    public Centralita() {
        listaLlamadas = new ArrayList<>();
    }

    public void agrgarLlamada(Llamada llamada) {
        listaLlamadas.add(llamada);
    }

    public void listarTodas() {
        for (Llamada item : listaLlamadas) {
            System.out.println(item.getClass().getSimpleName());
            item.mostrarDatos();
        }
    }

    public void mostrarLlamadas(String tipo) {
        for (Llamada item : listaLlamadas) {
            if (tipo.equalsIgnoreCase("provincial")) {
                if (item instanceof LlamadaProvincial) {
                    item.mostrarDatos();
                }
            } else if (tipo.equalsIgnoreCase("nacionales")) {
                if (item instanceof LlamadaNacional) {
                    item.mostrarDatos();
                }
            } else if (tipo.equalsIgnoreCase("locales")) {
                if (item instanceof LlamadaLocal) {
                    item.mostrarDatos();
                }
            }
        }
    }

    public void costesTotales() {
        for (Llamada item : listaLlamadas) {
            costeTotal += item.coste;
        }
        System.out.println("Coste total: " + costeTotal);
    }
}