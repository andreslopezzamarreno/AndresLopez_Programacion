public class Entrada {

    //anbito de clase
    //String nombre = "Andres";

    public static void main(String[] args) {

        //ambito de metrodo - local
        //String nombre2 = "andres";
        Usuarios usuario1 = new Usuarios();
        //correoElectronico=por defecto , nombre=por defecto, apellidos=null, password=null, fecha=null, edad=0

        Usuarios usuario2 = new Usuarios();
        //correoElectronico=por defecto, nombre=por defecto, apellidos=null, password=null, fecha=null, edad=0

        Usuarios usuario3 = new Usuarios("andres.lopez@cesjuanpablosegundo.es","andres","pass");
        //correoElectronico=andres.lopez@cesjuanpablosegundo.es, nombre=andres, apellidos=null, password=pass, fecha=null, edad=0

        Usuarios usuario4 = new Usuarios("juan.alberto@gmail.com","pass2", 20);
        //correoElectronico=juan.alberto@gmail.com, nombre=null, apellidos=null, password=pass2, fecha=null, edad=20

        /*usuario1.password = "contraseña";
        //correoElectronico=por defecto , nombre=por defecto, apellidos=null, password=contraseña, fecha=null, edad=0
        System.out.println(usuario1.password);*/

        System.out.println(usuario1.getPassword());
        usuario1.setPassword("contraseña2");
        
    }
}
