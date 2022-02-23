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
        if (tipo.equalsIgnoreCase("asalariado")){

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

}
