package clase12;
import java.util.*;
public class AmigoInvisible {
    public static void main(String[] args) {
        int cantidadParticipantes;
        int pos = 0;
        List<String> participantes = new ArrayList<>();
        List<String> participantesQueSonAmigosInvisiblesDeAlguien = new ArrayList<>();
        Scanner ingresarDato = new Scanner(System.in);
        System.out.println("Cuántas personas participarán?");
        cantidadParticipantes = ingresarDato.nextInt();
        ingresarParticipante(cantidadParticipantes, participantes, ingresarDato);


        while (participantesQueSonAmigosInvisiblesDeAlguien.size() != participantes.size()) {
            String amigoInvisible = obtenerAmigoInvisible(participantes, participantes.get(pos));
            if (!yaEsElAmigoInvisibleDeAlguienMas(participantesQueSonAmigosInvisiblesDeAlguien, amigoInvisible)) {
                System.out.println(participantes.get(pos)  + " su amigo invisible es: " + amigoInvisible);
                pos++;
                participantesQueSonAmigosInvisiblesDeAlguien.add(amigoInvisible);
                System.out.println("Presione enter para continuar");
                ingresarDato.nextLine();
            }
        }
    }

    public static String obtenerAmigoInvisible (List<String> participantes, String participanteActual) {
        int participanteRandom = (int) (Math.random() * participantes.size());
        int posParticipanteActual = participantes.indexOf(participanteActual);
        while (participanteRandom == posParticipanteActual)
            participanteRandom = (int) (Math.random() * participantes.size());
        return participantes.get(participanteRandom);
    }
    public static void ingresarParticipante (int cantidadParcipantes, List<String> listaParticipantes, Scanner ingresarDato) {
        ingresarDato.nextLine();
        String nombreParticipante;
        for(int i = 0; i < cantidadParcipantes; i++) {
            System.out.println("Ingrese nombre del participante");
            nombreParticipante = ingresarDato.nextLine();
            listaParticipantes.add(nombreParticipante);
        }
    }

    public static boolean yaEsElAmigoInvisibleDeAlguienMas (List<String> participantes, String nombre) {
        if (participantes.size() == 0)
            return false;
        for(String participante : participantes) {
            if (participante.equalsIgnoreCase(nombre))
                return true;
        }
        return false;
    }
}
