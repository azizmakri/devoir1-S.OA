package com.aziz.motos.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Moto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMoto;
	private String marqieMoto;
	private Double prixMoto;
	private Date dateCreation;
	
	
	
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Moto(String marqieMoto, Double prixMoto, Date dateCreation) {
		super();
		this.marqieMoto = marqieMoto;
		this.prixMoto = prixMoto;
		this.dateCreation = dateCreation;
	}


	public Long getIdMoto() {
		return idMoto;
	}
	public void setIdMoto(Long idMoto) {
		this.idMoto = idMoto;
	}
	public String getMarqieMoto() {
		return marqieMoto;
	}
	public void setMarqieMoto(String marqieMoto) {
		this.marqieMoto = marqieMoto;
	}
	public Double getPrixMoto() {
		return prixMoto;
	}
	public void setPrixMoto(Double prixMoto) {
		this.prixMoto = prixMoto;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	@Override
	public String toString() {
		return "Moto [idMoto=" + idMoto + ", marqieMoto=" + marqieMoto + ", prixMoto=" + prixMoto + ", dateCreation="
				+ dateCreation + "]";
	}
	
	

}
