package com.autocompletar.autocompletar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class BusquedaController {
    static final String[] RESULTADOS = {"Curso Python", "Electrodomesticos", "Curso Ingles", "Fundamentos programacion", "Curso Java"};

    @GetMapping("/busqueda-usuario/{busqueda}")
    public static List<String> obtenerPalabrasAutocompletar (@PathVariable String busqueda) {
      List<String> busquedaResultados = new LinkedList<>();
      for(String elemento : RESULTADOS) {
          if (elemento.toLowerCase().contains(busqueda.toLowerCase()))
              busquedaResultados.add(elemento);
      }
      return busquedaResultados;
    }

}
