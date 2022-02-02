package consumicionAplicacion;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        Articulo cafe = new Articulo("cafe", 1);
        Articulo bocata = new Articulo("bocata", 3);
        Articulo bebida = new Articulo("bebida" , 2);

        Cuenta cuenta1 = new Cuenta(1);
        Cuenta cuenta2 = new Cuenta(2);

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);

        cuenta1.agregarArticulo(cafe);
        cuenta1.agregarArticulo(cafe);
        cuenta1.agregarArticulo(cafe);
        cuenta1.agregarArticulo(bocata);
        cuenta1.agregarArticulo(bebida);
        cuenta1.agregarArticulo(bebida);

        cuenta2.agregarArticulo(cafe);
        cuenta2.agregarArticulo(bocata);
        cuenta2.agregarArticulo(bebida);
        cuenta2.agregarArticulo(bebida);
        cuenta2.agregarArticulo(bebida);
        cuenta2.agregarArticulo(bebida);
        cuenta2.agregarArticulo(bebida);
        cuenta2.agregarArticulo(bebida);

        System.out.println(cuenta1.numeroArticulos());
        System.out.println(cuenta2.numeroArticulos());

        System.out.println(cuenta1.pagarCuenta());
        System.out.println(cuenta2.pagarCuenta());
    }
}
