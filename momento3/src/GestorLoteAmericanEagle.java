
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
                    lectorTeclado.nextLine();
                    System.out.print("Ingrese el nombre de la prenda: ");
                    String nombreBuscado = lectorTeclado.nextLine();

                    boolean prendaEncontrada = buscarReferencia(loteColeccion, nombreBuscado);

                    if (prendaEncontrada) {
                        System.out.println("La prenda " + nombreBuscado + " está en el lote");
                    } else {
                        System.out.println("La prenda " + nombreBuscado + " no está en el lote");
                    }
                    break;
                case 3:
                    lectorTeclado.nextLine();
                    System.out.print("Ingrese el nombre de la nueva prenda: ");
                    String nuevaPrenda = lectorTeclado.nextLine();

                    boolean prendaGuardada = false;

                    for (int i = 0; i < loteColeccion.length; i++) {
                        if (loteColeccion[i] == null) {
                            loteColeccion[i] = nuevaPrenda;
                            prendaGuardada = true;
                            break;
                        }
                    }

                    if (prendaGuardada) {
                        System.out.println("La prenda " + nuevaPrenda + " fue guardada en el lote");
                    } else {
                        System.out.println("El lote está lleno, no se pudo guardar la prenda");
                    }
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

    public static boolean buscarReferencia(String[] loteColeccion, String nombreBuscado) {
        for (int i = 0; i < loteColeccion.length; i++) {
            if (loteColeccion[i] != null && loteColeccion[i].equals(nombreBuscado)) {
                return true;
            }
        }
        return false;

    }

}
