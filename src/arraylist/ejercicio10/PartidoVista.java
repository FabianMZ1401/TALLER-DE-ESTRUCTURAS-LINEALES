package arraylist.ejercicio10;

import java.util.ArrayList;

public class PartidoVista {

    public void mostrarResultados(ArrayList<Partido> visitantes, int victoriasBarca, 
                                  int victoriasLocales, ArrayList<Partido> empates) {
        System.out.println("=== EJERCICIO 10: PROCESAMIENTO DE LIGA (MVC) ===");

        System.out.println("\n--- Partidos ganados por equipos VISITANTES (" + visitantes.size() + ") ---");
        for (Partido p : visitantes) {
            System.out.println("  • " + p);
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("Total partidos ganados por el Barcelona  : " + victoriasBarca);
        System.out.println("Total partidos ganados por equipos LOCALES: " + victoriasLocales);
        System.out.println("--------------------------------------------------");

        System.out.println("\n--- Lista filtrada: Únicamente EMPATES (" + empates.size() + ") ---");
        for (Partido p : empates) {
            System.out.println("  • " + p);
        }
        System.out.println("--------------------------------------------------\n");
    }
}
