package clase6;
import java.util.*;
public class Promedio {
    public static void main(String[] args) {
        int num;
        int cont = 1;
        double suma = 0;
        Scanner ingresoDato = new Scanner(System.in);
        while (cont <= 3) {
            System.out.println("Ingrese un número: ");
            num = ingresoDato.nextInt();
            suma += num;
            cont++;
        }
        double promedio = suma / 3;
        System.out.println("El promedio de la suma es: " + promedio);
    }

}
