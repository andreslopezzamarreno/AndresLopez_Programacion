package agenda;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Agenda {
    //variables
    private Hashtable<String, Persona> agenda;
    private Scanner sc = new Scanner(System.in);
    private String nombre;
    private int telefono;
    private int opcion;
    //constructor
    public Agenda() {
    }

    //metodos
    public void agregar(Persona persona) {
        agenda.put(persona.getDni(), persona);
    }

    public void borrar(String busqueda) {
        if (agenda.containsKey(busqueda)) {
            agenda.remove(busqueda);
            System.out.println("Persona borrada\n");
        } else {
            System.out.println("DNI no encontrado\n");
        }
    }

    public void editar(String busqueda) {
        if (agenda.containsKey(busqueda)) {
            System.out.println("Que quieres editar?\n1.Nombre\n2.telefono");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Nuevo Nombre");
                    nombre = sc.next();
                    agenda.get(busqueda).setNombre(nombre);
                    break;
                case 2:
                    System.out.println("Nuevo telefono");
                    telefono = sc.nextInt();
                    agenda.get(busqueda).setTelefono(telefono);
                    break;
            }
        } else {
            System.out.println("DNI no encontrado\n");
        }
    }
    public void buscar(String busqueda) {
        Persona personaBusca = agenda.get(busqueda);

        System.out.println(personaBusca.getNombre());
        System.out.println(personaBusca.getTelefono());
        System.out.println(personaBusca.getDni()+ "\n");
    }

    public void listar() {
        Enumeration<String> claves = agenda.keys();

        while (claves.hasMoreElements()) {
            String dniAct = claves.nextElement();
            Persona persona1 = agenda.get(dniAct);
            System.out.println("Nombre: " + persona1.getNombre() + "\nTelefono:" + persona1.getTelefono() + "\nDNI: " + persona1.getDni() + "\n");
        }
    }

    public Hashtable<String, Persona> getAgenda() {
        return agenda;
    }

    public void setAgenda(Hashtable<String, Persona> agenda) {
        this.agenda = agenda;
    }
}
