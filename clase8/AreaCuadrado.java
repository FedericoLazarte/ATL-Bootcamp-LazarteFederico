package clase8;
import java.util.*;
public class AreaCuadrado {

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    public static void main(String[] args) {
        double ladoCuadrado;
        Scanner ingresoDato = new Scanner(System.in);
        System.out.println("Ingrese el valor de uno de los lados del cuadrado: ");
        ladoCuadrado = ingresoDato.nextDouble();
        System.out.println("El área del cuadrado es: " + calcularAreaCuadrado(ladoCuadrado));
    }
}
