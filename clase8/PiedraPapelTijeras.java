package clase8;
import java.util.Scanner;
public class PiedraPapelTijeras {
    public static boolean ganoJugador (String eleccionJugador, String eleccionPc) {
        boolean ganoJugador = false;
        switch (eleccionJugador) {
            case "piedra" -> {
                if (eleccionPc.equals("tijeras"))
                    ganoJugador = true;
            }
            case "papel" -> {
                if (eleccionPc.equals("piedra"))
                    ganoJugador = true;
            }
            case "tijeras" -> {
                if (eleccionPc.equals("papel"))
                    ganoJugador = true;
            }
        }
       return ganoJugador;
    }

    public static void elGanadorEs (int puntosJugador, int puntosPc) {
        if (puntosJugador == puntosPc)
            System.out.println("Hubo un empate!!!!");
        else if(puntosJugador > puntosPc)
            System.out.println("Has Ganado!!!!!");
        else
            System.out.println("Perdiste!!!");
    }
    public static void main(String[] args) {
        int cantidadJugadas = 3;
        Scanner ingresarDato = new Scanner(System.in);
        int opcionJugador;
        int opcionPc;
        int victoriasJugador = 0;
        int victoriasPc = 0;
        String[] jugada = {"piedra", "papel", "tijeras"};

        while (cantidadJugadas > 0) {
            System.out.println("""
                    Elija una jugada
                    1. Piedra
                    2. Papel
                    3. Tijera
                    """);
            opcionJugador = ingresarDato.nextInt();
            opcionPc = ((int) (Math.random() * 3) + 1);
            while (opcionJugador < 1 || opcionJugador > 3) {
                System.out.println("Opción incorrecta, tiene que ingresar la opción 1, 2 o 3, vuelva a intentarlo\n");
                System.out.println("""
                        Elija una jugada
                        1. Piedra
                        2. Papel
                        3. Tijera
                        """);
                opcionJugador = ingresarDato.nextInt();
            }
            if(jugada[opcionJugador - 1].equals(jugada[opcionPc -1])) {
                System.out.println("Jugaste: " + jugada[opcionJugador - 1] + " y la computadora jugo: " + jugada[opcionPc - 1] + " hubo un empate\n");
            } else {
                if (ganoJugador(jugada[opcionJugador - 1], jugada[opcionPc - 1])) {
                    System.out.println("Jugaste: " + jugada[opcionJugador - 1] + " y la computadora jugo: " + jugada[opcionPc - 1] + " ganaste está mano\n");
                    victoriasJugador++;
                } else {
                    System.out.println("Jugaste: " + jugada[opcionJugador - 1] + " y la computadora jugo: " + jugada[opcionPc - 1] + " perdiste esta mano\n");
                    victoriasPc++;
                }
            }
            cantidadJugadas--;
            if (victoriasJugador == 2 || victoriasPc == 2)
                cantidadJugadas = 0;
        }
        elGanadorEs(victoriasJugador, victoriasPc);
        ingresarDato.close();
    }
}
