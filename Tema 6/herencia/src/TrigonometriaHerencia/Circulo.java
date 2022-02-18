package TrigonometriaHerencia;

public final class Circulo extends Figura {
    //variables
    private double radio, diametro;

    //constructores
    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(){}

    //metodos
    @Override
    public double calcularArea() {
        this.area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    public double calcularDiametro() {
        this.diametro = radio * 2;
        return diametro;
    }

    //getter y setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
