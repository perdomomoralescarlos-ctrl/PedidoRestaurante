package model;

import Preset.EstadoPedido;

public class Pedido{
//Valores del archivo pedido
    private static int contadorPedidos = 1;
    private int idPedido;
    private String nombreCliente;
    private Articulo[] articulos;
    private int numArticulos;
    private EstadoPedido estado;
 //Constructor de pedidos
    public Pedido(String nombreCliente){
        this.idPedido =contadorPedidos++;
        this.nombreCliente = nombreCliente;
        this.articulos = new Articulo[5];
        this.numArticulos = 0;
        this.estado = EstadoPedido.EN_PREPARACION;
    }
    //Agrega articulos a menos que sean mayor a cinco
    public void agregarArticulo(String nombre, int cantidad, double precio){
        if(numArticulos >= 5){
            System.out.println("No se puede añadir mas de 5 articulos.");
            return;
        }
        articulos[numArticulos++] = new Articulo(nombre, cantidad, precio);
    }
    //Calculo del total
    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < numArticulos; i++){
            total += articulos[i].calcularSubtotal();
        }
        return total;
    }
    //El pedido cambia de estado sin poder retroceder.
    public void cambiarEstado(EstadoPedido nuevo){
        if(nuevo.ordinal() >= estado.ordinal()){
            estado = nuevo;
        } else {
            System.out.println("No se puede retroceder el estado.");
        }
    }

    // SET estado.
    public void setEstado(EstadoPedido nuevo) {
        if (nuevo.ordinal() >= estado.ordinal()) {
            estado = nuevo;
        } else {
            System.out.println("No se puede retroceder el estado.");
        }
    }

    // GET estado
    public EstadoPedido getEstado() {
        return estado;
    }
    //Muestra el resumen del pedido
    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Estado: " + estado);

        for (int i = 0; i < numArticulos; i++) {
            Articulo a = articulos[i];
            System.out.println(a.getNombre() + " x" + a.getCantidad() + " -> " + a.calcularSubtotal());
        }

        System.out.println("TOTAL: " + calcularTotal());
    }
}

