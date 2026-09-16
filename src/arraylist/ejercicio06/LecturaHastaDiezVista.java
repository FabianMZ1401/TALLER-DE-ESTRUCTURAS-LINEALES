package arraylist.ejercicio06;

import java.util.ArrayList;

public class LecturaHastaDiezVista {

    public void mostrarResultados(ArrayList<Integer> lista, int suma, double media) {
        System.out.println("=== EJERCICIO 6: ARRAYLIST HASTA ENCONTRAR 10 ===");
        System.out.println("Elementos guardados : " + lista);
        System.out.println("Cantidad de números : " + lista.size());
        System.out.println("Suma total          : " + suma);
        System.out.printf("Media (promedio)    : %.2f%n", media);
        System.out.println("-----------------------------------------------\n");
    }
}