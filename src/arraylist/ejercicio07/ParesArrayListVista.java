package arraylist.ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class ParesArrayListVista {

    public void mostrarLista(String mensaje, ArrayList<Integer> lista) {
        System.out.println(mensaje + lista);
    }

    public int pedirNumero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public void mostrarResultadoEliminacion(boolean exito, int numero) {
        if (exito) {
            System.out.println("-> El número " + numero + " fue eliminado exitosamente.");
        } else {
            System.out.println("-> El número " + numero + " no se encuentra en la lista.");
        }
    }
}