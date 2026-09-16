package arraylist.ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07Controlador {
    private final ParesArrayListServicio servicio;
    private final ParesArrayListVista vista;

    public Ejercicio07Controlador() {
        this.servicio = new ParesArrayListServicio();
        this.vista = new ParesArrayListVista();
    }

    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== EJERCICIO 7: INSERCIÓN Y ELIMINACIÓN EN ARRAYLIST ===");
        
        ArrayList<Integer> lista = servicio.generarPrimerosPares(20);
        vista.mostrarLista("Lista inicial (20 pares): ", lista);

        int numeroAInsertar = vista.pedirNumero(scanner, "\nIngrese un número para insertar en orden: ");
        servicio.insertarEnOrden(lista, numeroAInsertar);
        vista.mostrarLista("Lista tras la inserción: ", lista);

        int numeroAEliminar = vista.pedirNumero(scanner, "\nIngrese un valor a eliminar de la lista: ");
        boolean eliminado = servicio.eliminarValor(lista, numeroAEliminar);
        vista.mostrarResultadoEliminacion(eliminado, numeroAEliminar);
        vista.mostrarLista("Lista final: ", lista);

        System.out.println("-----------------------------------------------\n");
    }
}
