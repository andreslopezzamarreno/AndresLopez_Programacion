package cajero;

import java.util.Scanner;

public class Cuenta {
    private Scanner sc = new Scanner(System.in);
    private int id;
    private int pin;
    private double saldo;
    private Persona persona;

    private int opcion;
    private String nombre;
    private String apellido;

    public Cuenta(Persona persona, int id, int pin) {
        this.persona = persona;
        this.id = id;
        this.pin = pin;
    }


    //metodos
    

    public void ingresarSaldo(double cantidad) {
        this.saldo += cantidad;
    }

    public void sacarDinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= cantidad;
        }

    }

    public void verCuenta() {
        System.out.println("El saldo actual de la cuenta es: " + saldo);
    }
    


    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
