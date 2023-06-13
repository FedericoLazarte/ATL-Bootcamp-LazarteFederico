package clase6;
import java.util.*;
public class PiedraPapelTijeras {
    public static boolean ganoJugador (String eleccionJugador, String eleccionPc) {
        boolean ganoJugador = false;
       switch(eleccionJugador) {
           case "piedra":
               if (eleccionPc == "tijeras")
                   ganoJugador = true;
               break;
           case "papel":
               if (eleccionPc == "piedra")
                   ganoJugador = true;
               break;
           case "tijeras":
               if(eleccionPc == "papel")
                   ganoJugador = true;
               break;
       }
       return ganoJugador;
    }

    public static void main(String[] args) {
        Integer cantidadJugadas = 3;
        Scanner ingresarDato = new Scanner(System.in);
        Integer opcionJugador;
        Integer opcionPc;
        Integer victoriasJugador = 0;
        Integer victoriasPc = 0;
        String[] jugada = {"piedra", "papel", "tijeras"};

        while (cantidadJugadas > 0) {
            System.out.println("Elija una jugada\n"
                    + "1. Piedra\n"
                    + "2. Papel\n"
                    + "3. Tijera\n");
            opcionJugador = ingresarDato.nextInt();
            opcionPc = ((int) (Math.random() * 3) + 1);
            while (opcionJugador < 1 || opcionJugador > 3) {
                System.out.println("Opción incorrecta, tiene que ingresar la opción 1, 2 o 3, vuelva a intentarlo\n");
                System.out.println("Elija una jugada\n"
                        + "1. Piedra\n"
                        + "2. Papel\n"
                        + "3. Tijera\n");
                opcionJugador = ingresarDato.nextInt();
            }
            if(jugada[opcionJugador - 1].equals(jugada[opcionPc -1])) {
                System.out.println("Jugaste: " + jugada[opcionJugador - 1] + " y la computadora jugo: " + jugada[opcionPc - 1] + " hubo un empate\n");
                cantidadJugadas--;
            } else {
                if (ganoJugador(jugada[opcionJugador - 1], jugada[opcionPc - 1])) {
                    System.out.println("Jugaste: " + jugada[opcionJugador - 1] + " y la computadora jugo: " + jugada[opcionPc - 1] + " ganaste está mano\n");
                    victoriasJugador++;
                    cantidadJugadas--;
                } else {
                    System.out.println("Jugaste: " + jugada[opcionJugador - 1] + " y la computadora jugo: " + jugada[opcionPc - 1] + " perdiste esta mano\n");
                    victoriasPc++;
                    cantidadJugadas--;
                }
            }
            if (victoriasJugador == 2 || victoriasPc == 2)
                cantidadJugadas = 0;
        }
        if (victoriasJugador > victoriasPc) {
            System.out.println("Haz ganado!!!");
        } else if (victoriasPc > victoriasJugador) {
            System.out.println("Gano la computadora");
        } else {
            System.out.println("Empate!!!");
        }
        ingresarDato.close();
    }
}
