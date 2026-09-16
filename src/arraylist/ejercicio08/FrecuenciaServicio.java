package arraylist.ejercicio08;

import java.util.ArrayList;
import java.util.Random;

public class FrecuenciaServicio {
    private final Random random = new Random();

    public ArrayList<Integer> generar100Numeros() {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            // Genera números aleatorios entre 1 y 20
            lista.add(random.nextInt(20) + 1);
        }
        return lista;
    }

    public int contarApariciones(ArrayList<Integer> lista, int numero) {
        int contador = 0;
        for (int num : lista) {
            if (num == numero) {
                contador++;
            }
        }
        return contador;
    }

    public int buscarMasFrecuente(ArrayList<Integer> lista) {
        int masFrecuente = 1;
        int maxConteo = 0;

        // Evaluamos número por número del 1 al 20
        for (int i = 1; i <= 20; i++) {
            int conteo = contarApariciones(lista, i);
            if (conteo > maxConteo) {
                maxConteo = conteo;
                masFrecuente = i;
            }
        }
        return masFrecuente;
    }
}
