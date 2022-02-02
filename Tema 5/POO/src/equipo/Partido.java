package equipo;

public class Partido {
    //variables
    private Equipo equipo1;
    private Equipo equipo2;
    private boolean jugando;
    private int parte;

    //constructor
    public Partido(Equipo equipo1, Equipo equipo2){
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    //metodos
    public void iniciarPartido (){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (equipo1.atacar()) {
                    if(equipo1.getNivelAtaque()> equipo2.getNivelDefensa()){
                        equipo1.setGoles(equipo1.getGoles() +1);
                    }
                }
                if (equipo2.atacar()) {
                    if(equipo2.getNivelAtaque()> equipo1.getNivelDefensa()){
                        equipo2.setGoles(equipo2.getGoles() +1);
                    }
                }
            }
        }
    }

    public void mostrarResultado(){
        System.out.println("\nEl resultado del partido es: \n"+ equipo1.getNombre() + " " + equipo1.getGoles()
        + " - " +equipo2.getGoles() + " "+ equipo2.getNombre());
    }
}
