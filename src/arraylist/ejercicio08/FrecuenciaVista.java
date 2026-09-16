package arraylist.ejercicio08;

import java.util.ArrayList;

public class FrecuenciaVista {

    public void mostrarTabla(ArrayList<Integer> lista, FrecuenciaServicio servicio, int masFrecuente) {
        System.out.println("=== EJERCICIO 8: FRECUENCIA Y MODA ===");
        System.out.println("Lista de 100 números generada:");
        System.out.println(lista + "\n");

        System.out.println("Número | Veces que aparece");
        System.out.println("-------------------------");

        for (int i = 1; i <= 20; i++) {
            int cantidad = servicio.contarApariciones(lista, i);
            System.out.println("  " + i + "    |    " + cantidad);
        }

        int maxApariciones = servicio.contarApariciones(lista, masFrecuente);
        System.out.println("-------------------------");
        System.out.println("-> El número más repetido es: " + masFrecuente + " (" + maxApariciones + " veces)\n");
    }
}
