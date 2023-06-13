package clase8;

public class GeneradorContrasenia {
    public static String generarContrasenia() {
        String contrasenia = "";
        String caracter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?0123456789";
        for(int i = 0; i < 8; i++) {
            int caracterRandom = (int) (Math.random() * caracter.length());
            contrasenia += caracter.charAt(caracterRandom);
        }
        return contrasenia;
    }

    public static void main(String[] args) {
        String nuevaContrasenia = generarContrasenia();
        System.out.println("Su contraseña es: " + nuevaContrasenia);
    }
}
