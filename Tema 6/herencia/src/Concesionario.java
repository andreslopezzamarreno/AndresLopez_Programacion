import java.util.ArrayList;

public class Concesionario {
    private ArrayList<Coche> coches;
    private boolean encontrado;
    private int deportivos;
    private int electricos;
    private int suv;
    private int utilitario;

    public Concesionario(){
        coches = new ArrayList<>();
    }

    public Coche existeCoche(String matricula){
        boolean existe = false;
        Coche cocheEncontrado = null;
        for ( Coche item: coches) {
            if(matricula.equalsIgnoreCase(item.matricula)){
                cocheEncontrado = item;
                existe = true;
                return cocheEncontrado;
            }
        }
        return cocheEncontrado;
    }

    public void agregar(Coche coche){
        if (existeCoche(coche.getMatricula())== null){
            coches.add(coche);
            System.out.println("Coche añadido");
            System.out.println(" ");
        }
    }

    public void buscar(Coche coche){

        for (Coche item: coches) {
            if (coche.matricula.equalsIgnoreCase(item.matricula)){
                System.out.println("Coche encontrado");
                item.mostrarDatos();
                System.out.println(" ");
            }
        }
    }

    public void borrar(String matricula){
        if (existeCoche(matricula)!=null){
            coches.remove(existeCoche(matricula));
        }
    }

    public void listar(){
        for (Coche item: coches) {
            item.mostrarDatos();
            System.out.println(" ");
        }
    }

    public void clasificar(){
        for ( Coche item: coches) {
            if (item instanceof Deportivo){
                deportivos ++;
            }else if(item instanceof Electrico){
                electricos ++;
            }else if(item instanceof Suv){
                suv ++;
            }else if(item instanceof Utilitario){
                utilitario ++;
            }
        }
        System.out.println("Deportivos: " +deportivos +"\nElectricos: " + electricos + "\nSuv: " + suv + "\nUtilitario: " + utilitario);
    }
}
