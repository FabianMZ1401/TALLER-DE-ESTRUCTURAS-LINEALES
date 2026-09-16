package arraylist.ejercicio09;

import java.util.ArrayList;

public class OrdenamientoVista {

    public void mostrarResultado(ArrayList<Integer> original, 
                                 ArrayList<Integer> ascendente, 
                                 ArrayList<Integer> descendente, 
                                 ArrayList<Integer> pares, 
                                 ArrayList<Integer> impares) {
        System.out.println("=== EJERCICIO 9: ORDENAMIENTO Y SEPARACIÓN DE ELEMENTOS ===");
        System.out.println("Lista Original (20 números) : " + original);
        System.out.println("--------------------------------------------------");
        System.out.println("Ordenada de Menor a Mayor   : " + ascendente);
        System.out.println("Ordenada de Mayor a Menor   : " + descendente);
        System.out.println("--------------------------------------------------");
        System.out.println("Sublista de Números Pares   : " + pares);
        System.out.println("Sublista de Números Impares : " + impares);
        System.out.println("--------------------------------------------------\n");
    }
}
