public class Partido {

    private Equipo equipoLocal,equipoVisitante;
    private boolean jugado;
    private int golesLocal, golesVisitante;


    public Partido() {
    }

    public void agregarLocales(){
        golesLocal += (int)(Math.random()*3);
    }

    public void agregarVisitante(){
        golesVisitante += (int)(Math.random()*3);
    }

    public void mostrarResultado(){
        System.out.printf("%s: %d - %s: %d \n",equipoLocal.getNombre(),
                golesLocal, equipoVisitante.getNombre(), getGolesVisitante() );
    }

    public void repartirPuntos(){
        if (golesVisitante == golesLocal){
            this.equipoLocal.setPuntos(equipoLocal.getPuntos()+1);
            this.equipoVisitante.setPuntos(equipoVisitante.getPuntos()+1);
        } else if (golesVisitante > golesLocal){

            this.equipoVisitante.setPuntos(equipoVisitante.getPuntos()+3);
        } else if (golesVisitante < golesLocal){

            this.equipoLocal.setPuntos(equipoLocal.getPuntos()+3);
        }
    }

    public void reiniciarPartido(){
        golesVisitante=0;
        golesLocal=0;
    }

    public void escribirClaficacion(){
        if (equipoLocal.getPuntos()< equipoVisitante.getPuntos()){
            System.out.println("1- Sevilla: "+equipoVisitante.getPuntos());
            System.out.println("2- Atleti "+equipoLocal.getPuntos());
        } else {
            System.out.println("1- Atletico: "+equipoLocal.getPuntos());
            System.out.println("2- Sevilla "+equipoVisitante.getPuntos());
        }
    }




    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    class Equipo{

        private String nombre;
        private int puntos;

        public Equipo(String nombre) {
            this.nombre = nombre;
            if (nombre.equalsIgnoreCase("atleti")){
                setEquipoLocal(this);
            }else if(nombre.equalsIgnoreCase("sevilla")){
                setEquipoVisitante(this);
            }
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }
    }
}
