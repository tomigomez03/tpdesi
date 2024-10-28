package com.tuti.desi.accesoDatos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuti.desi.entidades.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
	
}
