package com.calabozo.mapa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.calabozo.mapa.model.Ciudad;
import com.calabozo.mapa.repository.CiudadRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ciudades")
public class cityController {

    @Autowired
    private CiudadRepository ciudadRepository;

    @GetMapping
    public String listCities(Model model) {

        // Cargamos todas las ciudades de BD
        List<Ciudad> listaCiudades = ciudadRepository.findAll();

        // Cargamos en model los datos de la lista de ciudades para que
        // le llegue a la pagina web destino (vista)
        model.addAttribute("ciudades", listaCiudades);

        return "listaCiudades";

    }

}
