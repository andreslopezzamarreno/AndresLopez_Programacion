package parteB;

import java.util.ArrayList;

public class Pizza {
    private String nombre;
    private double precio = 3;
    private ArrayList<Ingrediente> listaIngredientes;
    private int id;
    private boolean estado;

    //constructor
    public Pizza(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        listaIngredientes = new ArrayList<>();
    }

    //metodos
    public void agregarIngredientes(Ingrediente ingrediente) {
        listaIngredientes.add(ingrediente);
        precio += ingrediente.getPrecio();
    }

    public void verDatos() {
        System.out.println("Nombre: " + nombre + "\nPrecio: " + precio + "\nId: " + id + "\nIngredientes: ");
        for (Ingrediente item : listaIngredientes) {
            System.out.println("   -" + item.getNombre() + ": " + item.getPrecio() + " €");
        }
        System.out.println("Estado: " + estado + "\n");
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
