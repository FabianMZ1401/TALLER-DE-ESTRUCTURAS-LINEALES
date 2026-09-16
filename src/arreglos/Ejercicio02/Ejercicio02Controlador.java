package arreglos.ejercicio2;

public class Main {
    private static final int LINEAS_A_IMPRIMIR = 10;

    public static void main(String[] args) {
        GeneradorNumeros generador = new GeneradorNumeros();
        ImpresorArreglos impresor = new ImpresorArreglos();

        int[] pares = generador.generarPrimerosCienPares();

        System.out.println("=== Impreso en una sola linea ===");
        impresor.imprimirEnUnaLinea(pares);

        System.out.println();
        System.out.println("=== Impreso en " + LINEAS_A_IMPRIMIR + " lineas ===");
        impresor.imprimirEnVariasLineas(pares, LINEAS_A_IMPRIMIR);
    }
}