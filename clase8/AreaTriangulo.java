package clase8;
import java.util.*;
public class AreaTriangulo {
    public static double calcularAreaTriangulo (double base, double altura) {
        return (base * altura) / 2;
    }
    public static void main(String[] args) {
        double base;
        double altura;
        Scanner ingresoDato = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo, por favor: ");
        base = ingresoDato.nextDouble();
        System.out.println("Ingrese la altura del triangulo, por favor: ");
        altura = ingresoDato.nextDouble();
        System.out.println("El área del triángulo es: " + calcularAreaTriangulo(base, altura));
    }
}
