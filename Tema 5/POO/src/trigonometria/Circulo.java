package trigonometria;

public class Circulo {
    //variables
    private double radio;
    private double diametro;
    private double area;

    //contructor
    public Circulo(){
    }
    public Circulo(double radio){
        this.radio = radio;
    }

    public void areaCirculo (){
        double area = Math.PI*(Math.pow(radio,2));
        this.area = area;
    }

    public void diametroCirculo(){
        double diametro = 2* radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getDiametro() {
        return diametro;
    }
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
}
