package clase5;
import java.util.*;
public class EjercicioUno {
    public static void main(String[] args) {
        Integer edadPerro;
        Scanner datoPerro = new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro:");
        edadPerro = datoPerro.nextInt();
        if (edadPerro < 1) {
            System.out.println("Lo años de perro deben ser mayor o igual a 1.");
        } else {
            Integer convertirAniosHumano = edadPerro * 7;
            System.out.println("La edad de su perro en años de humano es: " + convertirAniosHumano);
        }
    }
}
