package arraylist.ejercicio08;

import java.util.ArrayList;

public class Ejercicio08Controlador {
    private final FrecuenciaServicio servicio;
    private final FrecuenciaVista vista;

    public Ejercicio08Controlador() {
        this.servicio = new FrecuenciaServicio();
        this.vista = new FrecuenciaVista();
    }

    public void ejecutar() {
        ArrayList<Integer> numeros = servicio.generar100Numeros();
        int masFrecuente = servicio.buscarMasFrecuente(numeros);

        vista.mostrarTabla(numeros, servicio, masFrecuente);
    }
}