package matrices.ejercicio14;

public class MatrizTraspuestaVista {

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

    public void mostrarResultado(int[][] original, int[][] traspuesta) {
        System.out.println("=== EJERCICIO 14: MATRIZ TRASPUESTA (A^T) ===\n");
        imprimirMatriz("Matriz Original A (" + original.length + "x" + original[0].length + "):", original);
        imprimirMatriz("Matriz Traspuesta A^T (" + traspuesta.length + "x" + traspuesta[0].length + "):", traspuesta);
    }
}
