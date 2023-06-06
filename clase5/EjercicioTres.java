package clase5;
import java.util.*;
public class EjercicioTres {
    public static void main(String[] args) {
        Double precioOriginal;
        Integer descuento;
        Scanner ingresoDato = new Scanner(System.in);
        System.out.println("Ingrese precio del producto: ");
        precioOriginal = ingresoDato.nextDouble();
        System.out.println("Ingrese porcentaje de descuento: ");
        descuento = ingresoDato.nextInt();
        Double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("El precio final es: " + precioFinal);
        ingresoDato.close();
    }
}
