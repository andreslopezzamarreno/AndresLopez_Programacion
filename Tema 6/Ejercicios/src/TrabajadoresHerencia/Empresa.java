package TrabajadoresHerencia;

import java.util.ArrayList;

public class Empresa {
    //variables
    private ArrayList<Trabajador> listaTrabajadores;
    private Jefe jefe;

    //constructores
    public Empresa(Jefe jefe) {
        listaTrabajadores = new ArrayList<>();
        this.jefe = jefe;
        listaTrabajadores.add(jefe);
    }

    //metodos
    public void listarTrabajadores(String tipo) {
        if (tipo.equalsIgnoreCase("asalariados")) {
            for (Trabajador item : listaTrabajadores) {
                if (item instanceof Asalariado) {
                    item.mostrardatos();
                }
            }
        } else if (tipo.equalsIgnoreCase("autonomos")) {
            for (Trabajador item : listaTrabajadores) {
                if (item instanceof Autonomo) {
                    item.mostrardatos();
                }
            }
        } else if (tipo.equalsIgnoreCase("todos")) {
            for (Trabajador trabajador : listaTrabajadores) {
                trabajador.mostrardatos();
            }
        }
    }

    public void agrgarTrabajador(Trabajador trabajador) {
        if (trabajador instanceof Jefe) {
            System.out.println("Ya hay un jefe en la empresa");
        } else {
            if (buscarTrabajador(trabajador.dni) == null) {
                listaTrabajadores.add(trabajador);
                if (trabajador instanceof Asalariado) {
                    ((Asalariado) trabajador).setContrato(true);
                }
            }else {
                System.out.println("Trabajador ya existe");
            }
        }
    }

    public Trabajador buscarTrabajador(String dni) {
        Trabajador trabajador = null;
        for (Trabajador item : listaTrabajadores) {
            if (item.dni.equalsIgnoreCase(dni)) {
                trabajador = item;
                break;
            }
        }
        return trabajador;
    }

    public void mostrarTrabajador(String dni) {
        Trabajador trabajador = null;
        if (buscarTrabajador(dni) != null) {
            buscarTrabajador(dni).mostrardatos();
        }else{
            System.out.println("Trabajador no encontrado");
        }
    }

    //getter y setter
    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }
}
