import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Torneo {

    //variables
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;
    private String nombre;

    //constructor
    public Torneo(String nombre) {
        this.nombre = nombre;
        partidos = new ArrayList<>();
        equipos = new ArrayList<>();
    }

    //metodos
    public void realizarSorteo() {
        for (int i = 0; i < equipos.size() - 1; i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                Partido partido = new Partido(equipos.get(i), equipos.get(j));
                partidos.add(partido);
            }
        }

        for (int i = equipos.size() - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                Partido partido = new Partido(equipos.get(i), equipos.get(j));
                partidos.add(partido);
            }
        }

        Collections.shuffle(partidos);
    }

    public void mostrarPartidos() {
        for (Partido item : partidos) {
            item.mostrarDatosPartido();
        }
    }

    public void jugarTorneo() {
        for (Partido item : partidos) {
            item.jugar();
            item.setJugado(true);
        }
    }

    public void verPuntos() {
        for (Equipo item : equipos) {
            System.out.println(item.nombre + ": " + item.puntos);
        }
    }

    public void clasificar() {
        Collections.sort(equipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                if(o1.getPuntos()>o2.getPuntos()){
                    return -1;
                }
                return 0;
            }
        });
        verPuntos();
    }


    //getter y setter
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    class Partido {

        //variables
        private Equipo equipoLocal, equipoVisitante;
        private int golesLocal, golesVisitante;
        private boolean jugado;

        //constructor
        public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
            this.equipoLocal = equipoLocal;
            this.equipoVisitante = equipoVisitante;

        }

        //metodos
        public void agregarGolLocal() {
            if (equipoLocal.nivelAtaque > equipoVisitante.nivelDefensa) {
                golesLocal = (int) (Math.random() * 3);
            }
        }

        public void agregarGolVisitante() {
            if (equipoVisitante.nivelAtaque > equipoLocal.nivelDefensa) {
                golesVisitante = (int) (Math.random() * 3);
            }
        }

        public void jugar() {
            for (int i = 0; i < 2; i++) {
                agregarGolLocal();
                agregarGolVisitante();
            }
            repartirPuntos();
            //System.out.println(equipoLocal.nombre + ": " + golesLocal + " -  " + equipoVisitante.nombre + ": " + golesVisitante);
        }

        public void mostrarDatosPartido() {
            System.out.println(equipoLocal.nombre + " - " + equipoVisitante.nombre);
        }

        public void repartirPuntos() {
            if (golesVisitante == golesLocal) {
                this.equipoLocal.setPuntos(equipoLocal.getPuntos() + 1);
                this.equipoVisitante.setPuntos(equipoVisitante.getPuntos() + 1);
            } else if (golesVisitante > golesLocal) {
                this.equipoVisitante.setPuntos(equipoVisitante.getPuntos() + 3);
            } else if (golesVisitante < golesLocal) {
                this.equipoLocal.setPuntos(equipoLocal.getPuntos() + 3);
            }
        }

        //getter y setter
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

        public boolean isJugado() {
            return jugado;
        }

        public void setJugado(boolean jugado) {
            this.jugado = jugado;
        }
    }

    static class Equipo {

        //variables
        private int golesEncuentro, puntos, nivelAtaque, nivelDefensa;
        private String nombre;

        //constructor
        public Equipo(String nombre) {
            this.puntos = 0;
            this.nombre = nombre;
            this.nivelAtaque = (int) (Math.random() * 101);
            this.nivelDefensa = (int) (Math.random() * 101);

        }

        //metodos
        public void inscribirTorneo(Torneo torneo) {
            torneo.getEquipos().add(this);
        }

        //getter y setter
        public int getGolesEncuentro() {
            return golesEncuentro;
        }

        public void setGolesEncuentro(int golesEncuentro) {
            this.golesEncuentro = golesEncuentro;
        }

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }

        public int getNivelAtaque() {
            return nivelAtaque;
        }

        public void setNivelAtaque(int nivelAtaque) {
            this.nivelAtaque = nivelAtaque;
        }

        public int getNivelDefensa() {
            return nivelDefensa;
        }

        public void setNivelDefensa(int nivelDefensa) {
            this.nivelDefensa = nivelDefensa;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
}
