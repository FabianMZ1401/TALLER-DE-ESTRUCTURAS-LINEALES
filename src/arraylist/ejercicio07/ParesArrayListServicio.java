package arraylist.ejercicio07;

import java.util.ArrayList;

public class ParesArrayListServicio {

    public ArrayList<Integer> generarPrimerosPares(int cantidad) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            pares.add(i * 2);
        }
        return pares;
    }

    public void insertarEnOrden(ArrayList<Integer> lista, int numero) {
        int posicion = 0;
        while (posicion < lista.size() && lista.get(posicion) < numero) {
            posicion++;
        }
        lista.add(posicion, numero);
    }

    public boolean eliminarValor(ArrayList<Integer> lista, int numero) {
        return lista.remove(Integer.valueOf(numero));
    }
}