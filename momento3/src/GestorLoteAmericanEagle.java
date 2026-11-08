
import java.util.Scanner;

public class GestorLoteAmericanEagle {
    public static void main(String[] args) {
        String[] loteColeccion = { "Pantaloneta de Veranera", "Jean", "Camiseta", null, null };

        Scanner lectorTeclado = new Scanner(System.in);

        int opcionMenu = 0;

        do {
            System.out.println("01. Listar colección");
            System.out.println("02. Buscar referencia en lote");
            System.out.println("03. Ingresar prenda al lote");
            System.out.println("04. Salir");
            System.out.println("Seleccione una opción: ");
            opcionMenu = lectorTeclado.nextInt();
            switch (opcionMenu) {
                case 1:
                    for (int i = 0; i < loteColeccion.length; i++) {
                        if (loteColeccion[i] != null) {
                            System.out.println(loteColeccion[i]);
                        }

                    }
                    break;
                case 2:
                    System.out.println("Buscando referencia en el lote");
                    break;
                case 3:
                    System.out.println("Ingresando prenda al lote");
                    break;
                case 4:
                    System.out.println("Finalizando menú");
                    break;
                default:
                    System.out.println("Opción no valida, intente nuevamente");
                    break;
            }
        } while (opcionMenu != 4);

        lectorTeclado.close();
    }

}
