package matrices.ejercicio15;

public class Ejercicio15Controlador {
    private final Matriz3DServicio servicio;
    private final Matriz3DVista vista;

    public Ejercicio15Controlador() {
        this.servicio = new Matriz3DServicio();
        this.vista = new Matriz3DVista();
    }

    public void ejecutar() {
        // Matriz 3D de 2 capas, 3 filas y 3 columnas (2x3x3)
        int[][][] matriz3D = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            }
        };

        int[] sumaCapas = servicio.calcularSumaPorCapas(matriz3D);
        int sumaTotal = servicio.calcularSumaTotal(matriz3D);

        vista.mostrarMatriz3D(matriz3D, sumaCapas, sumaTotal);
    }
}
