import java.util.ArrayList;
import java.util.Scanner;

public class Cuenta {
    Scanner sc = new Scanner(System.in);
    private int id,pin, saldo,sacar;


    //constructores
    public Cuenta(int id, int pin) {
        this.id = id;
        this.pin = pin;
        this.saldo = 0;
    }

    //metodos
    public void ingresarDinero(int cantidad){
        saldo += cantidad;
    }

    public void sacarDinero(int cantidad){
        saldo -= cantidad;
    }

    public boolean sacarTodo(){
        System.out.println("Quieres sacar los " + saldo + " que te quedan\n1.SI   0.NO");
        sacar = sc.nextInt();
        switch (sacar) {
            case 1:
                saldo = 0;
                System.out.println("Dinero sacado");
                return true;
            default:
                return false;
        }
    }

    //getter y setter
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
