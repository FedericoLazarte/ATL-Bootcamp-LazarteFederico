import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerarContraseniaSpring {
    @GetMapping("/generar-clave")
    public static String generarContrasenia() {
        String contrasenia = "";
        String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?0123456789";
        for(int i = 0; i < 8; i++) {
            int caracterRandom = (int) (Math.random() * caracter.length());
            contrasenia += caracter.charAt(caracterRandom);
        }
        return contrasenia;
    }
}
