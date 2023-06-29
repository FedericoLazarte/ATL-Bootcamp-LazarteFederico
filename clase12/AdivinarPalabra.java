package clase12;
import java.util.*;
public class AdivinarPalabra {
    public static void main(String[] args) {
        int vidas = 2;
        boolean ganoUsuario = false;
        String respuestaUsuario;
        Scanner ingresarRespuesta = new Scanner(System.in);
        String[] palabras = {"manzana", "perro", "guitarra", "computadora", "playa"};
        String[] descripciones = {"Es una fruta roja y deliciosa.",
        "Es un animal domesticado que ladra.",
                "Es un instrumento musical de cuerdas.",
                "Es una máquina electrónica que se utiliza para procesar información.",
                "Es un lugar de descanso y recreación junto al mar."};

        while ( vidas != 0) {
            System.out.println("Trata de adivinar la palabra!!!\n");
            int randomPos = (int) (Math.random() * palabras.length);
            System.out.println(descripciones[randomPos] + "\n");
            System.out.println("Ingrese respuesta!!!...\n");
            respuestaUsuario = ingresarRespuesta.nextLine();
            if (adivinoPalabra(palabras[randomPos], respuestaUsuario)) {
                System.out.println("Adivinaste la palabra!!!\n");
                ganoUsuario = true;
                vidas = 0;
            } else {
                vidas--;
                System.out.println("No adivinaste!!!, la palabra era " + palabras[randomPos] + " te queda " + vidas + " intentos\n");

            }
        }
        if (ganoUsuario) {
            System.out.println("Felicidades has ganano");
        } else {
            System.out.println("No has logrado adivinar ninguna palabra :C, perdiste!!!");
        }
    }

    public static boolean adivinoPalabra (String palabra, String palabraIngresada) {
        return palabra.equalsIgnoreCase(palabraIngresada);
    }
}
