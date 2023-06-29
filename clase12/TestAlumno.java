package clase12;

import java.util.ArrayList;
import java.util.List;

public class TestAlumno {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        Alumno alumno1 = new Alumno("federico", "lazarte", notas);
        alumno1.agregarNota(10);
        alumno1.agregarNota(5);
        alumno1.agregarNota(6);
        System.out.println(alumno1);
        System.out.println("Promedio de las notas: " + alumno1.promedioDeNotas());
    }
}
