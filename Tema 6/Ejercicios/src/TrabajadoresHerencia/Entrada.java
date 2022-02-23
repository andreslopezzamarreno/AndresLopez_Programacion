package TrabajadoresHerencia;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String tipo;
        String nombre;
        String dni;
        String apellido;
        int acciones;
        int beneficio;
        int sueldo;
        int numPagas;
        boolean contrato;

        Jefe juan = new Jefe("juan", "2342423","lopez", 60,8000);
        Empresa empresa = new Empresa(juan);

        do {
            System.out.println("Que quieres hacer: \n1.Registrar trabajdor \n2.Añadir trabajador a una empresa \n" +
                    "3.listar trabajadores \n4.mostrar datos de trabajador");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Que tipo de trabajador quieres registrar");
                    tipo = sc.next();
                    if (tipo.equalsIgnoreCase("jefe")){
                        System.out.println("nombre");
                        nombre = sc.next();
                        System.out.println("apellido");
                        apellido = sc.next();
                        System.out.println("dni");
                        dni = sc.next();
                        System.out.println("acciones");
                        acciones = sc.nextInt();
                        System.out.println("beneficio");
                        beneficio = sc.nextInt();
                        Jefe jefe = new Jefe(nombre, dni, apellido, acciones,beneficio);
                    }else if(tipo.equalsIgnoreCase("asalariado")){
                        System.out.println("nombre");
                        nombre = sc.next();
                        System.out.println("apellido");
                        apellido = sc.next();
                        System.out.println("dni");
                        dni = sc.next();
                        System.out.println("sueldo");
                        sueldo = sc.nextInt();
                        System.out.println("numero de pagas");
                        numPagas = sc.nextInt();
                        
                    }else if(tipo.equalsIgnoreCase("autonomo")){
                        System.out.println("nombre");
                        nombre = sc.next();
                        System.out.println("apellido");
                        apellido = sc.next();
                        System.out.println("dni");
                        dni = sc.next();
                        System.out.println("sueldo");
                        sueldo = sc.nextInt();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(true);
    }
}
