package com.calabozo.mapa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.calabozo.mapa.model.Ciudad;
import com.calabozo.mapa.repository.CiudadRepository;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @GetMapping("/eliminar/{id}")
    public String removeCity(@PathVariable Long id, RedirectAttributes redAttrib) {

        if (!ciudadRepository.existsById(id))
            redAttrib.addFlashAttribute("error", "La ciudad no Existe");
        else {
            ciudadRepository.deleteById(id);
            redAttrib.addFlashAttribute("success", "Se ha borrado Correctamente la ciudad con id " + id);
        }

        return "redirect:/ciudades";
    }

    @GetMapping("/nuevo")
    public String newCity(Model model) {

        // Creamos una ciudad para que el formulario
        // la asocie a sus datos
        Ciudad ciudad = new Ciudad();
        // La guardamos en el model para que le llegue al formulario
        model.addAttribute("ciudad", ciudad);
        // Cargamos la vista nuevaCiudad
        return "nuevaCiudad";
    }

}
