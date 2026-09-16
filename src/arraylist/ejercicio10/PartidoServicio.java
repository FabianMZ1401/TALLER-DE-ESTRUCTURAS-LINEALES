package arraylist.ejercicio10;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PartidoServicio {

    public ArrayList<Partido> cargarPartidosDesdeArchivo(String rutaArchivo) {
        ArrayList<Partido> partidos = new ArrayList<>();

        try {
            File archivo = new File(rutaArchivo);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine().trim();
                if (!linea.isEmpty()) {
                    String[] partes = linea.split("::");
                    if (partes.length == 4) {
                        String local = partes[0].trim();
                        String visitante = partes[1].trim();
                        int golesLocal = Integer.parseInt(partes[2].trim());
                        int golesVisitante = Integer.parseInt(partes[3].trim());

                        partidos.add(new Partido(local, visitante, golesLocal, golesVisitante));
                    }
                }
            }
            lector.close();
        } catch (Exception e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }

        return partidos;
    }

    public ArrayList<Partido> obtenerVictoriasVisitantes(ArrayList<Partido> partidos) {
        ArrayList<Partido> resultado = new ArrayList<>();
        for (Partido p : partidos) {
            if (p.ganoVisitante()) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public ArrayList<Partido> obtenerEmpates(ArrayList<Partido> partidos) {
        ArrayList<Partido> resultado = new ArrayList<>();
        for (Partido p : partidos) {
            if (p.esEmpate()) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public int contarVictoriasBarcelona(ArrayList<Partido> partidos) {
        int contador = 0;
        for (Partido p : partidos) {
            if (p.ganoEquipo("Barcelona")) {
                contador++;
            }
        }
        return contador;
    }

    public int contarVictoriasLocales(ArrayList<Partido> partidos) {
        int contador = 0;
        for (Partido p : partidos) {
            if (p.ganoLocal()) {
                contador++;
            }
        }
        return contador;
    }
}
