package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda2 {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Persona> agenda2;
    private String nombre;
    private int telefono;
    private int opcion;
    private boolean repetida;


    //contructor
    public Agenda2() {
        this.agenda2 = new ArrayList<>();
    }

    //metodos
    public void agregar2(Persona persona) {
        /*for (Persona item : agenda2) {
            if (persona.getDni().equals(item.getDni())) {
                repetida = true;
                System.out.println("Ya hay una persona con el mismo DNI");
                break;
            }
        }
        if (!repetida) {
            agenda2.add(persona);
            System.out.println("Persona añadida");
        }*/

        //metodo con el metodo existePersona
        if (existePersona(persona.getDni()) == null) {
            agenda2.add(persona);
        } else {
            System.out.println("La persona ya existe");
        }
    }

    public boolean borrar2(String busqueda) {
        /*for (Persona item : agenda2) {
            if (busqueda.equals(item.getDni())) {
                agenda2.remove(item);
            }
        }*/

        //metodo con el metodo existePersona
        if (existePersona(busqueda) != null) {
            agenda2.remove(existePersona(busqueda));
            return true;
        }
        return false;
    }

    public void editar2(String busqueda) {
        for (Persona item : agenda2) {
            if (busqueda.equals(item.getDni())) {
                System.out.println("que quieres modificar\n1.nombre\n2.telefono");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("nuevo nombre");
                        nombre = sc.next();
                        item.setNombre(nombre);
                        break;
                    case 2:
                        System.out.println("nuevo telefono");
                        telefono = sc.nextInt();
                        item.setTelefono(telefono);
                        break;
                }
            }
        }
    }

    public void buscar2(String busqueda) {
        for (Persona item : agenda2) {
            if (busqueda.equals(item.getDni())) {
                System.out.println("nombre: " + item.getNombre() + "\ntelefono: " + item.getTelefono() + "\nDNI: " + item.getDni());
                break;
            }
        }
    }

    public void listar2() {
        for (Persona persona : agenda2) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Telefono: " + persona.getTelefono());
            System.out.println("DNI: " + persona.getDni() + "\n");
        }
    }

    private Persona existePersona(String dni) {
        Persona persona = null;
        for (Persona item : agenda2) {
            if (item.getDni().equalsIgnoreCase(dni)) {
                return item;
            }
        }
        return persona;
    }

    public ArrayList<Persona> getAgenda2() {
        return agenda2;
    }

    public void setAgenda2(ArrayList<Persona> agenda2) {
        this.agenda2 = agenda2;
    }
}
