package clase6;
import java.util.*;
public class GoogleMaps {
    public static void main(String[] args) {
        String pais;
        Scanner ingresoDato = new Scanner(System.in);
        System.out.println("Ingrese el nombre del país que desea buscar en el mapa: ");
        pais = ingresoDato.nextLine();
        System.out.println("Link de la ubicación del país ingresado: " + solicitudGoogleMaps(pais));
    }

    public static String solicitudGoogleMaps(String pais) {
        return "https://www.google.com/maps/search/" + pais;
    }
}
