package arraylist.ejercicio06;

import java.util.ArrayList;

public class Ejercicio06Controlador {
    private final LecturaHastaDiezServicio servicio;
    private final LecturaHastaDiezVista vista;

    public Ejercicio06Controlador() {
        this.servicio = new LecturaHastaDiezServicio();
        this.vista = new LecturaHastaDiezVista();
    }

    public void ejecutar() {
        ArrayList<Integer> lista = servicio.generarHastaDiez();
        int suma = servicio.calcularSuma(lista);
        double media = servicio.calcularMedia(lista);

        vista.mostrarResultados(lista, suma, media);
    }
}