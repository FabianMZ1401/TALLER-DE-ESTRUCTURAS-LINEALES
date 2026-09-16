package matrices.ejercicio11;

public class Ejercicio11Controlador {
    private final MatrizSumaServicio servicio;
    private final MatrizSumaVista vista;

    public Ejercicio11Controlador() {
        this.servicio = new MatrizSumaServicio();
        this.vista = new MatrizSumaVista();
    }

    public void ejecutar() {
        
        int[][] matrizNumeros = {
            {2, 4, 3, 5},
            {6, 8, 2, 1},
            {10, 12, 0, 4},
            {12, 23, 6, 9}
        };

        int[] sumaFilas = servicio.sumarFilas(matrizNumeros);
        int[] sumaCols = servicio.sumarColumnas(matrizNumeros);

        vista.mostrarMatrizYSumas(matrizNumeros, sumaFilas, sumaCols);
    }
}
