package Anonimas;

public class Entrada {
    public static void main(String[] args) {
        ClaseC claseC = new ClaseC();
        ClaseB claseB = new ClaseB();
        ClaseA claseA = new ClaseA() {
            @Override
            public void mostrarMensaje() {
                System.out.println("Comportamiento diferente");
            }

            @Override
            public void mensajeAbastracto() {
                System.out.println("El mensaje abs de la clase A");
            }
        };
        ClaseA claseA1 = new ClaseA() {
            @Override
            public void mensajeAbastracto() {
                System.out.println("Mensaje abstracto Diferente");
            }
        };

        claseC.registrarmensaje(claseA);
        claseC.registrarmensaje(claseA1);
        claseC.registrarmensaje(new ClaseA() {
            @Override
            public void mensajeAbastracto() {
                System.out.println("Mensaje desde una anonima 100%");
            }
        });


    }
}
