package arraylist.ejercicio10;

public class Partido {
    private final String equipoLocal;
    private final String equipoVisitante;
    private final int golesLocal;
    private final int golesVisitante;

    public Partido(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public String getEquipoLocal() { return equipoLocal; }
    public String getEquipoVisitante() { return equipoVisitante; }
    public int getGolesLocal() { return golesLocal; }
    public int getGolesVisitante() { return golesVisitante; }

    public boolean esEmpate() {
        return golesLocal == golesVisitante;
    }

    public boolean ganoLocal() {
        return golesLocal > golesVisitante;
    }

    public boolean ganoVisitante() {
        return golesVisitante > golesLocal;
    }

    public boolean ganoEquipo(String equipo) {
        boolean comoLocal = equipoLocal.equalsIgnoreCase(equipo) && ganoLocal();
        boolean comoVisitante = equipoVisitante.equalsIgnoreCase(equipo) && ganoVisitante();
        return comoLocal || comoVisitante;
    }

    @Override
    public String toString() {
        return equipoLocal + " " + golesLocal + " - " + golesVisitante + " " + equipoVisitante;
    }
}
