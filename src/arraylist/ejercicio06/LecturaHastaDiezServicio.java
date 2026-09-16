package arraylist.ejercicio06;

import java.util.ArrayList;
import java.util.Random;

public class LecturaHastaDiezServicio {
    private final Random random = new Random();

    public ArrayList<Integer> generarHastaDiez() {
        ArrayList<Integer> lista = new ArrayList<>();
        int numero;

        do {
            numero = random.nextInt(21) - 10;
            lista.add(numero);
        } while (numero != 10); 

        return lista;
    }

    public int calcularSuma(ArrayList<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }

    public double calcularMedia(ArrayList<Integer> lista) {
        if (lista.isEmpty()) return 0.0;
        return (double) calcularSuma(lista) / lista.size();
    }
}