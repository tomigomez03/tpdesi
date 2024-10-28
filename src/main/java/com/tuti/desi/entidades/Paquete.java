package com.tuti.desi.entidades;

import jakarta.persistence.*;

@Entity
public class Paquete {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ciudad_origen_id")
    private Ciudad ciudadOrigen;

    @ManyToOne
    @JoinColumn(name = "ciudad_destino_id")
    private Ciudad ciudadDestino;
    
	@Column
    private double peso; 
    
    @Column
    private int dniDespachante;

    @Column
    private int dniDestinatario;

    @Column
    private boolean esFragil;

    public Paquete() {	
	}
    
    
	public Paquete(Long id, Ciudad ciudadOrigen, Ciudad ciudadDestino, double peso, int dniDespachante,
		int dniDestinatario, boolean esFragil) {
		super();
		this.id = id;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.peso = peso;
		this.dniDespachante = dniDespachante;
		this.dniDestinatario = dniDestinatario;
		this.esFragil = esFragil;
	}
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getDniDespachante() {
		return dniDespachante;
	}

	public void setDniDespachante(int dniDespachante) {
		this.dniDespachante = dniDespachante;
	}

	public int getDniDestinatario() {
		return dniDestinatario;
	}

	public void setDniDestinatario(int dniDestinatario) {
		this.dniDestinatario = dniDestinatario;
	}

	public boolean isEsFragil() {
		return esFragil;
	}

	public void setEsFragil(boolean esFragil) {
		this.esFragil = esFragil;
	}  
    
}
