package matrices.ejercicio12;

public class SumaMatricesVista {

    public void imprimirMatriz(String titulo, int[][] matriz) {
        System.out.println(titulo);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void mostrarOperacion(int[][] a, int[][] b, int[][] resultado) {
        System.out.println("=== EJERCICIO 12: SUMA DE DOS MATRICES (A + B) ===\n");
        imprimirMatriz("Matriz A:", a);
        imprimirMatriz("Matriz B:", b);
        imprimirMatriz("Matriz Resultado (C = A + B):", resultado);
    }
}
