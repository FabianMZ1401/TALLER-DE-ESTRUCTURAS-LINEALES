package arreglos.ejercicio05;

public class Ejercicio05Controlador {
    private final InversionServicio servicio;
    private final InversionVista vista;

    public Ejercicio05Controlador() {
        this.servicio = new InversionServicio();
        this.vista = new InversionVista();
    }

    public void ejecutar() {
        int[] original = servicio.generarAleatorios(10, 1, 50);
        int[] invertido = servicio.invertirArreglo(original);

        vista.mostrarInversion(original, invertido);
    }
}
