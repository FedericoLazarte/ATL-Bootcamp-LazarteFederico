package clase5;
import java.util.*;

public class EjercicioCuatro {
    public static double propina (double totalCuenta, int porcentajePropina) {
        return totalCuenta * ((double) porcentajePropina / 100);
    }
    public static void main(String[] args) {
        double totalCuenta;
        int porcentajePropina;
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("Ingrese el total de la cuenta");
        totalCuenta = ingresoDatos.nextDouble();
        System.out.println("Ingrese el porcentaje de propina que desea dejar: ");
        porcentajePropina = ingresoDatos.nextInt();
        System.out.println("Total propina: " + propina(totalCuenta, porcentajePropina));
        ingresoDatos.close();
    }
}
