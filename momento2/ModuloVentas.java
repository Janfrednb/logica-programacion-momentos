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
        } while (opcionMenu != 4);

        elqueleetodo.close();
    }
}
