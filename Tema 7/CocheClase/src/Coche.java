public class Coche {

    private int velocidad;
    private double precio;
    private String marca,modelo;
    private Motor motor;

    public Coche(int precio, int velocidad, String marca, String modelo) {
        this.precio = precio;
        this.velocidad = velocidad;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarDatos(){
        System.out.println(precio);
        System.out.println(velocidad);
        System.out.println(marca);
        System.out.println(modelo);
        if (motor!=null) {
            motor.mostrarDatos();
        }else{
            System.out.println("El coche aun no tiene motor");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
        if (motor.cv<=50){
            precio = (precio + (precio * 0.25));
        }else if (motor.cv>50 && motor.cv<=100){
            precio = (precio + (precio * 0.4));
        }else if (motor.cv >100 && motor.cv<=200){
            precio = (precio + (precio * 0.6));
        }else if (motor.cv>200){
            precio = (precio + (precio * 0.8));
        }

    }

    class Motor{
        private int  cv,cc;

        public Motor(int cv, int cc) {
            this.cv = cv;
            this.cc = cc;
            setMotor(this);
        }

        public void mostrarDatos(){
            System.out.println(cc);
            System.out.println(cv);
        }


        public int getCv() {
            return cv;
        }

        public void setCv(int cv) {
            this.cv = cv;
        }

        public int getCc() {
            return cc;
        }

        public void setCc(int cc) {
            this.cc = cc;
        }
    }
}
