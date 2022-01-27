package trigonometria;

public class Cuadrado {
    private int base;
    private int altura;
    private double area;
    private double perimetro;

    //constructor
    public Cuadrado(){

    }
    public Cuadrado(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void area(){
        int area = base * altura;
        this.area = area;
    }
    public void perimetro(){
        int perimetro = 2*base + 2* altura;
        this.perimetro = perimetro;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
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
