package clase5;
import java.util.*;
public class EjercicioDos {
    public static double convertirMillasEnKilometros (double millas) {
        return millas * 1.60934;
    }
    public static void main(String[] args) {
        double millas;
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("Ingrese cantidad de millas");
        millas = ingresoDatos.nextDouble();
        System.out.println("Las millas ingresdas son: " + millas + " y son: " + convertirMillasEnKilometros(millas) + " kilometros");
        ingresoDatos.close();
    }
}
