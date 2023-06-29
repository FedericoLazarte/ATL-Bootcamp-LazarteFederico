package clase12;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<Double> notas;

    public Alumno () {
    }

    public Alumno (String nombre, String apellido, List<Double> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas != null ? notas : new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public List<Double> getNotas () {
        return this.notas;
    }

    public void agregarNota (double nota) {
        this.notas.add(nota);
    }

    public double promedioDeNotas () {
        if (notas.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / this.notas.size();
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", notas=" + notas +
                '}';
    }
}
