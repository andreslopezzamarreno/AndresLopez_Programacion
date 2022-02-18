package TrigonometriaHerencia;

public final class Triangulo extends Figura {
    //variables
    private double base, altura;

    //constructores
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){}

    //metodos
    @Override
    public double calcularArea() {
        this.area = (base * altura) / 2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        this.perimetro = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2)) * 2 + base;
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
