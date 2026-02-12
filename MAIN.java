import Preset.EstadoPedido;
import model.Pedido;
public class MAIN{
    public static void main(String[] args){
    System.out.println("=== SISTEMA DE GESTIÓN DE PEDIDOS ===");
    //datos del primer cliente con valores de Pedido.java
    Pedido p1 = new Pedido("Paquito");
//Metodos para agregar y mostrar pedido de los articulos dentro de Pedido.java
        p1.agregarArticulo("Hamburguesa Gourmet", 1, 2.50);
        p1.agregarArticulo("Patatas Rústicas", 5, 9.40);
        p1.agregarArticulo("Refresco Cola", 5, 2.50);
        p1.agregarArticulo("Tarta de Queso", 1, 7.00);
        p1.agregarArticulo("Café Solo", 1, 1.50);
        p1.agregarArticulo("Helado", 1, 3.00);
        p1.mostrarResumen();

        //Pruebas de los estados de EstadoPedido.java
        System.out.println("=== PRUEBA DE ESTADOS ===");

        p1.setEstado(EstadoPedido.LISTO_PARA_ENTREGAR);
        System.out.println("Estado actualizado a: " + p1.getEstado());

        p1.setEstado(EstadoPedido.PEDIDO_ENTREGADO);
        System.out.println("Estado actual: " + p1.getEstado());

        p1.setEstado(EstadoPedido.EN_PREPARACION);

        System.out.println("\n=== SEGUNDO PEDIDO ===");

        Pedido p2 = new Pedido("Agustina");
        p2.agregarArticulo("Sushi Combo", 1, 20.00);
        p2.mostrarResumen();
    }
}