package clase12;
import java.util.*;
public class InteresCompuesto {
    public static void main(String[] args) {
        Scanner ingresarDato = new Scanner(System.in);
        double capitalInicial;
        double tasaInteres;
        int anios;
        System.out.println("Ingrese capital inicial");
        capitalInicial = ingresarDato.nextDouble();
        System.out.println("Ingresar tasa de interés");
        tasaInteres = ingresarDato.nextDouble();
        System.out.println("Ingrese el tiempo en años");
        anios = ingresarDato.nextInt();
        System.out.println("El monto total acumulado es: " + interesCompuesto(capitalInicial, tasaInteres, anios));
    }

    public static double interesCompuesto(double capitalInicial, double tasaInteres, int anios) {
        double monto = capitalInicial * Math.pow((1 + (tasaInteres/ 100)), anios);
        return Math.round(monto * 100.0)/100.0;
    }
}
