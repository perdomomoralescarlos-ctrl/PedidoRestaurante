import Preset.EstadoPedido;
import model.Pedido;
import model.Articulo;

public static void main(String[] args){
    System.out.println("=== SISTEMA DE GESTIÓN DE PEDIDOS ===");

    Pedido p1 = new Pedido("Paquito");

        p1.agregarArticulo("Hamburguesa Gourmet", 1, 2.50);
        p1.agregarArticulo("Patatas Rústicas", 5, 15.95);
        p1.agregarArticulo("Refresco Cola", 5, 5.50);
        p1.agregarArticulo("Tarta de Queso", 1, 10.00);
        p1.agregarArticulo("Café Solo", 1, 1.60);
        p1.agregarArticulo("Helado", 1, 3.00);
        p1.mostrarResumen();

        System.out.println("=== PRUEBA DE ESTADOS ===");
        p1.setEstado(EstadoPedido.PEDIDO_ENVIADO);
        System.out.println("Estado actualizado a: " + p1.getEstado());
        p1.setEstado(EstadoPedido.PEDIDO_ENTREGADO);
        System.out.println("Estado actual: " + p1.getEstado());
        p1.setEstado(EstadoPedido.PEDIDO_EN_PREPARACION);
        System.out.println("\n=== SEGUNDO PEDIDO ===");

        Pedido p2 = new Pedido("Agustina");
        p2.agregarArticulo("Sushi Combo", 1, 20.00);
        p2.mostrarResumen();
}