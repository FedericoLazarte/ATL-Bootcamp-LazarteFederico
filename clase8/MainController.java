package academy.atl.bootcamp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/generar-password")
    public static String generarContrasenia() {
        StringBuilder contrasenia = new StringBuilder();
        String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?0123456789";
        for(int i = 0; i < 8; i++) {
            int caracterRandom = (int) (Math.random() * caracter.length());
            contrasenia.append(caracter.charAt(caracterRandom));
        }
        return contrasenia.toString();
    }

    @GetMapping("/transformar-a-codigo-morse/{texto}")
    public static String transformarTextoEnCodigoMorse(@PathVariable String texto) {
        StringBuilder textoEnCodigoMorse = new StringBuilder();
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] codigoMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        for(int i = 0; i < texto.toLowerCase().length(); i++) {
            int pos = enQuePosicionEstaLaLetra(letras, texto.charAt(i));
            textoEnCodigoMorse.append(codigoMorse[pos]).append(" ");
        }
        return textoEnCodigoMorse.toString();
    }

    public static int enQuePosicionEstaLaLetra (String[] arrayLetras, char letra) {
        for (int i = 0; i < arrayLetras.length; i++) {
            if (arrayLetras[i].charAt(0) == letra)
                return i;
        }
        return -1;
    }
}
