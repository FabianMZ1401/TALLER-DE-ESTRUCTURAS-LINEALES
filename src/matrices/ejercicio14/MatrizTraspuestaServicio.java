package matrices.ejercicio14;

public class MatrizTraspuestaServicio {

    public int[][] calcularTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // La matriz traspuesta invierte las dimensiones: filas x columnas -> columnas x filas
        int[][] traspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        return traspuesta;
    }
}