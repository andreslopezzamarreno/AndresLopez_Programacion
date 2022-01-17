package ejercicio1;

public class Garaje {
    private Coche coche;
    private String averia;
    private int numCoches;

    //metodos
    public boolean aceptarCoche (Coche coche,String averia){
        if(this.coche != null){
            return false;
        }else {
            this.coche = coche;
            if(averia.equalsIgnoreCase("aceite")){
                coche.getMotor().setLaceite(coche.getMotor().getLaceite()+10);
            }
            numCoches ++;
            return true;
        }
    }
    public void devolverCoche (){
        this.coche = null;
    }

}
