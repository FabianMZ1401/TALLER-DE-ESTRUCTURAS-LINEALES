package matrices.ejercicio13;

public class Ejercicio13Controlador {
    private final MultiplicacionMatrizServicio servicio;
    private final MultiplicacionMatrizVista vista;

    public Ejercicio13Controlador() {
        this.servicio = new MultiplicacionMatrizServicio();
        this.vista = new MultiplicacionMatrizVista();
    }

    public void ejecutar() {
        // Matriz A de 3x2
        int[][] matrizA = {
            {1, 2},
            {3, 4},
            {8, 1}
        };

        // Matriz B de 2x3
        int[][] matrizB = {
            {2, 3, 1},
            {4, 1, 3}
        };

        int[][] resultado = servicio.multiplicar(matrizA, matrizB);
        vista.mostrarResultado(matrizA, matrizB, resultado);
    }
}