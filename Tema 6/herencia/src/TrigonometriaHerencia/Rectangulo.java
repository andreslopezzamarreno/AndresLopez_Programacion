package TrigonometriaHerencia;

public final class Rectangulo extends Figura {
    //variables
    private double base, altura;

    //constructores
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(){}

    //metodos
    @Override
    public double calcularArea() {
        this.area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = 2 * base + 2 * altura;
        return perimetro;
    }

    //getter y setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
