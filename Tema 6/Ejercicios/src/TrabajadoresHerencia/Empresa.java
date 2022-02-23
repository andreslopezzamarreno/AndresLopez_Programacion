package TrabajadoresHerencia;

import java.util.ArrayList;

public class Empresa {
    //variables
    private ArrayList<Trabajador> listaTrabajadores;
    private Jefe jefe;

    //constructores
    public Empresa (Jefe jefe){
        listaTrabajadores = new ArrayList<>();
        this.jefe = jefe;
        listaTrabajadores.add(jefe);
    }

    //metodos
    public void listarTrabajadores(String tipo){
        for (Trabajador item:listaTrabajadores) {
            if (tipo.equalsIgnoreCase("asalariado")){
                if (item instanceof Asalariado){
                    item.mostrardatos();
                }
            }
            if(tipo.equalsIgnoreCase("autonomo")){
                if (item instanceof Autonomo){
                    item.mostrardatos();
                }
            }
        }


    }

    public void agrgarTrabajador (Trabajador trabajador){
        if (trabajador instanceof Jefe){
            System.out.println("Ya hay un jefe en la empresa");
        }else{
            boolean encontrado = false;
            for (Trabajador item:listaTrabajadores) {
                if (trabajador.dni.equalsIgnoreCase(item.dni)){
                    encontrado = true;
                    System.out.println("Ya hay un trabajador con el mismo DNI");
                    break;
                }
            }
            if (!encontrado){
                listaTrabajadores.add(trabajador);
                if (trabajador instanceof Asalariado){
                    ((Asalariado) trabajador).setContrato(true);
                }
            }
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
