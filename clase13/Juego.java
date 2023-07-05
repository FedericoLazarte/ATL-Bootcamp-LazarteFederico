package clase13;

import java.util.*;
public class Juego {
    private static final int VIDA_BASE = 200;
    private static final int NIVEL_BASE = 1;

    public static Personaje crearGuerrero (String nombre) {
        return new Guerrero(nombre, NIVEL_BASE, VIDA_BASE);
    }

    public static Personaje crearMago (String nombre) {
        return new Mago(nombre, NIVEL_BASE, VIDA_BASE);
    }

    public static Personaje crearArquero (String nombre) {
        return new Arquero(nombre, NIVEL_BASE, VIDA_BASE);
    }

    public void eleccionPersonaje () {
        System.out.println("Eligue la clase que quieres ser:\n" +
                "1. Guerrero.\n" +
                "2. Mago.\n" +
                "3. Arquero.\n");
    }

    public void AccionesGuerrero () {
        System.out.println("Que acción quieres realizar?.\n" +
                "1. Atacar.\n" +
                "2. Curar.\n" +
                "3. Espadazo.\n" +
                "4. Aumentar daño.\n");
    }

    public void AccionesMago () {
        System.out.println("Que acción quieres realizar?.\n" +
                "1. Atacar.\n" +
                "2. Curar.\n" +
                "3. Bola de fuego.\n" +
                "4. Cargar mana.\n");
    }

    public void AccionesArquero () {
        System.out.println("Que acción quieres realizar?.\n" +
                "1. Atacar.\n" +
                "2. Curar.\n" +
                "3. Triple flechazo.\n" +
                "4. Volverse invisible.\n");
    }
    public static void main(String[] args) {
        Juego juego = new Juego();

        Personaje personaje1 = juego.crearGuerrero("Guerrero1");
        Personaje personaje2 = juego.crearMago("Mago1");

        // Pelea hasta que uno muera
        while (personaje1.puntosDeVida > 0 && personaje2.puntosDeVida > 0) {
            System.out.println("Turno de: " + personaje1.nombre + "\n");
            juego.AccionesGuerrero();
            Scanner scanner = new Scanner(System.in);
            int opcionPersonaje1 = scanner.nextInt();
            switch (opcionPersonaje1) {
                case 1:
                    int danioPersonaje1 = personaje1.atacar();
                    personaje2.recibirDanio(danioPersonaje1);
                    System.out.println(personaje1.nombre + " ataca a " + personaje2.nombre + " y le causa " + danioPersonaje1 + " puntos de daño.\n");
                    break;
                case 2:
                    int puntosCuracionPersonaje1 = personaje1.curarse();
                    System.out.println(personaje1.nombre + " se cura " + puntosCuracionPersonaje1 + " puntos de vida.\n");
                    break;
                case 3:
                    int danioEspadazoPersonaje1 = ((Guerrero) personaje1).espadazo();
                    personaje2.recibirDanio(danioEspadazoPersonaje1);
                    System.out.println(personaje1.nombre + " ejecuta un espadazo contra " + personaje2.nombre + " y le causa " + danioEspadazoPersonaje1 + " puntos de daño.\n");
                    break;
                case 4:
                    ((Guerrero) personaje1).setBuffDanio(true);
                    System.out.println(personaje1.nombre + " aumenta su daño.\n");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.\n");
                    continue;
            }


            if (personaje2.puntosDeVida <= 0) {
                break;
            }
            System.out.println("Turno de: " + personaje2.nombre + "\n");
            juego.AccionesMago();
            int opcionPersonaje2 = scanner.nextInt();
            switch (opcionPersonaje2) {
                case 1:
                    int danioPersonaje2 = personaje2.atacar();
                    personaje1.recibirDanio(danioPersonaje2);
                    System.out.println(personaje2.nombre + " ataca a " + personaje1.nombre + " y le causa " + danioPersonaje2 + " puntos de daño.\n");
                    break;
                case 2:
                    int puntosCuracionPersonaje2 = personaje2.curarse();
                    System.out.println(personaje2.nombre + " se cura " + puntosCuracionPersonaje2 + " puntos de vida.\n");
                    break;
                case 3:
                    int danioBolaDeFuegoPersonaje2 = ((Mago) personaje2).bolaDeFuego();
                    personaje1.recibirDanio(danioBolaDeFuegoPersonaje2);
                    System.out.println(personaje2.nombre + " lanza una bola de fuego a " + personaje1.nombre + " y le causa " + danioBolaDeFuegoPersonaje2 + " puntos de daño.\n");
                    break;
                case 4:
                    ((Mago) personaje2).setMana(100);
                    System.out.println(personaje2.nombre + " carga su mana.\n");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.\n");
                    continue;
            }

            if (personaje1.puntosDeVida <= 0) {
                break;
            }
        }

        if (personaje1.puntosDeVida <= 0) {
            System.out.println(personaje1.nombre + " ha sido derrotado. " + personaje2.nombre + " ha ganado la pelea.");
        } else {
            System.out.println(personaje2.nombre + " ha sido derrotado. " + personaje1.nombre + " ha ganado la pelea.");
        }
    }
}
