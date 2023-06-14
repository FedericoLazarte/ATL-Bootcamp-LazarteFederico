package clase5;
import java.util.*;
public class EjercicioTres {
    public static double precioFinal (double precioOriginal, int descuento) {
        return precioOriginal - (precioOriginal * descuento / 100);
    }
    public static void main(String[] args) {
        double precioOriginal;
        int descuento;
        Scanner ingresoDato = new Scanner(System.in);
        System.out.println("Ingrese precio del producto: ");
        precioOriginal = ingresoDato.nextDouble();
        System.out.println("Ingrese porcentaje de descuento: ");
        descuento = ingresoDato.nextInt();
        System.out.println("El precio final es: " + precioFinal(precioOriginal, descuento));
        ingresoDato.close();
    }
}
