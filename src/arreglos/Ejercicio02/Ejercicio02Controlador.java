package arreglos.ejercicio02;

public class Ejercicio02Controlador {
    private final ArregloParesServicio servicio;
    private final ArregloParesVista vista;

    public Ejercicio02Controlador() {
        this.servicio = new ArregloParesServicio();
        this.vista = new ArregloParesVista();
    }

    public void ejecutar() {
        int[] pares = servicio.generarPrimerosPares(100);

        vista.mostrarEnUnaLinea(pares);
        vista.mostrarEnDiezLineas(pares);
    }
}
