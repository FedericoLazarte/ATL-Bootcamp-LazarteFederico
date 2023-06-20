package com.busqueda.busquedaPorNombre;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class BusquedaController {
    static List<String> personas = new LinkedList<>();

    @GetMapping("/busqueda-nombre/{buscarNombre}")
    public static List<String> busquedaPorNombre (@PathVariable String buscarNombre) {
        List<String> resultadosNombre = new LinkedList<>();
        for(String nombre : personas) {
            if (nombre.toLowerCase().contains(buscarNombre.toLowerCase()))
                resultadosNombre.add(nombre);
        }
        return resultadosNombre;
    }

    @GetMapping("/agregar-persona/{nombrePersona}")
    public static void agregarPersona (@PathVariable String nombrePersona) {
        personas.add(nombrePersona.toLowerCase());
    }

    @GetMapping("/quitar-persona/{nombrePersona}")
    public static void quitarPersona (@PathVariable String nombrePersona) {
        personas.remove(nombrePersona.toLowerCase());
    }

    @GetMapping("/mostrar-personas")
    public static List<String> mostrarListadoPersonas() {
        return personas;
    }
}
