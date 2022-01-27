package trigonometria;

public class Triangulo {
    //variables
    private int base;
    private int altura;
    private double area;

    //constructores
    public Triangulo(){

    }
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    //metodos
    public void areaTriangulo(){
        double area = (double )(base *altura)/2;
        this.area = area;
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
}
