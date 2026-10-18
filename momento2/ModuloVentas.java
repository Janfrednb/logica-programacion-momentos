import java.util.Scanner;

public class ModuloVentas {
    
    public static void main(String[] args) {
        Scanner elqueleetodo = new Scanner(System.in);

        final double PRECIO_CASE_IPHONE = 80000;
        final double PRECIO_CARGADOR_IPHONE = 130000;
        final double PRECIO_IPHONE_18_PRO_MAX = 6200000;
        final double IVA = 0.19; 
        final double DESCUENTO = 0.10; 
        final double MONTO_MINIMO_DESCUENTO = 100000; 

        double totalBruto = 0;
        int totalProductos = 0;
        int totalProductosPremium = 0;
        int opcionMenu = 0;


        do { 
            System.out.println("1. Case Iphone (Basico) valor = $80.000");
            System.out.println("2. Cargador Iphone (Medio) valor = $130.000");
            System.out.println("3. Iphone 18 Pro Max (Premium) valor = $6.200.000");
            System.out.println("4. Finalizar Compra");
            System.out.println("Seleccione una Opción");
            opcionMenu = elqueleetodo.nextInt();
            if (opcionMenu == 1) {
                totalBruto = totalBruto + PRECIO_CASE_IPHONE; 
                totalProductos++;
        } else if (opcionMenu == 2) {
                totalBruto = totalBruto + PRECIO_CARGADOR_IPHONE;
                totalProductos++;
        } else if (opcionMenu == 3) {
                totalBruto = totalBruto + PRECIO_IPHONE_18_PRO_MAX;
                totalProductos++;
                totalProductosPremium++;
        } else if (opcionMenu == 4) {
            System.out.println("Finalizando Venta");
        } else {
            System.out.println("Error Fulminante, Intente de nuevo");
        }
        
        } while (opcionMenu != 4);

         double valorDescuento = 0;
            if (totalBruto > MONTO_MINIMO_DESCUENTO) {
                valorDescuento = totalBruto * DESCUENTO;
        }
         double valorConDescuento = totalBruto - valorDescuento;
         double valorIva = valorConDescuento * IVA;
         double totalPagar = valorConDescuento + valorIva;
        double porcentajePremium = 0;
        if (totalProductos > 0) {
            porcentajePremium = ((double) totalProductosPremium / totalProductos) * 100;
        }
        System.out.println("=================FACTURA===============");
        System.out.println("Productos vendidos: " + totalProductos);
        System.out.println("Precio total sin descuento y sin IVA: " + totalBruto);
        System.out.println("Descuento aplicado: " + valorDescuento);
        System.out.println("Valor con descuento: " + valorConDescuento);
        System.out.println("IVA: " + valorIva);
        System.out.println("Total a pagar: " + totalPagar);
        System.out.println("Porcentaje de productos premium: " + porcentajePremium + "%");

        elqueleetodo.close();
    }
}
