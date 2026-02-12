package model;

import Preset.EstadoPedido;

public class Pedido{

    private static int contadorPedidos = 1;

    private int idPedido;
    private String nombreCliente;
    private Articulo[] articulos;
    private int numArticulos;
    private EstadoPedido estado;
 
    public Pedido(String nombreCliente){
        this.idPedido =++contadorPedidos;
        this.nombreCliente = nombreCliente;
        this.articulos = new Articulo[5];
        this.numArticulos = 0;
        this.estado = EstadoPedido.PEDIDO_EN_PREPARACION;
    }
    public void agregarArticulo(String nombre, int cantidad, double precio){
        if(numArticulos >= 5){
            System.out.println("No se puede añadir mas de 5 articulos.");
            return;
        }
        articulos[numArticulos++] = new Articulo(nombre, cantidad, precio);
    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < numArticulos; i++){
            total += articulos[i].calcularSubtotal();
        }
        return total;
    }

    public void cambiarEstado(EstadoPedido nuevo){
        if(nuevo.ordinal() >= estado.ordinal()){
            estado = nuevo;
        } else {
            System.out.println("No se puede retroceder el estado.");
        }
    }

    public void mostrarResumen(){
        System.out.println("Pedido #" + idPedido);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Estado: " + estado);
        for(int i = 0; i < numArticulos; i++){
            Articulo a = articulos[i];
            System.out.println(a.getNombre() + " x" + a.getCantidad() + " -> " + a.calcularSubtotal());
        }
        System.out.println("TOTAL: " + calcularTotal());
    }
    public String getEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEstado'");
    }
    public void setEstado(EstadoPedido pedidoEnPreparacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEstado'");
    }
}
