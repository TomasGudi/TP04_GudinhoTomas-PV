package ar.edu.unju.fi.collections;

import ar.edu.unju.fi.model.Alumno;
import java.util.ArrayList;
import java.util.List;

public class ListadoAlumnos {
    private static List<Alumno> alumnos = new ArrayList<>();

    public static List<Alumno> listarAlumnos() {
        return alumnos;
    }

    public static void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public static Alumno buscarAlumnoPorDni(String dni) {
        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equals(dni)) {
                return alumno;
            }
        }
        return null;
    }

    public static void modificarAlumno(Alumno alumno) {
        Alumno original = buscarAlumnoPorDni(alumno.getDni());
        if (original != null) {
            int index = alumnos.indexOf(original);
            alumnos.set(index, alumno);
        }
    }

    public static void eliminarAlumno(String dni) {
        Alumno alumno = buscarAlumnoPorDni(dni);
        if (alumno != null) {
            alumnos.remove(alumno);
        }
    }
}
