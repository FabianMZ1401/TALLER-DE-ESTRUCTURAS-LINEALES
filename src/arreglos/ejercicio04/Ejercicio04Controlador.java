package arreglos.ejercicio04;

public class Ejercicio04Controlador {
    private final EstadisticasServicio servicio;
    private final EstadisticasVista vista;

    public Ejercicio04Controlador() {
        this.servicio = new EstadisticasServicio();
        this.vista = new EstadisticasVista();
    }

    public void ejecutar() {
        // Genera 10 números aleatorios entre 1 y 100
        int[] numeros = servicio.generarAleatorios(10, 1, 100);
        
        int suma = servicio.calcularSuma(numeros);
        double promedio = servicio.calcularPromedio(numeros);
        int posMax = servicio.obtenerIndiceMaximo(numeros);
        int posMin = servicio.obtenerIndiceMinimo(numeros);

        vista.mostrarEstadisticas(numeros, suma, promedio, posMax, posMin);
    }
}