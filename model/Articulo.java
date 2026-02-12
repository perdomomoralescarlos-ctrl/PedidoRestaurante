package model;

public class Articulo {
    //Valores para los Articulos
    private String nombre;
    private int cantidad;
    private double precioUnitario;
//Constructor
    public Articulo(String nombre, int cantidad, double precioUnitario){
        this.nombre= nombre;
        this.cantidad= cantidad;
        this.precioUnitario= precioUnitario;
    }
//Calcula el precio segun la cantidad y precio
    public double calcularSubtotal(){
        return cantidad * precioUnitario;
    }
//Da el nombre del objeto
    public String getNombre(){
        return nombre;
    }
//Da la cantidad de objetos
    public int getCantidad(){
        return cantidad;
    }
//Da el precio unitario 
    public double getPrecioUnitario(){
        return precioUnitario;
    }
}
