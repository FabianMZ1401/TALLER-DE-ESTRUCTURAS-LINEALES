package arreglos.ejercicio03;

public class Ejercicio03Controlador {
    private final FactorialServicio servicio;
    private final FactorialVista vista;

    public Ejercicio03Controlador() {
        this.servicio = new FactorialServicio();
        this.vista = new FactorialVista();
    }

    public void ejecutar() {
        int cantidad = 10;
        int[] numeros = servicio.generarAleatorios(cantidad);
        long[] factoriales = servicio.calcularFactoriales(numeros);

        vista.mostrarResultados(numeros, factoriales);
    }
}