package matrices.ejercicio15;

public class Matriz3DVista {

    public void mostrarMatriz3D(int[][][] matriz3D, int[] sumaCapas, int sumaTotal) {
        System.out.println("=== EJERCICIO 15: MATRICES TRIDIMENSIONALES (3D) ===\n");

        for (int i = 0; i < matriz3D.length; i++) {
            System.out.println("Capa / Matriz 2D " + (i + 1) + ":");
            for (int j = 0; j < matriz3D[i].length; j++) {
                for (int k = 0; k < matriz3D[i][j].length; k++) {
                    System.out.printf("%5d", matriz3D[i][j][k]);
                }
                System.out.println();
            }
            System.out.println("  -> Suma de esta capa: " + sumaCapas[i] + "\n");
        }

        System.out.println("----------------------------------------------");
        System.out.println("Suma total de todos los elementos: " + sumaTotal);
        System.out.println("----------------------------------------------\n");
    }
}
