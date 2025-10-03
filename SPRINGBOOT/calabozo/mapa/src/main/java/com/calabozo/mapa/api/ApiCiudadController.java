package com.calabozo.mapa.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calabozo.mapa.model.Ciudad;
import com.calabozo.mapa.repository.CiudadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/ciudades")
public class ApiCiudadController {

    @Autowired
    private CiudadRepository ciudadRepository;

    // Punto de acceso para peticiones GET de /api/ciudad
    // devolverá un json con todas las ciudades
    @GetMapping
    public List<Ciudad> getAllCiudades() {
        // Usando el metodo FindAll sacamos todos los registros de la entidad
        // Asociada y los devolvemos como una lista
        // Al ser un restController se convertira a json
        return ciudadRepository.findAll();
    }

}
