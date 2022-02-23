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
            System.out.println("Que quieres hacer: \n1.Registrar trabajdor\n" +
                    "2.listar trabajadores \n3.mostrar datos de trabajador");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Que tipo de trabajador quieres registrar: asalariado o autonomo");
                    tipo = sc.next();
                    if(tipo.equalsIgnoreCase("asalariado")){
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
                        Asalariado asalariado = new Asalariado(nombre,dni,apellido, sueldo, numPagas);
                        empresa.agrgarTrabajador(asalariado);
                    }else if(tipo.equalsIgnoreCase("autonomo")){
                        System.out.println("nombre");
                        nombre = sc.next();
                        System.out.println("apellido");
                        apellido = sc.next();
                        System.out.println("dni");
                        dni = sc.next();
                        System.out.println("sueldo");
                        sueldo = sc.nextInt();
                        Autonomo autonomo = new Autonomo(nombre, dni, apellido,sueldo);
                        empresa.agrgarTrabajador(autonomo);
                    }
                    break;

                case 2:
                    System.out.println("que trabajadores quieres ver, asalariados, autonomos o todos");
                    tipo = sc.next();
                    empresa.listarTrabajadores(tipo);
                    break;
                case 3:
                    System.out.println("que trabajador quieres buscar");
                    tipo = sc.next();
                    empresa.mostrarTrabajador(tipo);
                    break;
            }
        }while(true);
    }
}
