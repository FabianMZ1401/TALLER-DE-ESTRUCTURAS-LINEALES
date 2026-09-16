package arreglos.ejercicio04;

import java.util.Arrays;

public class EstadisticasVista {

    public void mostrarEstadisticas(int[] numeros, int suma, double promedio, 
                                    int posMax, int posMin) {
        System.out.println("=== EJERCICIO 4: ESTADÍSTICAS DE UN ARREGLO ===");
        System.out.println("Arreglo generado: " + Arrays.toString(numeros));
        System.out.println("-----------------------------------------------");
        System.out.println("Suma total       : " + suma);
        System.out.printf("Promedio         : %.2f%n", promedio);
        System.out.println("Valor Máximo     : " + numeros[posMax] + " (en la posición/índice " + posMax + ")");
        System.out.println("Valor Mínimo     : " + numeros[posMin] + " (en la posición/índice " + posMin + ")");
        System.out.println("-----------------------------------------------\n");
    }
}