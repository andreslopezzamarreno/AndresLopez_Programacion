package ejercicioBase2;



import ejercicioBase1.Persona;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;
        String apellido;
        String dni;
        int edad;
        double peso;
        int altura;

        System.out.println("Cual es tu nombre");
        nombre = sc.next();
        System.out.println("Cual es tu apellido");
        apellido = sc.next();
        System.out.println("Cual es tu dni");
        dni = sc.next();
        System.out.println("Cual es tu edad");
        edad = sc.nextInt();
        System.out.println("Cuanto pesas");
        peso = sc.nextDouble();
        System.out.println("Cuanto mides");
        altura = sc.nextInt();

        Persona persona1 = new Persona(nombre, apellido,dni,edad,peso, altura);
        Persona persona2 = new Persona("Lucas","Martinez");
        Persona persona3 = new Persona();

        persona1.setEdad(20);
        persona2.setEdad(20);
        persona3.setEdad(20);

        System.out.println(persona1.imc());

        double IMCp1 = persona1.imc();
        if (IMCp1<18.5){
            System.out.println("Peso inferior al normal");
        } else if(IMCp1>18.5 && IMCp1<24.9){
            System.out.println("normal");
        } else if(IMCp1>25.0 && IMCp1<29.0){
            System.out.println("por encima");
        } else {
            System.out.println("sobrepeso");
        }
    }
}
