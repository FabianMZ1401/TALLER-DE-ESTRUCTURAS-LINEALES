package arreglos.ejercicio03;

import java.util.Random;

public class FactorialServicio {
    private final Random random = new Random();

    public int[] generarAleatorios(int cantidad) {
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(12) + 1;
        }
        return numeros;
    }

    public long[] calcularFactoriales(int[] numeros) {
        long[] factoriales = new long[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = obtenerFactorial(numeros[i]);
        }
        return factoriales;
    }

    private long obtenerFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}