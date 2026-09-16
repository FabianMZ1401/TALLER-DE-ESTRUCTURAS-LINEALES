package matrices.ejercicio12;

public class Ejercicio12Controlador {
    private final SumaMatricesServicio servicio;
    private final SumaMatricesVista vista;

    public Ejercicio12Controlador() {
        this.servicio = new SumaMatricesServicio();
        this.vista = new SumaMatricesVista();
    }

    public void ejecutar() {
        // Matriz de 3x3 inicializada directamente
        int[][] matrizA = {
            {3, 5, 2},
            {1, 4, 7},
            {6, 0, 9}
        };

        int[][] matrizB = {
            {2, 1, 4},
            {8, 3, 2},
            {0, 5, 1}
        };

        int[][] resultado = servicio.sumar(matrizA, matrizB);
        vista.mostrarOperacion(matrizA, matrizB, resultado);
    }
}
