package Genericos;

public class Entrada {

    public static void main(String[] args) {


        Coleccion<Disco,Double, Boolean> coleccionDiscos = new Coleccion();
        coleccionDiscos.agregasCosas(new Disco());


        Coleccion<Camiseta,Character,String> coleccionCamisetas = new Coleccion();
        coleccionCamisetas.agregasCosas(new Camiseta());


        //Coleccion<Partido,Integer,> coleccionPartido = new Coleccion();
        //coleccionPartido.agregasCosas(new Partido());

        //Coleccion<Coche> coleccionCoches = new Coleccion();
        //coleccionCoches.agregasCosas(new Coche());

        /*Coleccion<Coleccionable> coleccionColeccionables = new Coleccion<>();
        coleccionColeccionables.agregasCosas(new Disco());
        coleccionColeccionables.agregasCosas(new Camiseta());*/

        ColeccionEspecifica<Disco> listaEspecifica = new ColeccionEspecifica();
        ColeccionEspecifica<Camiseta> listaEspecifica2 = new ColeccionEspecifica();

    }
}
