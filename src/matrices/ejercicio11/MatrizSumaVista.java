package matrices.ejercicio11;

public class MatrizSumaVista {

    public void mostrarMatrizYSumas(int[][] matriz, int[] sumaFilas, int[] sumaColumnas) {
        System.out.println("=== EJERCICIO 11: SUMA DE FILAS Y COLUMNAS EN MATRIZ ===");
        System.out.println("Impresion de la matriz:\n");

        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.printf("  | Suma Fila %d: %d\n", (i + 1), sumaFilas[i]);
        }

        System.out.println("----------------------------------------------");
        System.out.print("Suma Col:");
        for (int j = 0; j < columnas; j++) {
            System.out.printf("%5d", sumaColumnas[j]);
        }
        System.out.println("\n----------------------------------------------\n");
    }
}
