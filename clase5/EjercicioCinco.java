package clase5;
import java.util.*;
public class EjercicioCinco {
    public static void main(String[] args) {
        Integer numeroRandom = (int) ((Math.random() * 100) + 1);
        Integer numero;
        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("Ingrese número a adivinar");
        numero = ingresoDatos.nextInt();
        if (numeroRandom == numero) {
            System.out.println("Adivino!!, el número era: " + numeroRandom);
        } else {
            System.out.println("Fallo!!, el número es: " + numeroRandom);
        }
        ingresoDatos.close();
    }
}
