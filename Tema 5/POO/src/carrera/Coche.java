package carrera;

public class Coche {
    //variables
    private int cv;
    private int velocidad;
    private String matricula;
    private String modelo;
    private double kmRecorridos;

    //constructores
    public Coche() {
        this.cv = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = "Sin especificar";
        this.kmRecorridos = 0.0;
    }

    public Coche(String modelo, String matricula, int cv) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.velocidad = 0;
        this.kmRecorridos = 0.0;
    }

    //metodos
    public void acelerear(int aumento) {
        if (velocidad + aumento > 180) {
            velocidad = 180;
        } else {
            velocidad += aumento;
        }
        int aleatorio = (int) (Math.random() * 10) + 1;
        kmRecorridos = velocidad * (cv * aleatorio);
    }


    public void frenar(int decremento) {
        if (velocidad - decremento <= 0) {
            velocidad = 0;
        } else {
            velocidad -= decremento;
        }
    }


    public void parar() {
        velocidad = 0;
    }

    public void resetear() {
        velocidad = 0;
        kmRecorridos = 0;
    }

    public void mostrarDatos() {
        System.out.println("Modelo: " + modelo + "\nMatricula: " + matricula + "\nCV: " + cv + "\nVelocidad: " + velocidad +
                "\nKilometros recorridos: " + kmRecorridos + "\n");
    }


    //getter y setter
    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
