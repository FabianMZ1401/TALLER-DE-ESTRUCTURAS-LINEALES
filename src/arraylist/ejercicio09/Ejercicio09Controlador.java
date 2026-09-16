package arraylist.ejercicio09;

import java.util.ArrayList;

public class Ejercicio09Controlador {
    private final OrdenamientoServicio servicio;
    private final OrdenamientoVista vista;

    public Ejercicio09Controlador() {
        this.servicio = new OrdenamientoServicio();
        this.vista = new OrdenamientoVista();
    }

    public void ejecutar() {
        ArrayList<Integer> original = servicio.generar20Numeros();

        ArrayList<Integer> ascendente = servicio.ordenarAscendente(original);
        ArrayList<Integer> descendente = servicio.ordenarDescendente(original);
        ArrayList<Integer> pares = servicio.obtenerPares(original);
        ArrayList<Integer> impares = servicio.obtenerImpares(original);

        vista.mostrarResultado(original, ascendente, descendente, pares, impares);
    }
}
