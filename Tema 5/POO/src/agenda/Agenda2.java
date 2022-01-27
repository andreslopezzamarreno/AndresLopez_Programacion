package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda2 {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Persona> agenda2;
    private String nombre;
    private int telefono;
    private int opcion;

    //contructor
    public Agenda2() {
        this.agenda2 = new ArrayList<>();
    }

    //metodos
    public void agregar2(Persona persona) {
        agenda2.add(persona);
    }

    public void borrar2 (String busqueda){
        for (Persona item: agenda2) {
            if (busqueda.equals(item.getDni())){
                agenda2.remove(item);
            }
        }
    }

    public void editar2 (String busqueda){
        for (Persona item: agenda2) {
            if (busqueda.equals(item.getDni())){
                System.out.println("que quieres modificar\n1.nombre\n2.telefono");
                opcion = sc.nextInt();
                switch (opcion){
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
    public void buscar2(String busqueda){
        for (Persona item: agenda2) {
            if (busqueda.equals(item.getDni())){
                System.out.println("nombre: "+ item.getNombre() + "\ntelefono: "+item.getTelefono() +"\nDNI: " + item.getDni());
            }
        }
    }

    public void listar2 (){
        for (Persona persona : agenda2) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Telefono: "+ persona.getTelefono());
            System.out.println("DNI: " + persona.getDni() + "\n");
        }
    }
}
