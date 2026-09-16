package matrices.ejercicio13;

public class MultiplicacionMatrizVista {

    public void imprimirMatriz(String titulo, int[][] matriz) {
        System.out.println(titulo);
        if (matriz == null) {
            System.out.println("Matriz no disponible.");
            return;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void mostrarResultado(int[][] a, int[][] b, int[][] c) {
        System.out.println("=== EJERCICIO 13: MULTIPLICACIÓN DE MATRICES (A x B) ===\n");
        imprimirMatriz("Matriz A (3x2):", a);
        imprimirMatriz("Matriz B (2x3):", b);

        if (c == null) {
            System.out.println("Error: No se pueden multiplicar las matrices. Dimensiones incompatibles.");
        } else {
            imprimirMatriz("Matriz Resultado C (3x3):", c);
        }
    }
}
