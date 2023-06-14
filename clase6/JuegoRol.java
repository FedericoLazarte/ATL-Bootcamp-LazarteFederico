package clase6;
import java.util.Scanner;

public class JuegoRol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean abrigado = false;
        boolean armado = false;

        System.out.println("Despiertas en un lugar desolado y sin nadie alrededor. El frío recorre tu piel.");
        System.out.println("Observas un pequeño cuarto. En una esquina inferior izquierda hay un abrigo junto a un montón de escombros.");
        System.out.println("En la esquina superior derecha, ves un bastón de madera. Frente a ti se encuentra la puerta para salir del cuarto.");
        System.out.println("¿Qué elección tomarás?");
        System.out.println("1. Tomas el abrigo.");
        System.out.println("2. Tomas el bastón de madera.");
        System.out.println("3. Sales del pequeño cuarto.");

        int eleccion1 = scanner.nextInt();

        if (eleccion1 == 1) {
            abrigado = true;
            System.out.println("Has tomado el abrigo. Te sientes más protegido del frío.");
        } else if (eleccion1 == 2) {
            armado = true;
            System.out.println("Has tomado el bastón de madera. Ahora tienes una arma improvisada.");
        } else {
            System.out.println("Sales del pequeño cuarto.");
        }

        System.out.println("Una vez fuera del cuarto, tienes tres caminos. ¿Hacia dónde te diriges?");
        System.out.println("1. Sigues derecho.");
        System.out.println("2. Giras a la izquierda.");
        System.out.println("3. Giras a la derecha.");

        int eleccion2 = scanner.nextInt();

        if (eleccion2 == 1) {
            System.out.println("Decides pelear con el goblin.");
            if (armado) {
                System.out.println("Gracias a tu arma, logras derrotar al goblin.");
                System.out.println("Tienes dos rutas disponibles:");
                System.out.println("1. Girar a la derecha: Sales del lugar peligroso y vuelves a casa.");
                System.out.println("2. Girar a la izquierda: Entras a un salón lleno de goblins y mueres masacrado.");
                int eleccion3 = scanner.nextInt();
                if (eleccion3 == 1) {
                    System.out.println("No estás lo suficientemente abrigado y mueres en el camino debido al frío.");
                } else {
                    System.out.println("Entras a un salón lleno de goblins y mueres masacrado.");
                }
            } else {
                System.out.println("No estás armado y el goblin te ataca ferozmente. Mueres en el enfrentamiento.");
            }
        } else if (eleccion2 == 2) {
            System.out.println("Decides girar a la izquierda. Es un lugar seguro y despejado.");
            System.out.println("Tienes tres opciones:");
            System.out.println("1. Ir por el medio.");
            System.out.println("2. Girar a la izquierda.");
            System.out.println("3. Girar a la derecha.");
            int eleccion3 = scanner.nextInt();
            if (eleccion3 == 1) {
                System.out.println("Al pisar una trampa, mueres.");
            } else if (eleccion3 == 2) {
                if (abrigado) {
                    System.out.println("Sales del lugar peligroso y logras llegar a salvo. ¡Has sobrevivido!");
                } else {
                    System.out.println("No estás lo suficientemente abrigado y mueres en el camino debido al frío.");
                }
            } else {
                System.out.println("Entras a un cuarto lleno de serpientes venenosas. Mueres por sus ataques.");
            }
        } else {
            System.out.println("Decides girar a la derecha. Ves el cielo y lo que parece ser una ciudad a lo lejos.");
            System.out.println("Hace mucho frío y hay posibilidad de enfermarte si no estás lo suficientemente abrigado.");
            if (abrigado) {
                System.out.println("Sigues adelante y llegas a la ciudad. ¡Has sobrevivido y llegado a tu destino!");
            } else {
                System.out.println("El frío te supera y mueres congelado en el camino hacia la ciudad.");
            }
        }
    }
}
