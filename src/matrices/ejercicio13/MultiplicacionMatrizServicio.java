package matrices.ejercicio13;

public class MultiplicacionMatrizServicio {

    public boolean sonMultiplicables(int[][] a, int[][] b) {
        // El numero de columnas de A debe ser igual al numero de filas de B
        return a[0].length == b.length;
    }

    public int[][] multiplicar(int[][] a, int[][] b) {
        if (!sonMultiplicables(a, b)) {
            return null;
        }

        int filasA = a.length;
        int columnasA = a[0].length;
        int columnasB = b[0].length;

        int[][] c = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                c[i][j] = 0;
                for (int k = 0; k < columnasA; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
