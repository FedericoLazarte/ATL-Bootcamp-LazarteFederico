package clase10;

import java.time.LocalDate;

public class TestCuenta {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Federico", 29, LocalDate.of(1993, 9, 28), "37863085");
        Cuenta cuenta1 = new Cuenta (persona1, 5000);
        cuenta1.mostrar();
        cuenta1.ingresar(2000);
        cuenta1.mostrar();
        System.out.println("Cantidad de dinero retirado: " + cuenta1.retirar(6000));
        cuenta1.mostrar();
    }
}
