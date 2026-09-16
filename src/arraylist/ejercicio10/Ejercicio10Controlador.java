package arraylist.ejercicio10;

import java.util.ArrayList;

public class Ejercicio10Controlador {
    private final PartidoServicio servicio;
    private final PartidoVista vista;

    public Ejercicio10Controlador() {
        this.servicio = new PartidoServicio();
        this.vista = new PartidoVista();
    }

    public void ejecutar() {
        ArrayList<Partido> partidos = servicio.cargarPartidosDesdeArchivo("PartidoLiga.txt");

        if (partidos.isEmpty()) {
            System.out.println("No se encontraron datos en 'PartidoLiga.txt'.");
            return;
        }

        ArrayList<Partido> ganaronVisitante = servicio.obtenerVictoriasVisitantes(partidos);
        ArrayList<Partido> empates = servicio.obtenerEmpates(partidos);
        int victoriasBarca = servicio.contarVictoriasBarcelona(partidos);
        int victoriasLocales = servicio.contarVictoriasLocales(partidos);

        vista.mostrarResultados(ganaronVisitante, victoriasBarca, victoriasLocales, empates);
    }
}