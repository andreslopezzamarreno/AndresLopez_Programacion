package parteB;

import java.util.ArrayList;

public class Pizzeria {
    //variables
    private ArrayList<Pizza> pizzas;
    private double caja;
    private ArrayList<Ingrediente> ingredientesDisponibles;
    private int posicion = 0;

    Ingrediente cebolla = new Ingrediente("Cebolla", 1.10);
    Ingrediente pollo = new Ingrediente("Pollo", 2.2);
    Ingrediente cerdo = new Ingrediente("Cerdo", 2.2);
    Ingrediente bacon = new Ingrediente("Bacon", 2.2);
    Ingrediente barbacoa = new Ingrediente("Barbacoa", 2);
    Ingrediente champiñones = new Ingrediente("Champiñones", 1.9);
    Ingrediente pimiento = new Ingrediente("Pimiento", 1);
    Ingrediente queso = new Ingrediente("Queso", 2.5);
    Ingrediente piña = new Ingrediente("Piña", 0.9);
    Ingrediente salami = new Ingrediente("Salami", 1.6);

    //constructor
    public Pizzeria() {
        pizzas = new ArrayList<>();
        ingredientesDisponibles = new ArrayList<>();
        ingredientesDisponibles.add(cebolla);
        ingredientesDisponibles.add(pollo);
        ingredientesDisponibles.add(cerdo);
        ingredientesDisponibles.add(bacon);
        ingredientesDisponibles.add(barbacoa);
        ingredientesDisponibles.add(champiñones);
        ingredientesDisponibles.add(pimiento);
        ingredientesDisponibles.add(queso);
        ingredientesDisponibles.add(piña);
        ingredientesDisponibles.add(salami);
    }

    //metodos
    public void agregarPedido(Pizza pizza) {
        pizzas.add(pizza);
        caja += pizza.getPrecio();
    }

    public boolean verEstadoPedido(int id) {
        return pizzas.get(id).isEstado();
    }

    public void servirPedido(int id) {
        for (Pizza item : pizzas) {
            if (item.getId() == id) {
                item.setEstado(true);
            }
        }
    }

    public void mostrarPedidosPendientes() {
        for (Pizza item : pizzas) {
            if (!item.isEstado()) {
                item.verDatos();
            }
        }
    }

    //getter y setter
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }

    public ArrayList<Ingrediente> getIngredientesDisponibles() {
        return ingredientesDisponibles;
    }

    public void setIngredientesDisponibles(ArrayList<Ingrediente> ingredientesDisponibles) {
        this.ingredientesDisponibles = ingredientesDisponibles;
    }
}
