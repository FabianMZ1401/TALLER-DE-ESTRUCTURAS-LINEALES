package matrices.ejercicio15;

public class Matriz3DServicio {

    public int calcularSumaTotal(int[][][] matriz3D) {
        int suma = 0;
        for (int i = 0; i < matriz3D.length; i++) {
            for (int j = 0; j < matriz3D[i].length; j++) {
                for (int k = 0; k < matriz3D[i][j].length; k++) {
                    suma += matriz3D[i][j][k];
                }
            }
        }
        return suma;
    }

    public int[] calcularSumaPorCapas(int[][][] matriz3D) {
        int[] sumaCapas = new int[matriz3D.length];
        for (int i = 0; i < matriz3D.length; i++) {
            int sumaCapa = 0;
            for (int j = 0; j < matriz3D[i].length; j++) {
                for (int k = 0; k < matriz3D[i][j].length; k++) {
                    sumaCapa += matriz3D[i][j][k];
                }
            }
            sumaCapas[i] = sumaCapa;
        }
        return sumaCapas;
    }
}
