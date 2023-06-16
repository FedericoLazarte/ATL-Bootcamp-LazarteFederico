package clase5;
import java.util.*;
public class EjercicioUno {
    public static int convertirAniosPerroEnAniosHumanos (int edadPerro) {
        return edadPerro * 7;
    }
    public static boolean edadValida (int edadPerro) {
        return edadPerro > 0;
    }
    public static void main(String[] args) {
        int edadPerro;
        Scanner datoPerro = new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro:");
        edadPerro = datoPerro.nextInt();
        if (edadValida(edadPerro)) {
            System.out.println("La edad del perro en años de humano es: " + convertirAniosPerroEnAniosHumanos(edadPerro));
        } else {
            System.out.println("Edad de perro erronea, debe ser mayor a 0!!");
        }
        datoPerro.close();
    }
}
