package ejercicio1;

public class Motor {
    private int laceite;
    private int cv;

    public Motor (int cv){
        this.laceite = 0;
        this.cv = cv;
    }

    public Motor (int cv,int laceite){
        this.laceite = laceite;
        this.cv = cv;
    }

    public int getLaceite() {
        return laceite;
    }
    public void setLaceite(int laceite) {
        this.laceite = laceite;
    }
    public int getCv() {
        return cv;
    }

}
