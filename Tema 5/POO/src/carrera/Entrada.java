package carrera;

public class Entrada {
    public static void main(String[] args) {
        final int kilometrosEtapa = 10000;
        Coche coche1 = new Coche();
        Coche coche2 = new Coche("Audi TT", "3784HRS", 233);


        coche1.setModelo("Mercedes Clase A");
        coche1.setMatricula("5675HPC");
        coche1.setCv(190);

        do {
            coche1.acelerear((int) (Math.random()*7));
            coche2.acelerear((int) (Math.random()*7));

        }while(coche2.getKmRecorridos()<kilometrosEtapa ||coche1.getKmRecorridos()<kilometrosEtapa);

        if (coche1.getKmRecorridos() > coche2.getKmRecorridos()) {
            System.out.println("El coche ganador es: " + coche1.getModelo() + " con matricula " + coche1.getMatricula() + " y " + coche1.getCv() + " CV\n");
        } else {
            System.out.println("El coche ganador es: " + coche2.getModelo() + " con matricula " + coche2.getMatricula() + " y " + coche2.getCv() + " CV\n");
        }
        coche1.mostrarDatos();
        coche2.mostrarDatos();
    }
}
