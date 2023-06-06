package clase5;
import java.util.*;
public class EjercicioDos {
    public static void main(String[] args) {
        Double millas;
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("Ingrese cantidad de millas");
        millas = ingresoDatos.nextDouble();
        Double kilometros = millas * 1.60934;
        System.out.println("Las millas ingresdas son: " + millas + " y son: " + kilometros + " kilometros");
    }
}
