package clase6;
import java.util.*;
public class BuscadorTweets {
    public static void main(String[] args) {
        String nombre;
        Scanner ingresoDato = new Scanner(System.in);
        System.out.println("Ingrese nombre para buscar tweets: ");
        nombre = ingresoDato.nextLine();
        System.out.println("Link tweets: " + linkTweet(nombre));
    }
    public static String linkTweet (String nombre) {
        return "https://twitter.com/search?q=" + nombre;
    }
}
