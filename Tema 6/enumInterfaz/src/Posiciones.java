public enum Posiciones {

    //objetos precargados
    //si quiero sacar el nombre se hace un .name()
    portero("Portero",1000), defensa("Defensa",1500),
    medio("Mediocentro",2000), delantero("Delantero",3000);

    //variables
    String definicion;
    int valor;

    //cosntructores
    Posiciones(){}

    Posiciones(String definicion, int valor) {
        this.definicion = definicion;
        this.valor = valor;
    }

    //metodos



    //getter y setter
    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
