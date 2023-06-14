package clase5;
import java.util.*;
public class EjercicioCinco {
    public static int generarNumeroRandom() {
        return (int) ((Math.random() * 100) + 1);
    }
    public static void main(String[] args) {
        int numero;
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("Ingrese número a adivinar");
        numero = ingresoDatos.nextInt();
        int numeroRandom = generarNumeroRandom();
        if (numeroRandom == numero) {
            System.out.println("Adivino!!, el número era: " + numeroRandom);
        } else {
            System.out.println("Fallo!!, el número es: " + numeroRandom);
        }
        ingresoDatos.close();
    }
}
