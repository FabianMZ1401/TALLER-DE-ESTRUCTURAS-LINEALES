package matrices.ejercicio12;

public class SumaMatricesServicio {

    public int[][] sumar(int[][] a, int[][] b) {
        int filas = a.length;
        int columnas = a[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }
}
