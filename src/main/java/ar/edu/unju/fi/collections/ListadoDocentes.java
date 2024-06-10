package ar.edu.unju.fi.collections;

import ar.edu.unju.fi.model.Docente;
import java.util.ArrayList;
import java.util.List;

public class ListadoDocentes {
    private static List<Docente> docentes = new ArrayList<>();

    public static List<Docente> listarDocentes() {
        return docentes;
    }

    public static void agregarDocente(Docente docente) {
        docentes.add(docente);
    }

    public static Docente buscarDocentePorLegajo(String legajo) {
        for (Docente docente : docentes) {
            if (docente.getLegajo().equals(legajo)) {
                return docente;
            }
        }
        return null;
    }

    public static void modificarDocente(Docente docente) {
        Docente original = buscarDocentePorLegajo(docente.getLegajo());
        if (original != null) {
            int index = docentes.indexOf(original);
            docentes.set(index, docente);
        }
    }

    public static void eliminarDocente(String legajo) {
        Docente docente = buscarDocentePorLegajo(legajo);
        if (docente != null) {
            docentes.remove(docente);
        }
    }
}
