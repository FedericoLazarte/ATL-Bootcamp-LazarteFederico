package clase12;
import java.util.*;
public class CalculadoraDeCambio {
    public static void main(String[] args) {
        Scanner ingresarDato = new Scanner(System.in);
        double cantidadDinero;
        double costoProducto;
        System.out.println("Ingrese la cantidad de dinero que tiene: ");
        cantidadDinero = ingresarDato.nextDouble();
        System.out.println("Ingrese el valor del producto: ");
        costoProducto = ingresarDato.nextDouble();

        double vueltoPorCompra = cambioParaDevolver(cantidadDinero, costoProducto);
        if (vueltoPorCompra == 0) {
            System.out.println("El cliente pago la cantidad justa, no hay que darle el cambio");
        } else if (vueltoPorCompra == -1) {
            System.out.println("El cliente no tiene el dinero suficiente para llevar a cabo la compra");
        } else {
            System.out.println("Se le debe dar al cliente el total de: $" + vueltoPorCompra);
        }
    }

    public static double cambioParaDevolver (double dinero, double costoProducto) {
        if (dinero >= costoProducto) {
            return dinero - costoProducto;
        }
        return -1;
    }
}
