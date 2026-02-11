public class Pedido{
    private int contadorPedidos = 1;

    private final int idPedido;
    private String nombreCliente;
    private Articulo[] articulos;
    private int numArticulos;
    private EstadoPedido PEDIDO_EN_ESPERA;
 
    public Pedido(Strign nombreCliente){
        this.idPedido =++contadorPedidos;
        this.nombreCliente = nombreCliente;
        this.articulos = new Arituclos[5];
        this.numArticulos = 0;
        this.estado = EstadoPedido.EN_PREPARACION;
    }
}