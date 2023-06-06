package clase5;
import java.util.*;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Double totalCuenta;
        Integer porcentajePropina;
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("Ingrese el total de la cuenta");
        totalCuenta = ingresoDatos.nextDouble();
        System.out.println("Ingrese el porcentaje de propina que desea dejar: ");
        porcentajePropina = ingresoDatos.nextInt();
        Double propina = totalCuenta * (porcentajePropina / 100);
        System.out.println("Total propina: " + propina);
    }
}
