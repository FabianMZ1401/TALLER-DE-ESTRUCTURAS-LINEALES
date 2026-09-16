package arreglos.ejercicio03;

public class FactorialVista {

    public void mostrarResultados(int[] numeros, long[] factoriales) {
        System.out.println("=== EJERCICIO 3: ALEATORIOS Y FACTORIALES ===");
        System.out.printf("%-10s | %-15s%n", "Número", "Factorial");
        System.out.println("----------------------------");

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%-10d | %-15d%n", numeros[i], factoriales[i]);
        }
        System.out.println("-----------------------------------------------\n");
    }
}