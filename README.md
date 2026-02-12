# PedidoRestaurante
Trabajo de Pro, En este trabajo mi compañero Damian y yo (Carlos) hemos hecho un pequeño programa,
para los pedidos de un restaurante, con su encapsulación, sus packages y sus métodos, constructores, valores etc...

A continuación haré un pequeño resumen de que hace cada archivo:

Articulo: Establece valores para los artículos del restaurante (Nombre, valor, cantidad) y añade métodos para dar el nombre, la cantidad, calcular el precio por cantidad de un mismo articulo (nombre:"Pollo Asado", cantidad:2, Precio:5 = 10 euros) y mostrar ese resultado.

Pedido: Valores de los pedidos (ID, nombreCliente, Articulos, etc...) que no puedan pedir más de 5 articulos del mismo tipo,
Calculo del total, cambio de los estados del pedido SIN poder volver a estados anteriores, Seters, Geters y muestra el resumen del pedido.

EstadoPedido: Valores predefinidos en Enums para los pedidos.

MAIN: Agrega articulos con los valores de Articulos, muestra el resumen del pedido, establece un estado, lo modifica siempre hacia delante.

Y Este seria el Resumen del funcionamiento del proyecto.
