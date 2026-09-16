package arreglos.ejercicio01;

public class Ejercicio01Controlador {
    private final PrimosServicio servicio;
    private final PrimosVista vista;

    public Ejercicio01Controlador() {
        this.servicio = new PrimosServicio();
        this.vista = new PrimosVista();
    }

    public void ejecutar() {
        int[] primos = servicio.obtenerPrimerosPrimos();
        vista.mostrarPrimos(primos);
    }
}