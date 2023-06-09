package clase6;
import java.util.*;
public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Integer cantidadJugadas = 3;
        Boolean continuarJuego = true;
        Scanner ingresarDato = new Scanner(System.in);
        Integer opcionJugador, opcionPc;
        Integer victoriasJugador = 0;
        Integer victoriasPc = 0;
        while(continuarJuego) {
            System.out.println("Elija una jugada\n"
                    + "1. Piedra\n"
                    + "2. Papel\n"
                    + "3. Tijera\n");
            opcionJugador = ingresarDato.nextInt();
            opcionPc = ((int)(Math.random() * 3) + 1);

            switch(opcionJugador) {
                case 1:
                    if (opcionJugador == opcionPc) {
                        System.out.println("Haz jugado Piedra, y la computadora jugo Piedra, es un emplate!!\n");
                        cantidadJugadas--;
                    } else if (opcionPc == 2) {
                        System.out.println("Haz jugado Piedra, y la computadora Papel, gano la computadora!!\n");
                        victoriasPc++;
                        cantidadJugadas--;
                    } else {
                        System.out.println("Haz jugado Piedra, y la computadora juego Tijera, Haz ganado!!\n");
                        victoriasJugador++;
                        cantidadJugadas--;
                    }
                    break;
                case 2:
                    if (opcionJugador == opcionPc) {
                        System.out.println("Haz jugado Papel, y la computadora jugo Papel, es un emplate!!\n");
                        cantidadJugadas--;
                    } else if (opcionPc == 3) {
                        System.out.println("Haz jugado Papel, y la computadora Tijera, gano la computadora!!\n");
                        victoriasPc++;
                        cantidadJugadas--;
                    } else {
                        System.out.println("Haz jugado Papel, y la computadora juego Piedra, Haz ganado!!\n");
                        victoriasJugador++;
                        cantidadJugadas--;
                    }
                    break;
                case 3:
                    if (opcionJugador == opcionPc) {
                        System.out.println("Haz jugado Tijera, y la computadora jugo Tijera, es un emplate!!\n");
                        cantidadJugadas--;
                    } else if (opcionPc == 1) {
                        System.out.println("Haz jugado Tijera, y la computadora Piedra, gano la computadora!!\n");
                        victoriasPc++;
                        cantidadJugadas--;
                    } else {
                        System.out.println("Haz jugado Tijera, y la computadora juego Papel, Haz ganado!!\n");
                        victoriasJugador++;
                        cantidadJugadas--;
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta, vuelve a elegir!!\n");

            }
            if (cantidadJugadas == 0 || victoriasJugador == 2 || victoriasPc == 2)
                continuarJuego = false;
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
