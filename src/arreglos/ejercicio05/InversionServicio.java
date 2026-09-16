package arreglos.ejercicio05;

import java.util.Random;

public class InversionServicio {
    private final Random random = new Random();

    public int[] generarAleatorios(int cantidad, int min, int max) {
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt((max - min) + 1) + min;
        }
        return numeros;
    }

    public int[] invertirArreglo(int[] original) {
        int longitud = original.length;
        int[] invertido = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            invertido[i] = original[longitud - 1 - i];
        }

        return invertido;
    }
}