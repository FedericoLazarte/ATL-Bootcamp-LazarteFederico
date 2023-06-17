package clase9;

import java.util.Scanner;

public class Busqueda {
    static final String[]  LISTADO_DE_PERSONAS = {"Federico Lazarte", "Julian Perez", "Anahi Fernandez", "Federico Lopez"};
    public static void  busquedaPersona (String nombrePersona) {
        System.out.println("Resultados: ");
        for(String persona : LISTADO_DE_PERSONAS) {
            if (persona.toLowerCase().contains(nombrePersona.toLowerCase()))
                System.out.println(persona);
        }
    }

    public static void main(String[] args) {
        String nombrePersona;
        Scanner ingresarNombre = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        nombrePersona = ingresarNombre.nextLine();
        busquedaPersona(nombrePersona);
    }
}
