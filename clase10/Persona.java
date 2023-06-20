package clase10;

import java.time.LocalDate;

public class Persona {
    private static int contadorPersona = 0;
    private final int id;
    private String nombre;
    private int edad;
    private LocalDate fechaDeNacimiento;
    private String dni;
    private static final int MAYOR_DE_EDAD = 18;
    public Persona () {
        this.id = ++Persona.contadorPersona;
    }

    public Persona (String nombre, int edad, LocalDate fechaDeNacimiento, String dni) {
        this.id = ++Persona.contadorPersona;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
    }

    public String getNombre () {
        return this.nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public int getEdad () {
        return this.edad;
    }
    public void setEdad (int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaDeNacimiento () {
        return this.fechaDeNacimiento;
    }
    public void setFechaDeNacimiento (LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDni () {
        return this.dni;
    }
    public void setDni (String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", dni='" + dni + '\'' +
                '}';
    }

    public void mostrar () {
        System.out.println(this);
    }
    public boolean esMayorDeEdad() {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - this.fechaDeNacimiento.getYear();
        if (edad < MAYOR_DE_EDAD)
            return false;
        else if (edad > MAYOR_DE_EDAD)
            return true;
        else {
            int mesActual = fechaActual.getMonthValue();
            int diaActual = fechaActual.getDayOfMonth();
            int mesNacimiento = this.fechaDeNacimiento.getMonthValue();
            int diaNacimiento = this.fechaDeNacimiento.getDayOfMonth();
            if (mesActual > mesNacimiento) {
                return true;
            } else if (mesActual < mesNacimiento) {
                return false;
            } else {
                return diaActual >= diaNacimiento;
            }
        }
    }
}
