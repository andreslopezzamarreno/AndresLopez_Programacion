package TrigonometriaHerencia;

public abstract class Figura {
    //variables
    protected double area, perimetro;

    //constructores
    public Figura() {
    }

    //metodos
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    //getter y setter
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
