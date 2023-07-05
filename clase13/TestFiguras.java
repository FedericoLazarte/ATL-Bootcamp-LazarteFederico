package clase13;
import java.util.*;
public class TestFiguras {
    public static Triangulo crearTriangulo (Scanner ingresarLado) {
        double lado1;
        double lado2;
        double lado3;
        System.out.println("Ingresar lado 1");
        lado1 = ingresarLado.nextDouble();
        System.out.println("Ingresar lado 2");
        lado2 = ingresarLado.nextDouble();
        System.out.println("Ingresar lado 3");
        lado3 = ingresarLado.nextDouble();
        return new Triangulo(lado1, lado2, lado3);
    }

    public static Rectangulo crearRectangulo (Scanner ingresarLado) {
        double lado1;
        double lado2;
        System.out.println("Ingrese lado 1 del rectangulo");
        lado1 = ingresarLado.nextDouble();
        System.out.println("Ingrese lado 2 del rectangulo");
        lado2 = ingresarLado.nextDouble();
        return new Rectangulo(lado1, lado2);
    }

    public static Circulo crearCirculo (Scanner ingresarLado) {
        double radio;
        System.out.println("Ingrese radio del círculo");
        radio = ingresarLado.nextDouble();
        return new Circulo(radio);
    }
    public static void main(String[] args) {
        boolean salir = true;
        int opcion;
        Scanner ingresarOpcion = new Scanner (System.in);

        while(salir) {
            System.out.println("Que desea crear?\n" +
                    "1. Triángulo.\n" +
                    "2. Rectángulo.\n" +
                    "3. Círculo.\n" +
                    "4. Salir");
            opcion = ingresarOpcion.nextInt();
            switch (opcion) {
                case 1:
                    Triangulo triangulo = crearTriangulo(ingresarOpcion);
                    System.out.println("Área del triángulo es: " + triangulo.calcularArea() + "\n");
                    System.out.println("Perímetro del triángulo es: " + triangulo.calcularPerimetro() + "\n");
                    break;
                case 2:
                    Rectangulo rectangulo = crearRectangulo(ingresarOpcion);
                    System.out.println("Área del rectángulo es: " + rectangulo.calcularArea() + "\n");
                    System.out.println("Perímetro del rectángulo es: " + rectangulo.calcularPerimetro() + "\n");
                    break;
                case 3:
                    Circulo circulo = crearCirculo(ingresarOpcion);
                    System.out.println("Área del círculo es: " + circulo.calcularArea() + "\n");
                    System.out.println("Perímetro del círculo es: " + circulo.calcularPerimetro() + "\n");
                    break;
                case 4:
                    salir = false;
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelva a intentar.\n");

            }
        }

    }
}
