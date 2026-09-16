package matrices.ejercicio11;

public class MatrizSumaServicio {

    public int[] sumarFilas(int[][] matriz) {
        int[] sumaFilas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            sumaFilas[i] = suma;
        }
        return sumaFilas;
    }

    public int[] sumarColumnas(int[][] matriz) {
        int columnas = matriz[0].length;
        int[] sumaCols = new int[columnas];
        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }
            sumaCols[j] = suma;
        }
        return sumaCols;
    }
}
