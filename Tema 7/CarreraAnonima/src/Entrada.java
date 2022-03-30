import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        int opcion,opcion2,id;
        String tipo;
        int numRuedas, cc,cv;
        double peso;
        Scanner sc = new Scanner(System.in);
        Carrera carrera = new Carrera();

        do {
            System.out.println("Que quieres hacer \n1.Validar Vehiculo\n2.Generar Ganador\n3.Ver ganador\n-1.salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ID Coche");
                    id = sc.nextInt();
                    System.out.println("Tipo de vehiculo");
                    tipo = sc.next();
                    System.out.println("Numero de ruedas");
                    numRuedas = sc.nextInt();
                    System.out.println("CC");
                    cc = sc.nextInt();
                    System.out.println("CV");
                    cv = sc.nextInt();
                    System.out.println("Peso");
                    peso = sc.nextDouble();
                    Vehiculo vehiculo = new Vehiculo(id, tipo,numRuedas,cc,cv,peso) {
                        @Override
                        public void reprogramarMotor(int opcion) {
                            switch (opcion){
                                case 1:
                                    cv = cv + (cv * (25/100));
                                    break;
                                case 2:
                                    cc = cc + (cc * (35/100));
                                    break;
                                case 3:
                                    peso = peso - (peso * (15/100));
                                    break;
                            }
                        }
                    };
                    Validacion validacion = new Validacion() {
                        @Override
                        public boolean validar(Vehiculo vehiculo) {
                            if(vehiculo.tipo.equalsIgnoreCase("coche")
                                    && vehiculo.numRuedas == 4 && vehiculo.cc >= 300){
                                return true;
                            }else if(vehiculo.tipo.equalsIgnoreCase("motocicleta")
                            && vehiculo.numRuedas == 2 && vehiculo.cc <300){
                                return true;
                            }else if(vehiculo.tipo.equalsIgnoreCase("camion")
                                    && vehiculo.numRuedas > 4 && vehiculo.peso >1000){
                                return true;
                            }
                            System.out.println("NO VALIDADO");
                            return false;
                        }
                    };
                    System.out.println("Que reprogramacion quieres\n1.+ CV\n2. + CC\n3. - Peso");
                    opcion = sc.nextInt();
                    vehiculo.reprogramarMotor(opcion);
                    carrera.validar(vehiculo,validacion);
                    break;
                case 2:
                    carrera.generarGanador();
                    break;
                case 3:
                    carrera.getGanador().mostrarDatos();
                    break;
            }

        }while (opcion != -1);
    }
}
