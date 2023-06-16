package clase6;
import java.util.*;
public class LlamarWsp {
    public static void main(String[] args) {
        String numTel;
        Scanner ingresoDato = new Scanner(System.in);
        System.out.println("Ingrese número que desea llamar: ");
        numTel = ingresoDato.nextLine();
        System.out.println("Link llamada por whatsapp: " + llamarWsp(numTel));
    }

    public static String llamarWsp (String numTel) {
        return "https://api.whatsapp.com/send?phone=" + numTel;
    }
}
