package arreglos.ejercicio02;

public class ArregloParesVista {

    public void mostrarEnUnaLinea(int[] pares) {
        System.out.println("=== IMPRESIÓN EN UNA SOLA LÍNEA ===");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + (i < pares.length - 1 ? " " : ""));
        }
        System.out.println("\n");
    }

    public void mostrarEnDiezLineas(int[] pares) {
        System.out.println("=== IMPRESIÓN EN 10 LÍNEAS ===");
        int elementosPorLinea = pares.length / 10;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Línea %2d: ", (i + 1));
            for (int j = 0; j < elementosPorLinea; j++) {
                int indice = i * elementosPorLinea + j;
                System.out.printf("%4d", pares[indice]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
