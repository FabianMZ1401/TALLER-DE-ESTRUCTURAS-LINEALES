package arraylist.ejercicio09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrdenamientoServicio {
    private final Random random = new Random();

    public ArrayList<Integer> generar20Numeros() {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(100) + 1);
        }
        return lista;
    }

    public ArrayList<Integer> ordenarAscendente(ArrayList<Integer> lista) {
        ArrayList<Integer> copia = new ArrayList<>(lista);
        Collections.sort(copia); // Ordena de menor a mayor
        return copia;
    }

    public ArrayList<Integer> ordenarDescendente(ArrayList<Integer> lista) {
        ArrayList<Integer> copia = new ArrayList<>(lista);
        Collections.sort(copia, Collections.reverseOrder()); // Ordena de mayor a menor
        return copia;
    }

    public ArrayList<Integer> obtenerPares(ArrayList<Integer> lista) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int num : lista) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }
        return pares;
    }

    public ArrayList<Integer> obtenerImpares(ArrayList<Integer> lista) {
        ArrayList<Integer> impares = new ArrayList<>();
        for (int num : lista) {
            if (num % 2 != 0) {
                impares.add(num);
            }
        }
        return impares;
    }
}
