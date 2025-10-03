package com.calabozo.mapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calabozo.mapa.model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

    // Ya ta

}
