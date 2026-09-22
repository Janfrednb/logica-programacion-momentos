Desafío 1: Costeo y Fijación de Precio Base 
Issue: CAT-001  
Title: Cálculo secuencial de costo de adquisición y precio final al público 
Description: El módulo de inventario requiere registrar financieramente cada nuevo producto que ingresa al catálogo.  
El sistema debe solicitar al operario: el nombre del producto, el costo base de fabricación/compra y el porcentaje de ganancia esperado por la tienda (Cada producto se le ingresa un porcentaje de ganancia esperado).

El algoritmo debe calcular: 
1. El valor monetario de la ganancia. 
2. El subtotal (costo base + ganancia). 
3. El impuesto del IVA (Constante fija del 19%) aplicado sobre el subtotal. 
4. El precio final de venta al público.  
5. El sistema debe imprimir un recibo con el desglose exacto de estos 4 valores calculados.

Criterios de Aceptación: 
• Se debe evidenciar una separación estricta de los bloques de Entrada, Proceso y Salida. 
• Se prohíbe el uso de "números mágicos" en las operaciones. El 19% del IVA debe ser declarado como una Constante. 

Datos para Prueba de Escritorio:  Costo base = $50000, Ganancia esperada = 25%. 
(El precio final esperado en la prueba debe ser $74375). 

-----------------------------------------------------------------------------------------------------

INICIO
//Entrada
definir nombreProducto = string;
definir costoBase, porcentajeGanancia = real / double;
definir const IVA = 0.19 decimal;
definir valorGanancia, subtotal, impuestoIVA, precioFinal = real / double;
imprimir "Ingrese Nombre del Producto: ";
leer nombreProducto;
imprimir "Ingrese Costo Base del Producto: ";
leer costoBase;
imprimir "Ingrese Porcentaje de Ganancia del Producto: ";
leer porcentajeGanancia;

//Proceso
valorGanancia <- costoBase * porcentajeGanancia;
subtotal <- costoBase + valorGanancia;
impuestoIVA <- subtotal * IVA;
precioFinal <- subtotal + impuestoIVA;

//Salida
escribir "El valor monetario de la ganancia es: ", valorGanancia;
escribir "El valor del subtotal es: ", subtotal;
escribir "El valor del impuesto del IVA aplicado es: ", impuestoIVA;
escribir "El valor de precio final al publico es: ", precioFinal;
FIN