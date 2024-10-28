package com.tuti.desi.accesoDatos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuti.desi.entidades.Camion;

public interface CamionRepository extends JpaRepository<Camion, Long> { 
	
}

