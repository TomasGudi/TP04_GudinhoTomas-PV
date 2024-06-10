package ar.edu.unju.fi.collections;

import ar.edu.unju.fi.model.Materia;
import java.util.ArrayList;
import java.util.List;

public class ListadoMaterias {
    private static List<Materia> materias = new ArrayList<>();

    public static List<Materia> listarMaterias() {
        return materias;
    }

    public static void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public static Materia buscarMateriaPorCodigo(String codigo) {
        for (Materia materia : materias) {
            if (materia.getCodigo().equals(codigo)) {
                return materia;
            }
        }
        return null;
    }

    public static void modificarMateria(Materia materia) {
        Materia original = buscarMateriaPorCodigo(materia.getCodigo());
        if (original != null) {
            int index = materias.indexOf(original);
            materias.set(index, materia);
        }
    }

    public static void eliminarMateria(String codigo) {
        Materia materia = buscarMateriaPorCodigo(codigo);
        if (materia != null) {
            materias.remove(materia);
        }
    }
}
