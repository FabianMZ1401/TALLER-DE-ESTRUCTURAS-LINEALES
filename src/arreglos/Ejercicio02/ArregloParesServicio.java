package arreglos.ejercicio02;

public class ArregloParesServicio {

    public int[] generarPrimerosPares(int cantidad) {
        int[] pares = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            pares[i] = (i + 1) * 2;
        }
        return pares;
    }
}
