package clase10;

import java.time.LocalDate;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Federico", 29, LocalDate.of(1993, 9, 28), "37863085");
        persona1.mostrar();
        System.out.println("Es mayor edad?: " + persona1.esMayorDeEdad());
    }
}
