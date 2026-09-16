package arreglos.ejercicio04;

import java.util.Random;

public class EstadisticasServicio {
    private final Random random = new Random();

    public int[] generarAleatorios(int cantidad, int min, int max) {
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt((max - min) + 1) + min;
        }
        return numeros;
    }

    public int calcularSuma(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public double calcularPromedio(int[] numeros) {
        int suma = calcularSuma(numeros);
        return (double) suma / numeros.length;
    }

    public int obtenerIndiceMaximo(int[] numeros) {
        int indiceMax = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[indiceMax]) {
                indiceMax = i;
            }
        }
        return indiceMax;
    }

    public int obtenerIndiceMinimo(int[] numeros) {
        int indiceMin = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < numeros[indiceMin]) {
                indiceMin = i;
            }
        }
        return indiceMin;
    }
}