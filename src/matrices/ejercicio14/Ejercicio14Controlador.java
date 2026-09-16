package matrices.ejercicio14;

public class Ejercicio14Controlador {
    private final MatrizTraspuestaServicio servicio;
    private final MatrizTraspuestaVista vista;

    public Ejercicio14Controlador() {
        this.servicio = new MatrizTraspuestaServicio();
        this.vista = new MatrizTraspuestaVista();
    }

    public void ejecutar() {
        // Matriz de 3x4 inicializada directamente
        int[][] matrizOriginal = {
            {2, 4, 6, 8},
            {1, 3, 5, 7},
            {9, 0, 2, 4}
        };

        int[][] matrizTraspuesta = servicio.calcularTraspuesta(matrizOriginal);
        vista.mostrarResultado(matrizOriginal, matrizTraspuesta);
    }
}
