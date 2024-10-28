package com.tuti.desi.entidades;

import jakarta.persistence.*;


@Entity
public class Camion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(unique = true, nullable = false)
    private String patente;
    
    @Column(nullable = false)
    private String marca;

    @ManyToOne
    @JoinColumn(name = "ciudad_actual", nullable = false)
    private Ciudad ciudadActual;
    
    @Column(nullable = false)
    private int modelo;

	
    public Camion() {
	}

	public Camion(Long id, String patente, String marca, Ciudad ciudadActual, int modelo) {
		super();
		this.id = id;
		this.patente = patente;
		this.marca = marca;
		this.ciudadActual = ciudadActual;
		this.modelo = modelo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Ciudad getCiudadActual() {
		return ciudadActual;
	}

	public void setCiudadActual(Ciudad ciudadActual) {
		this.ciudadActual = ciudadActual;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
    
    
}

