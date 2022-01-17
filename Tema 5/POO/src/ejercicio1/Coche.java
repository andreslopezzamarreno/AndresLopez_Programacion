package ejercicio1;

public class Coche {
    private Motor motor;
    private String marca;
    private String modelo;
    private double costeAverias;

    public Coche (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public  Coche (Motor motor, String marca, String modelo){
        this.motor = motor;
        this.marca = marca;
        this.modelo = modelo;
    }
    public void acumularAveria(double costeAverias){
        this.costeAverias += costeAverias;
    }

    public Motor getMotor() {
        return motor;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getCosteAverias() {
        return costeAverias;
    }
}
