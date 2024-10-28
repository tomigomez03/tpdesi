package com.tuti.desi.accesoDatos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuti.desi.entidades.Provincia;

public interface ProvinciaRepository extends JpaRepository<Provincia, Long> {
	
}

